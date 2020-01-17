package application;

import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão ocupados?");
		int quantOcupado = sc.nextInt();
		System.out.println("-----------------------------");
		
		Dados[] dados = new Dados[10];
		
		System.out.println("Digite os dados para cadastro: ");
		
		for(int i=0; i<quantOcupado; i++) {
			System.out.print("Nome:");
			String name = sc.next();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Numero do quarto: ");
			int roomNumber = sc.nextInt();
			
			while(roomNumber > 9 || roomNumber < 0) {
				System.out.print("NUMERO INVALIDO! Digite outro quarto: ");
				roomNumber = sc.nextInt();
			}
			
			dados[roomNumber] = new Dados(name, email, roomNumber);
		}
		
		System.out.println("-----------------------------");
		System.out.println("Quartos ocupados: ");
		
		for(int i=0; i<dados.length; i++) {
			if(dados[i] != null) {
				System.out.println( dados[i].getRoomNumber() + 
						": " + dados[i].getName() +
						", " + dados[i].getEmail());
			}
		}
		
		sc.close();
	}
}

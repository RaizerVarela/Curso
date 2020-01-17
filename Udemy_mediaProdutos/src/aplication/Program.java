package aplication;

import java.util.Scanner;

import entitties.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: ");
		int number = sc.nextInt();
		Product[] vet = new Product[number];
		
		System.out.println("Digite os dados dos produtos: ");
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			
			vet[i] = new Product(name, price);
		}
		
		double soma = 0;
		
		for(int i = 0; i < vet.length; i++) {
			soma += vet[i].getPrice();
		}
		
		double media = soma/number;
		System.out.printf("Media de preço dos produtos = %.2f%n" , media);
		
		sc.close();
	}
}

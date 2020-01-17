package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Digite a quantidade de funcionarios a serem cadastrados: ");
		int quantFunc = sc.nextInt();
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Digite os dados dos fucionarios: ");
		
		for(int i=0; i<quantFunc; i++) {
			System.out.println("id: ");
			int id = sc.nextInt();
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			
			list.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println();
		System.out.print("Entre com o ID do funcionario que recebera aumento: ");
		int id = sc.nextInt();
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("ID informado nao existe!");
		}
		else {
			System.out.print("Entre com uma porcentagem: ");
			double porcentagem = sc.nextDouble();
			emp.aumento(porcentagem);
		}
		
		for(Funcionario func: list) {
			System.out.println(func.getSalario());
		}
		
		//for(Funcionario func: list) {
		//	while(func.getId() == ) {}
		//}
		
		sc.close();
	}
}

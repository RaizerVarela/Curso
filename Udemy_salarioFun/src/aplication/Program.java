package aplication;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite seu nome: ");
		funcionario.name = sc.next();
		System.out.println("Digite seu salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Digite o aumento em porcentagem: ");
		funcionario.porcentagem = sc.nextDouble();
		
		System.out.println(funcionario.name + " tem um salario liquido de, " + funcionario.liquido());
		System.out.println("Seu aumento no salario bruto fica em, " + funcionario.aumento());
		
		sc.close();
	}
}

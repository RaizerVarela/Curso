package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		String holder = sc.next();
		System.out.println("Are have any deposit (y/n)? ");
		char res = sc.next().charAt(0);
		if(res == 'y') {
			System.out.println("Enter with deposit: ");
			double value = sc.nextDouble();
			conta = new Conta(holder, number, value);
		} else {
			conta = new Conta(holder, number);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposito(depositValue);
		System.out.println("Update acconut data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withDraw = sc.nextDouble();
		conta.saque(withDraw);
		System.out.println("Update acconut data: ");
		System.out.println(conta);
		
		sc.close();
	}
}

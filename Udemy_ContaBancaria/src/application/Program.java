package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.next();
		sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		sc.nextLine();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			acc.wihDraw(amount);
			System.out.println("New balance: " + acc.getBalance());
		} catch (DomainException e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}
}

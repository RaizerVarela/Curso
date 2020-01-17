package application;

import java.text.DecimalFormat;

import java.util.Scanner;

import controller.Conversor;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conversor conversor = new Conversor();
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite o preço do dolar: ");
		conversor.price = sc.nextDouble();
		System.out.println("Digite a quntidade de dolar a ser comprado: ");
		conversor.value = sc.nextDouble();
		
		System.out.println("O valor a ser pago sera: " + df.format(conversor.PrecoFinal()));
		
		sc.close();
	}
}

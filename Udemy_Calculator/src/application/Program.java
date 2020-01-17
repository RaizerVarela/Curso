package application;

import java.text.DecimalFormat;

import java.util.Scanner;

import controller.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Informe o valor do raio: ");
		Calculator cal = new Calculator(sc.nextDouble());
		
		System.out.println("O valor da circunferencia é: " + cal.CalculaCirc());
		System.out.println("O valor do volume da esfera é: " + cal.CalculaVol());
		System.out.println("O valor utilizado de Pi foi: " + df.format(cal.PI));
		
		sc.close();
	}
}

package aplication;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite o lado do retangulo: ");
		retangulo.lado = sc.nextDouble();
		System.out.println("Digite a altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("A area do retangulo corresponde a: " + retangulo.area());
		System.out.println("O perimetro do retangulo correspode a: " + retangulo.perimetro());
		System.out.println("Ja sua diagonal corresponde a: " + retangulo.diagonal());
		
		sc.close();
	}
}

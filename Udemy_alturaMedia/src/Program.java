import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quandidade de alturas a serem comparadas: ");
		int n = sc.nextInt();
		
		double [] vet = new double[n];
		double soma = 0;
		
		System.out.println("Digite as alturas: ");
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
	
			soma += vet[i];
		}
		
		double media = soma/n;
		System.out.println("A media das alturas é: " + media);
		
		sc.close();
	}
}

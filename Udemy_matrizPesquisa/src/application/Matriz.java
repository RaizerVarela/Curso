package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int matriz[][];
		
		System.out.println("Digite o numero de linhas da matriz: ");
		int mL = sc.nextInt();
		System.out.println("Digite o numero de colunas da matriz: ");
		int mC = sc.nextInt();
		
		matriz = new int[mL][mC];
		
		System.out.println("Preencha a matriz: ");
		
		for(int i=0; i<mL; i++) {
			for(int j=0; j<mC; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o numero desejado: ");
		int numero = sc.nextInt();
		
		int procura = 0;
		int conta = 0;
		
		while(procura != numero) {
			for(int i=0; i<mL; i++) {
				for(int j=0; j<mC; j++) {
					if(matriz[i][j] == numero) {
						int j1 = j;
						int i1 = i;
						System.out.println("Posição: " + i1++ + ", " + j1++);
						if(j != 0) {
							System.out.println("Esqueda: " + matriz[i][j-1]);
						}else {
							System.out.println("Esquerda: Null");
						}
						if(j != mC-1) {
							System.out.println("Direita: " + matriz[i][j+1]);
						}else {
							System.out.println("Direita: Null");
						}
						if(i != 0) {
							System.out.println("Cima: " + matriz[i-1][mC-(mC-j)]); // cima	
						}else {
							System.out.println("Cima: Null");
						}
						if(i != mL-1) {
							System.out.println("Baixo: " + matriz[i+1][mC-(mC-j)]); // baixo	
						}else {
							System.out.println("Baixo: Null");
						}
						conta++;
					}
				}
			}
			if(conta > 0) {
				procura = numero;
				System.out.println("O numero se repete " + conta + " vezes.");
			}else {
				System.out.println("Numero digitado inesistente! Digite outro: ");
				numero = sc.nextInt();
			}
		}
		sc.close();
	}
}

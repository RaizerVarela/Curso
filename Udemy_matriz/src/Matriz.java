import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz;
		int numNeg = 0;
		
		System.out.println("Digite as dimenções da matriz com um numero inteiro: ");
		int m = sc.nextInt();
		matriz = new int [m][m];
		
		System.out.println("Carregue a matriz: ");
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				
				matriz [i][j] = sc.nextInt();
				if(matriz[i][j] < 0) {
					numNeg += 1;
				}
			}
		}
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println(matriz[i][i]);
		}
		
		System.out.println("Quantidade de numeros negativos: " + numNeg);
		
		sc.close();
	}
}

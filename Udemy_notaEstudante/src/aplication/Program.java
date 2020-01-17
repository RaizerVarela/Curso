package aplication;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.println("Digite o nome do aluno: ");
		student.aluno = sc.next();
		System.out.println("Digite as tres notas do aluno: ");
		for (int i = 0; i < 3; i++) {
			student.notas += sc.nextInt();
		}

		student.resultado();

		sc.close();
	}
}

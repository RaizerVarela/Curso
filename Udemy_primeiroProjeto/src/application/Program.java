package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Trabalhador;
import entitiesEnum.NivelTrabalhador;

public class Program {

	public static void main(String[] agrs) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.next();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.next();
		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.next();
		System.out.print("Salario base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos tera o trabalhador: ");
		int numero = sc.nextInt();
		
		for(int i =1; i<numero; i++) {
			System.out.println("Entrec com os dados do contrato " + i + ": ");
			System.out.print("Data (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (Horas): ");
			int horas = sc.nextInt();
			ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorPorHora, horas);
			trabalhador.adicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com mes e ano para calcular o salario (MM/YYYY): ");
		String mesAno = sc.next();
		
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Name: " + trabalhador.getNome());
		System.out.println("Department: " + trabalhador.getDepartamento().getNome());
		System.out.println("Income for " + mesAno + ": " + String.format("%.2f", trabalhador.salarioC(ano, mes)));
		
		sc.close();
	}
}

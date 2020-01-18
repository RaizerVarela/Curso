package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entitiesEnum.NivelTrabalhador;

public class Trabalhador {

	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoPorHora> contrato = new ArrayList<>();
	
	public Trabalhador(){
		
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContrato() {
		return contrato;
	}
	
	public void adicionarContrato(ContratoPorHora contrato) {
		this.contrato.add(contrato);
	}
	
	public void removeContrato(ContratoPorHora contrato) {
		this.contrato.remove(contrato);
	}
	
	public double salarioC(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(ContratoPorHora c : contrato) {
			cal.setTime(c.getData());
			int cAno = cal.get(Calendar.YEAR);
			int cMes = cal.get(Calendar.MONTH);
			if(cAno == ano && cMes == mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}

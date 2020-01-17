package entities;

public class Retangulo {

	public double lado;
	public double altura;
	private double dados;
	
	public double area() {
		this.dados = this.altura * this.lado;
		return dados;
	}
	
	public double perimetro() {
		this.dados = this.altura * 2 + this.lado * 2;
		return dados;
	}
	
	public double diagonal() {
		this.dados = Math.sqrt(this.lado) + Math.sqrt(this.altura); 
		return dados;
	}
}

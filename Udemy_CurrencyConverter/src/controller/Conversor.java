package controller;

public class Conversor {

	public double price;
	public double value;
	private final double iof = 1.06;
	
	public double PrecoFinal() {
		double preco = price * value * iof;
		return preco;
	}
}

package controller;

public class Calculator {

	public final double PI;
	private double raio;

	public Calculator(double raio) {
		PI = 3.14159;
		this.raio = raio;
	}
	
	public double CalculaCirc() {
		double circ = PI * (raio * 2);
		return circ;
	}
	
	public double CalculaVol() {
		double vol = 4/3 * PI * Math.pow(raio, 2);
		return vol;
	}
}

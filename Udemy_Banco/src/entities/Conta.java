package entities;

public class Conta {

	private String nome;
	private int numero;
	private double valor;
	
	public Conta(String nome, int numero, double valor) {
		this.nome = nome;
		this.numero = numero;
		deposito(valor);
	}
	
	public Conta(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void deposito(double valorDeposito) {
		this.valor += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		this.valor -= valorSaque + 5;
	}
	
	public String toString() {
		return "Account: "
				+ numero
				+ ", Holder: "
				+ nome
				+ ", Balance: $"
				+ String.format("%.2f", valor);
	}
}

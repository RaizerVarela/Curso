package entities;

public class Funcionario {

	public String name;
	public double salarioBruto;
	public double porcentagem;
	public double dados;
	/*public double[] taxa;
	
	private double[] taxa() {
		this.taxa = new double [4];
		for(int i=0; i <= this.taxa.length; i++) {
			this.taxa[i] = 1903.98;
		}
		return taxa;
	}*/
	
	public double liquido() {
		dados = this.salarioBruto;
		if(this.salarioBruto > 1903.98 && this.salarioBruto <= 2826.65) {
			dados = this.salarioBruto - 0.075 * this.salarioBruto;
		}else if(this.salarioBruto <= 3751.05) {
			dados = this.salarioBruto - 0.15 * this.salarioBruto;
		}else if(this.salarioBruto <= 4664.68) {
			dados = this.salarioBruto - 0.225 * this.salarioBruto;
		}else {
			dados = this.salarioBruto - 0.275 * this.salarioBruto;
		}
		
		return dados;
	}
	
	public double aumento() {
		dados = (porcentagem / 100 + 1) * salarioBruto;
		return dados;
	}
	
	
	
	
}

package entities;

public class Student {

	public int notas;
	public String aluno;
	private int resto;
	
	public void resultado(){
		if(this.notas < 60) {
			this.resto = 60 - this.notas;
			System.out.println(this.aluno + " teve nota igual a: " + this.notas + "/ln Status: FAILED" + 
			"/ln Distancia da media: " + resto);
		}else {
			System.out.println(this.aluno + "teve nota igual a: " + this.notas + "/ln Status: PASS");
		}
	}
}

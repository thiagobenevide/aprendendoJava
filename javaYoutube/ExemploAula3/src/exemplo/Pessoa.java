package exemplo;

public class Pessoa {
	public String nome;
	private int matricula;
	
	
	public Pessoa(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
}

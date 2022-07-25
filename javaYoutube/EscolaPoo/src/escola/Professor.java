package escola;

public class Professor extends Pessoa {
	private String formacaoAcademica;
	private double salario;
	
	public Professor(String nome, int matricula, String formacaoAcademica, double salario) {
		super(nome, matricula);
		this.formacaoAcademica = formacaoAcademica;
		this.salario = salario;
	}
	
	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}
	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
}

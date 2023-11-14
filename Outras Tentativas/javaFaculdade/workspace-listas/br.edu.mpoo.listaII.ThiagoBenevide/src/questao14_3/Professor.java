package questao14_3;

public class Professor {
	private int matricula;
	private String diciplina;
		
	public Professor(int matricula, String diciplina) {
		super();
		this.matricula = matricula;
		this.diciplina = diciplina;
	}
	
	public void adicionarNotaPrimeiraVA(Aluno aluno, int nota, PrimeiraVA primeira) {
		primeira.setAluno(aluno);
		primeira.setDiciplina(this.getDiciplina());
		primeira.setNota(nota);
	}
	
	public void adicionarNotaSegundaVA(Aluno aluno, int nota, SegundaVA segunda) {
		segunda.setAluno(aluno);
		segunda.setDiciplina(this.getDiciplina());
		segunda.setNota(nota);
	}
	
	public void adicionarNotaTerceiraVA(Aluno aluno, int nota, TerceiraVA terceira) {
		terceira.setAluno(aluno);
		terceira.setDiciplina(this.getDiciplina());
		terceira.setNota(nota);
	}
	
	public void adicionarNotaFinal(Aluno aluno, int nota, Final finalVA) {
		finalVA.setAluno(aluno);
		finalVA.setDiciplina(this.getDiciplina());
		finalVA.setNota(nota);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	
	
}

package questao14_3;

public abstract class Provas {
	private Aluno aluno;
	private Professor professor;
	private String diciplina;
	private double nota;
	
	

	public Provas(Aluno aluno, Professor professor, double nota) {
		super();
		this.aluno = aluno;
		this.professor = professor;
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}

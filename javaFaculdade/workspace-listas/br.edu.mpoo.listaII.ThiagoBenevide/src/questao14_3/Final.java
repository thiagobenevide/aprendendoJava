package questao14_3;

public class Final extends Provas{

	
	
	public Final(Aluno aluno, Professor professor, double nota) {
		super(aluno, professor, nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Final"+ ", getDiciplina()=" + getDiciplina() + ", getNota()=" + getNota()
				+ "]";
	}

	
	
}

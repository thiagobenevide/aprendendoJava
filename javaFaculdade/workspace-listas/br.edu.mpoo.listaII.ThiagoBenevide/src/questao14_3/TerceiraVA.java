package questao14_3;

public class TerceiraVA extends Provas{
	
	public TerceiraVA(Aluno aluno, Professor professor, double nota) {
		super(aluno, professor, nota);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TerceiraVA  "+ "getDiciplina()=" + getDiciplina() + ", getNota()=" + getNota()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	
	
}

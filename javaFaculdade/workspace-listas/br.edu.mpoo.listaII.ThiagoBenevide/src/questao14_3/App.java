package questao14_3;

public class App {

	public static void main(String[] args) {
		Aluno a1=new Aluno(1, "Thiago");
		Professor p1 = new Professor(12212, "José");
		PrimeiraVA va1 = new PrimeiraVA(a1, p1, 1);
		
		p1.adicionarNotaPrimeiraVA(a1, 7, va1);
		
		
		
		
	}
	
	
	
}


public class App {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Erick", "12356");
		
		BaseDados.createBase();
		
		BaseDados.adicionarAluno(aluno1);
		BaseDados.notaPrimeiraVa(aluno1, (float) 10.0);
		BaseDados.notaSegundaVa(aluno1, (float) 4.0);
		BaseDados.notaTerceiraVa(aluno1, (float) 2.0);
		BaseDados.calculoMedia(aluno1);
		
		aluno1 = null;
		System.gc();
	}
}

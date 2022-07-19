import java.util.ArrayList;

public class BaseDados {
	
	static ArrayList<Aluno> alunos;
	
	public static void createBase() {
		
		alunos = new ArrayList<Aluno>();
	}
	
	public static boolean adicionarAluno(Aluno aluno) {
		if(aluno == null  || aluno.getNome()==null || aluno.getMatricula()==null) {
			return false;
		}
		for (int i=0; i < alunos.size(); i++)
			if(alunos.get(i).getNome().equalsIgnoreCase(aluno.getNome()))
				return false;
		System.out.println("Aluno adicionado com sucesso!");
		return alunos.add(aluno);
	}

	public static boolean notaPrimeiraVa(Aluno aluno, float primeiraVa) {
		

		for (Aluno alunoCurrent: alunos)
			if(alunoCurrent.getNome().equalsIgnoreCase(aluno.getNome())) {
				alunoCurrent.setPrimeiraVa(primeiraVa);
				System.out.println("Nota da primeira VA adicionada com sucesso!");
				return true;
				}
		System.out.println("Aluno não encontrado!");
		return false;
		}
	
	public static boolean notaSegundaVa(Aluno aluno, float segundaVa) {
		

		for (Aluno alunoCurrent: alunos)
			if(alunoCurrent.getNome().equalsIgnoreCase(aluno.getNome())) {
				alunoCurrent.setSegundaVa(segundaVa);
				System.out.println("Nota da segunda VA adicionada com sucesso!");
				return true;
				}
		System.out.println("Aluno não encontrado!");
		return false;
		}

	public static boolean notaTerceiraVa(Aluno aluno, float terceiraVa) {
		

		for (Aluno alunoCurrent: alunos)
			if(alunoCurrent.getNome().equalsIgnoreCase(aluno.getNome())) {
				alunoCurrent.setTerceiraVa(terceiraVa);
				System.out.println("Nota da terceira VA adicionada com sucesso!");
				return true;
				}
		System.out.println("Aluno não encontrado!");
		return false;
		}
	
	public static boolean calculoMedia(Aluno aluno) {
		

		for (Aluno alunoCurrent: alunos)
			if(alunoCurrent.getNome().equalsIgnoreCase(aluno.getNome())) {
				if(alunoCurrent.getPrimeiraVa() >= alunoCurrent.getSegundaVa() && alunoCurrent.getSegundaVa() >= alunoCurrent.getTerceiraVa()) {
					alunoCurrent.setMedia((alunoCurrent.getPrimeiraVa() + alunoCurrent.getSegundaVa())/2);
					if (alunoCurrent.getMedia() >= 7.0) {
						System.out.println("Aprovado!");
						return true;
						}
					else
						System.out.println("Precisa fazer a final!");
						return false;
				}
				else if (alunoCurrent.getPrimeiraVa() >= alunoCurrent.getSegundaVa() && alunoCurrent.getTerceiraVa() >= alunoCurrent.getSegundaVa()) {
					alunoCurrent.setMedia((alunoCurrent.getPrimeiraVa() + alunoCurrent.getTerceiraVa())/2);
					if (alunoCurrent.getMedia() >= 7.0) {
						System.out.println("Aprovado!");
						return true;						}
					else
						System.out.println("Precisa fazer a final!");
						return false;
				}
				else if (alunoCurrent.getSegundaVa() >= alunoCurrent.getPrimeiraVa() && alunoCurrent.getPrimeiraVa() >= alunoCurrent.getTerceiraVa()){
					alunoCurrent.setMedia((alunoCurrent.getPrimeiraVa() + alunoCurrent.getSegundaVa())/2);
					if (alunoCurrent.getMedia() >= 7.0) {
						System.out.println("Aprovado!");
						return true;						}
					else
						System.out.println("Precisa fazer a final!");
						return false;
				}
				else if (alunoCurrent.getSegundaVa() >= alunoCurrent.getTerceiraVa() && alunoCurrent.getTerceiraVa() >= alunoCurrent.getPrimeiraVa()) {
					alunoCurrent.setMedia((alunoCurrent.getSegundaVa() + alunoCurrent.getTerceiraVa())/2);
					if (alunoCurrent.getMedia() >= 7.0) {
						System.out.println("Aprovado!");
						return true;
				}
					else
						System.out.println("Precisa fazer a final!");
						return false;
				}
				else if (alunoCurrent.getTerceiraVa() >= alunoCurrent.getPrimeiraVa() && alunoCurrent.getPrimeiraVa() >= alunoCurrent.getSegundaVa()) {
					alunoCurrent.setMedia((alunoCurrent.getPrimeiraVa() + alunoCurrent.getTerceiraVa())/2);
					if (alunoCurrent.getMedia() >= 7.0) {
						System.out.println("Aprovado!");
						return true;						}
					else
						System.out.println("Precisa fazer a final!");
						return false;
				}
				else if (alunoCurrent.getTerceiraVa() >= alunoCurrent.getSegundaVa() && alunoCurrent.getSegundaVa() >= alunoCurrent.getPrimeiraVa()) {
					alunoCurrent.setMedia((alunoCurrent.getSegundaVa() + alunoCurrent.getTerceiraVa())/2);
					if (alunoCurrent.getMedia() >= 7.0) {
						System.out.println("Aprovado!");
						return true;						}
					else {
						System.out.println("Precisa fazer a final!");
						return false;}
				}
				}
		System.out.println("Aluno não encontrado!");
		return false;
	}
	
	public static boolean vaFinal(Aluno aluno, float vaFinal) {
		

		for (Aluno alunoCurrent: alunos)
			if(alunoCurrent.getNome().equalsIgnoreCase(aluno.getNome())) {
				alunoCurrent.setVafinal(vaFinal);
				System.out.println("Nota da final adicionada com sucesso!");
				if (alunoCurrent.getVafinal() > 5.0) {
					System.out.println("Aprovado!");
					return true;
				}
				else {
					System.out.println("Reprovado!");	
					return false;
				}
			}
			System.out.println("Aluno não encontrado!");
			return false;
		}
	
	
	public static void todosAlunos() {
		for (Aluno alunoCurrent: alunos) {
				System.out.println("-----------------------------");
				System.out.println("	   Aluno");				
				System.out.println("Nome: " + alunoCurrent.getNome());
				System.out.println("Matricula: " + alunoCurrent.getMatricula());
				System.out.println("Média: " + alunoCurrent.getMedia());
				System.out.println("-----------------------------");
			}
		}
	}

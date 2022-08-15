package questao14_3;

public class Aluno {
	private int matricula;
	private String nome;
	private Provas prova;
	private double maiorNota1;
	private double maiorNota2;
	

	public Aluno(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public String maioresNotas(double va1, double va2, double va3) {
		if (va1>va2 && va3>va2 && va1>va3) {
			this.setMaiorNota1(va1);
			this.setMaiorNota2(va3);
			String maiores = va1 + " " + va3;
			return maiores;
			
		}else if(va2>va1 && va3>va2 && va3>va1) {
			this.setMaiorNota1(va2);
			this.setMaiorNota2(va3);
			String maiores = va2 + " " + va3;
			return maiores;
		}else {
			this.setMaiorNota1(va1);
			this.setMaiorNota2(va2);
			String maiores = va1 + " " + va2;
			return maiores;
		}	
		
	}
	
	public double calcularMedia(double vaA, double vaB) {
		double media = (vaA+vaB)/2;
		return media;
	}
	
	
	public void situacaoAluno() {
		if(calcularMedia(this.maiorNota1, this.maiorNota2)<5.0) {
			System.out.println("Você precisa fazer a final");
		}else if(calcularMedia(this.maiorNota1, this.maiorNota2)>7.0) {
			System.out.println("Você está aprovado por média");
		}else {
			System.out.println("Vocês está reprovado");
		}
	}
	
	
	public double getMaiorNota1() {
		return maiorNota1;
	}

	public void setMaiorNota1(double maiorNota1) {
		this.maiorNota1 = maiorNota1;
	}

	public double getMaiorNota2() {
		return maiorNota2;
	}

	public void setMaiorNota2(double maiorNota2) {
		this.maiorNota2 = maiorNota2;
	}

	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Provas getProva() {
		return prova;
	}
	public void setProva(Provas prova) {
		this.prova = prova;
	}
	
	
	
	
	
}

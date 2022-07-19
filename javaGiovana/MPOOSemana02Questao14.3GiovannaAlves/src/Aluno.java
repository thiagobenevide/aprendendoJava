
public class Aluno {
		
	private String nome;
	private String matricula;
	private float primeiraVa;
	private float segundaVa;
	private float terceiraVa;
	private float vaFinal;
	private float media;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public float getPrimeiraVa() {
		return primeiraVa;
	}


	public void setPrimeiraVa(float primeiraVa) {
		this.primeiraVa = primeiraVa;
	}


	public float getSegundaVa() {
		return segundaVa;
	}


	public void setSegundaVa(float segundaVa) {
		this.segundaVa = segundaVa;
	}


	public float getTerceiraVa() {
		return terceiraVa;
	}


	public void setTerceiraVa(float terceiraVa) {
		this.terceiraVa = terceiraVa;
	}


	public float getVafinal() {
		return vaFinal;
	}


	public void setVafinal(float vafinal) {
		this.vaFinal = vafinal;
	}


	public float getMedia() {
		return media;
	}


	public void setMedia(float media) {
		this.media = media;
	}
	
}
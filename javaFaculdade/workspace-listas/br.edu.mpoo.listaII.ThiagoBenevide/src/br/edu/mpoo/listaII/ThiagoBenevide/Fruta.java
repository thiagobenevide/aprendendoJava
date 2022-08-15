package br.edu.mpoo.listaII.ThiagoBenevide;

public class Fruta {
	private String nome;
	private boolean casca;
	private boolean caroco;
	

	public Fruta(String nome, boolean casca, boolean caroco) {
		this.nome = nome;
		this.casca = casca;
		this.caroco = caroco;
	}	
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Fruta [nome=" + nome + ", casca=" + casca + ", caroco=" + caroco + "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isCasca() {
		return casca;
	}

	public void setCasca(boolean casca) {
		this.casca = casca;
	}

	public boolean isCaroco() {
		return caroco;
	}

	public void setCaroco(boolean caroco) {
		this.caroco = caroco;
	}
	
	
}

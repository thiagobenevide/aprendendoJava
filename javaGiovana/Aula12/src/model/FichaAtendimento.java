package model;

public class FichaAtendimento {
	
	private int numero;

	public FichaAtendimento() {
	}

	public void chamarProx() {
		numero++;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}

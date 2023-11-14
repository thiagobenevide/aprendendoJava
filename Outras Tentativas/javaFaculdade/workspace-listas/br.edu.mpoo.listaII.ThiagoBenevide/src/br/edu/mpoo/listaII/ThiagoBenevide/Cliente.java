package br.edu.mpoo.listaII.ThiagoBenevide;

public class Cliente {
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public boolean comerFruta(Fruta fruta) {
		return false;
	}
	
	public boolean eliminarFruta() {
		return false;
	}
	

	public boolean removerCaroco(Fruta fruta) {
		if (fruta.isCaroco()) {
			fruta.setCaroco(false);
			return false;
		}
		fruta.setCaroco(true);
		return true;
	
	}
	
	public boolean removerCasca(Fruta fruta) {
		if (fruta.isCasca()) {
			fruta.setCasca(false);
			return false;
		}
		fruta.setCasca(true);
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}

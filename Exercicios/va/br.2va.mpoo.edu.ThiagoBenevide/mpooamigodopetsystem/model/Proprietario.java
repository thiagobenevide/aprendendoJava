package model;

import java.util.ArrayList;

import app.App;

public class Proprietario extends Pessoa{
	public ArrayList<Animal>animais;
	private int brinde;
	
	public Proprietario(String nome, String cpf, String email, String fone) throws CPFException {
		super(nome, cpf, email, fone);
		animais = new ArrayList<Animal>();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public int getBrinde() {
		return brinde;
	}

	public void setBrinde(int brinde) {
		this.brinde = brinde;
	}

	
	
	
	
}

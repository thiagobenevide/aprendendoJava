package model_4;

import java.util.ArrayList;

public class Cliente extends Usuario {

	private ArrayList<Conta> contas;

	public Cliente(String cpf, String nome) {
		super(cpf, nome);
		this.contas = new ArrayList<Conta>();
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	@Override
	public String toString() {
		return "Cliente [contas=" + contas + ", getCpf()=" + getCpf() + ", getNome()=" + getNome() + "]";
	}
	
}

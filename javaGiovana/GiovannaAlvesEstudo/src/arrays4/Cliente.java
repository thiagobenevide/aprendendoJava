package arrays4;

import java.util.ArrayList;

public class Cliente extends Usuario {

	private ArrayList<Conta> contas;

	public Cliente(String cpf, String nome, String telefone, String email) {
		super(cpf, nome, telefone, email);
		this.contas = new ArrayList<>();
	}

	
	public ArrayList<Conta> getContas() {
		return contas;
	}


	@Override
	public String toString() {
		return "Cliente [contas=" + contas + "]";
	}
	
}

package model;

public class Cliente extends Pessoa {

	
	private boolean isReceivePropaganda;

	public Cliente(String nome, String cpf, String telefone, String email, String sexo, boolean isReceivePropaganda) {
		super(nome, cpf, telefone, email, sexo);
		this.isReceivePropaganda = isReceivePropaganda;
	}

	public boolean isReceivePropaganda() {
		return isReceivePropaganda;
	}

	@Override
	public String toString() {
		return "Cliente [isReceivePropaganda=" + isReceivePropaganda + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail() + ", getSexo()="
				+ getSexo() + "]";
	}
	
	
}

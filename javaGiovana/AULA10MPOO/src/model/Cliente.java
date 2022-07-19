package model;

public class Cliente extends UsuarioAbstract {

	private boolean isReceivePropaganda;

	public Cliente(String nome, String cpf, String telefone, String email, String sexo, boolean isReceivePropaganda) {
		super(nome, cpf, telefone, email, sexo);
		this.isReceivePropaganda = isReceivePropaganda;
	}

	public boolean isReceivePropaganda() {
		return isReceivePropaganda;
	}
	
	
}

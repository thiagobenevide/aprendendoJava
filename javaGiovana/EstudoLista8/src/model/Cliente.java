package model;

public class Cliente extends UsuarioAbstract {

	private boolean isReceivePropaganda;

	
	public Cliente(String login, String senha, String nome, String cpf, String telefone, String email, String sexo,
			boolean isReceivePropaganda) {
		super(login, senha, nome, cpf, telefone, email, sexo);
		this.isReceivePropaganda = isReceivePropaganda;
	}


	public boolean isReceivePropaganda() {
		return isReceivePropaganda;
	}
	
	
}

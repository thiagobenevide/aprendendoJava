package model;

public class Cliente2 extends UsuarioAbstract3{
	private boolean isReceivePropaganda;
	
	public Cliente2(String nome, String cpf, String telefone, String email, String senha) {
		super(nome, cpf, telefone, email, senha);
		// TODO Auto-generated constructor stub
	}

	public Cliente2(String nome, String cpf, String telefone, String email, String senha, boolean isReceivePropaganda) {
		super(nome, cpf, telefone, email, senha);
		this.isReceivePropaganda = isReceivePropaganda;
	}

	public boolean isReceivePropaganda() {
		return isReceivePropaganda;
	}

	public void setReceivePropaganda(boolean isReceivePropaganda) {
		this.isReceivePropaganda = isReceivePropaganda;
	}
	
	
	
	

	
	
}

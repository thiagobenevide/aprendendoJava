package entidades;

public class Cliente extends UsuarioAbstract {
	private boolean isReceivePropaganda;
	
	public Cliente(String nome, String cpf, String telefone, String email, boolean isReceivePropaganda) {
		super(nome, cpf, telefone, email);
		this.isReceivePropaganda = isReceivePropaganda;
	}

	public boolean isReceivePropaganda() {
		return isReceivePropaganda;
	}

	public void setReceivePropaganda(boolean isReceivePropaganda) {
		this.isReceivePropaganda = isReceivePropaganda;
	}
	
}

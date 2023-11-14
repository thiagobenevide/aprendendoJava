package entidade;

public class Cliente extends UsuarioAbstract{
	private boolean isRebecerOfertas;

	public Cliente(String nome, String cpf, String telefone, String email, boolean isReceberOfertas) {
		super(nome, cpf, telefone, email);
		this.isRebecerOfertas = isReceberOfertas;
	}

	public boolean isRebecerOfertas() {
		return isRebecerOfertas;
	}

	public void setRebecerOfertas(boolean isRebecerOfertas) {
		this.isRebecerOfertas = isRebecerOfertas;
	}
	
}

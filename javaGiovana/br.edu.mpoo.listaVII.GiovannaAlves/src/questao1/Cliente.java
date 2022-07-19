package questao1;

public class Cliente extends UsuarioAbstract {
	
	private boolean isReceivePropaganda;

	public Cliente(String nome, String cpf, String telefone, String email, boolean isReceivePropaganda) {
		super(nome, cpf, telefone, email);
		this.isReceivePropaganda = isReceivePropaganda;
	}

	public boolean isReceivePropaganda() {
		return isReceivePropaganda;
	}

	@Override
	public String toString() {
		return "Cliente [isReceivePropaganda=" + isReceivePropaganda + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail() + "]";
	}
	
}

package sistema.model;

public class NaoUsuario extends Pessoa{

	//regra de construtor: default versus n�o-default
	//	public NaoUsuario(){}
	public NaoUsuario(String nome, String cpf, String email) {
		super(nome, cpf, email);
	}
}

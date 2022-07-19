package questao9;

public class GerenteVendas extends Gerente {

	private String senha;

	public GerenteVendas(String nome, String cpf, String matricula, String senha) {
		super(nome, cpf, matricula);
		this.senha = senha;
	}
	
}

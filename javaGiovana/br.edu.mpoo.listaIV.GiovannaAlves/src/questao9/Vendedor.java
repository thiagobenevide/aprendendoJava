package questao9;

public class Vendedor extends Funcionario {
	
	
	public Vendedor(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}

	public double solicitarAutorizacaoDesconto(GerenteVendas gerenteVendas, Produto produto) {
		if (gerenteVendas == null) {
			Mensagem.exibirMensagemFalha();
			return 0;
		}
		return gerenteVendas.darDesconto(produto);
	}
}

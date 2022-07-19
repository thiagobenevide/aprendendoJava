package questao9;

public class Caixa extends Funcionario {
	
	public Caixa(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}

	public void registarCompra(Produto produto, Vendedor vendedor, GerenteVendas gerenteVendas, boolean isDesconto) {
		if (isDesconto == false && produto != null) {
			Compra compra = new Compra(produto, produto.getPreco(), 0);
			System.out.println(compra.toString());
		}
		else if(isDesconto == false && produto == null){
			System.out.println(Mensagem.exibirMensagemFalha());
		}
		else {
			if (gerenteVendas != null && gerenteVendas.getNome() != null && gerenteVendas.getCpf() != null && gerenteVendas.getMatricula() != null && produto != null) {
				Compra compra = new Compra(produto, produto.getPreco(), vendedor.solicitarAutorizacaoDesconto(gerenteVendas, produto));
				System.out.println(compra.toString());
			}
			else if (gerenteVendas == null || produto == null) {
				System.out.println(Mensagem.exibirMensagemFalha());
			}
		}
	}

}

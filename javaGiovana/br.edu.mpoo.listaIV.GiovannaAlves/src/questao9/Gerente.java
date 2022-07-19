package questao9;

public abstract class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}

	public double darDesconto(Produto produto) {
		if (produto == null) {
			Mensagem.exibirMensagemFalha();
			return 0;
		}
		else {
			double desconto = (produto.getPreco()* 0.1);
			Mensagem.exibirMensagemSucesso();
			return (desconto);
		}
	}
}

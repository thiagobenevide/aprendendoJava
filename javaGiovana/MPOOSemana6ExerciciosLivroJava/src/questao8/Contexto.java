package questao8;

public class Contexto {

	private IOperacao operacao;
	
	public double executarOperacaoSacar(double saldo) {
		return operacao.sacar(saldo);
	}
	
	public double executarOperacaoDepositar(double saldo) {
		return operacao.depositar(saldo);
	}

	public void setOperacao(IOperacao operacao) {
		this.operacao = operacao;
	}
	
}

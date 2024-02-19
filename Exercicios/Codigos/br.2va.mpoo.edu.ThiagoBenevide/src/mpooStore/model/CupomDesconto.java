package mpooStore.model;

import mpooStore.app.App;

public class CupomDesconto {
	private double valor;
	private String codigo;
	
	public CupomDesconto(Cliente cliente) {
		
	}
	private CupomDesconto(double valor, String codigo) {
		super();
		this.valor = valor;
		this.codigo = codigo;
	}

	public CupomDesconto(Cliente cliente, double valor, String codigo) {
		super();
		GerenciadorCupom gc = new GerenciadorCupom();
		cliente.setCupomDesconto(new CupomDesconto(App.gerenciadorCupom.getValorCupomAtual() ,GerenciadorCupom.CODIGO_CUPOM));
	}
	public double getValor() {
		return valor;
	}
	public String getCodigo() {
		return codigo;
	}
	
	
}

package mpooStore.model;

import mpooStore.app.App;

public class CupomDesconto implements ValidadorCupomInterface{
	private double valor;
	private String codigo;
	
	public CupomDesconto(Cliente cliente) {
		
	}
	
	private CupomDesconto(double valor, String codigo) {
		super();
		this.valor = valor;
		this.codigo = codigo;
	}

	public CupomDesconto(Cliente cliente, String codigo) {
		super();
		if(ValidadorCupomInterface.validarCupom(codigo)) {
			cliente.setCupomDesconto(new CupomDesconto(App.gerenciadorCupom.getValorCupomAtual() ,GerenciadorCupom.CODIGO_CUPOM));			
		}else {
			new CupomException();
		}
	}
	
	public double getValor() {
		return valor;
	}
	public String getCodigo() {
		return codigo;
	}
	
	
}

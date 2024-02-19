package mpooStore.model;

public class GerenciadorCupom {
	
	private boolean ofertaCupom = true;
	private double valorCupomAtual;
	public static final String CODIGO_CUPOM = "MPOOSTORESOFF";
	
	public boolean isOfertaCupom() {
		return ofertaCupom;
	}
	public void setOfertaCupom(boolean ofertaCupom) {
		this.ofertaCupom = ofertaCupom;
	}
	public double getValorCupomAtual() {
		return valorCupomAtual;
	}
	public void setValorCupomAtual(double valorCupomAtual) {
		this.valorCupomAtual = valorCupomAtual;
	}
	
	
}

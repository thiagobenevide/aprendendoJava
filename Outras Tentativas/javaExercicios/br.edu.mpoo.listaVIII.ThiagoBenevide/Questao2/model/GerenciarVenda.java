package model;

public class GerenciarVenda {

	private static final double COMISSAO = 0.3;
	
	
	public static void calcularComissao(Vendedor vendedor, double valorVenda) {
		double comissao = valorVenda*COMISSAO;
		vendedor.setTotalComissao(vendedor.getTotalComissao()+comissao);
	}
	
}

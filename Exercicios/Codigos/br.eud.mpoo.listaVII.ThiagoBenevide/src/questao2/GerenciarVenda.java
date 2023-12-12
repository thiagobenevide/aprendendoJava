package questao2;

public class GerenciarVenda {
	private static final double comissao = 0.02;
	
	public static void calcularComissao(Vendedor vendedor, double valorVenda) {
		double valorTotalComissao = valorVenda* comissao;
		vendedor.setTotalComissao(vendedor.getTotalComissao() + valorTotalComissao);;
		
	}
}

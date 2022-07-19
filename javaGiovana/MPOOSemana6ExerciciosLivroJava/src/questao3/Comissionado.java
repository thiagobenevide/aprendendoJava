package questao3;

public class Comissionado extends Empregado {

	private double totalVendas;
	private double taxaComissao;
	
	public Comissionado(String nome, String cpf, double totalVendas, double taxaComissao) {
		super(nome, cpf);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}

	public void somarVenda(double valor) {
		this.totalVendas += valor;
	}

	@Override
	public double calcularPagamento() {
		setSalario(taxaComissao*totalVendas);
		return getSalario();
	}
	
	@Override
	public String toString() {
		return "Comissionado [totalVendas=" + totalVendas + ", taxaComissao=" + taxaComissao + ", toString()="
				+ super.toString() + "]";
	}
}

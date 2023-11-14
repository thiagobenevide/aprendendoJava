package sistema;

public class Divulgacao extends Campanha {
	private int cupomDesconto;
	private double voucher;
	
	public Divulgacao(String nome, int ano, int numero) {
		super(nome, ano, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Produto indicarProduto(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCupomDesconto() {
		return cupomDesconto;
	}

	public void setCupomDesconto(int cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}

	public double getVoucher() {
		return voucher;
	}

	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}
	
	
	
}

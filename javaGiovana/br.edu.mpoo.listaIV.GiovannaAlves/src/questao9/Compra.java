package questao9;

public class Compra {

	private static int sequence = 0;
	private int id;
	private Produto produto;
	private double valor;
	private double desconto;
	
	
	
	public Compra(Produto produto, double valor, double desconto) {
		this.id = sequence++;
		this.produto = produto;
		this.valor = valor;
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", " + produto.getNome() + ", Código: "+ produto.getCodBarras() + ", R$" + valor + ", Desconto: R$ " + desconto + ", Total Compra: R$ "+ (valor - desconto) +"]";
	}
	
}

package arrays;

public class Divulgacao extends Campanha {

	private int cupomDesconto;

	public Divulgacao(int numero, int ano, int cupomDesconto) {
		super(numero, ano);
		this.cupomDesconto = cupomDesconto;
	}

	public int getCupomDesconto() {
		return cupomDesconto;
	}

	@Override
	public String toString() {
		return "Divulgacao [cupomDesconto=" + cupomDesconto + ", getNumero()=" + getNumero() + ", getAno()=" + getAno()
				+ "]";
	}
	
}

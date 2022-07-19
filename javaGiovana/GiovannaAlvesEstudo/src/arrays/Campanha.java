package arrays;

public abstract class Campanha {

	private static int ultima;
	private int numero;
	private int ano;
	
	public Campanha(int numero, int ano) {
		this.numero = numero;
		this.ano = ano;
	}
	
	public void oferecerProduto(Cliente cliente) {
		
	}

	public void definirCampanha(Produto produto) {
		
	}
	
	public static int getUltima() {
		return ultima;
	}

	public int getNumero() {
		return numero;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "Campanha [numero=" + numero + ", ano=" + ano + "]";
	}

}

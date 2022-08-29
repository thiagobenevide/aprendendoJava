package campanhaVenda;

public abstract class Campanha {
	private static int numeroUltimaCampanha;
	private static int anoUltimaCampanha = 2021;
	private int numero;
	private int ano;
	
	
	public Campanha() {
		super();
	}

	public Campanha(int numero, int ano) {
		super();
		this.numero = numero;
		this.ano = ano;
	}
	
	public abstract void definirCampanha(Produto produto);
	

	@Override
	public String toString() {
		return "Campanha [numero=" + numero + ", ano=" + ano + "]";
	}

	public static int getNumeroUltimaCampanha() {
		return numeroUltimaCampanha;
	}
	public static void setNumeroUltimaCampanha(int numeroUltimaCampanha) {
		Campanha.numeroUltimaCampanha = numeroUltimaCampanha;
	}
	public static int getAnoUltimaCampanha() {
		return anoUltimaCampanha;
	}
	public static void setAnoUltimaCampanha(int anoUltimaCampanha) {
		Campanha.anoUltimaCampanha = anoUltimaCampanha;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}

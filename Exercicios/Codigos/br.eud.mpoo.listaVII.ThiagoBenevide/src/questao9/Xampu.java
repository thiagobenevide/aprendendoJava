package questao9;

public class Xampu extends Produto{
	private String tipoCabelo;
	private int volume;
	private String composicao;
	
	public Xampu(String nome, String fabricante, String codBarras, double preco) {
		super(nome, fabricante, codBarras, preco);
		// TODO Auto-generated constructor stub
	}

	public Xampu(String nome, String fabricante, String codBarras, double preco, String tipoCabelo, int volume,
			String composicao) {
		super(nome, fabricante, codBarras, preco);
		this.tipoCabelo = tipoCabelo;
		this.volume = volume;
		this.composicao = composicao;
	}

	public String getTipoCabelo() {
		return tipoCabelo;
	}

	public void setTipoCabelo(String tipoCabelo) {
		this.tipoCabelo = tipoCabelo;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getComposicao() {
		return composicao;
	}

	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	
	
	
	
	
	
}

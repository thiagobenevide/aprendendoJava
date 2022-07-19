package questao1;

public class Xampu extends Produto {

	private String tipoCabelo;
	private int volume;
	private String composicao;
	
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

	public int getVolume() {
		return volume;
	}

	public String getComposicao() {
		return composicao;
	}
}

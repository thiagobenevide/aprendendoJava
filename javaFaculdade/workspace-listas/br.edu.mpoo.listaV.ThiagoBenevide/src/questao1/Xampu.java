package questao1;

public class Xampu extends Produto{
	private String tipoCabelo;
	private int volume;
	private String composicao;
	
	
	public Xampu(String nome, String fabricante, String codBarras, double preco, Estoque estoque) {
		super(nome, fabricante, codBarras, preco, estoque);
		// TODO Auto-generated constructor stub
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

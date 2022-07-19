package model;

public class Filme {

	private String titulo;
	private String genero;
	private boolean legendado;
	private boolean dublado;
	private int anoLancamento;
	private String descricao;
	Sessao sessao;
	
	public Filme(String titulo, String genero, boolean legendado, boolean dublado, int anoLancamento,
			String descricao) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.legendado = legendado;
		this.dublado = dublado;
		this.anoLancamento = anoLancamento;
		this.descricao = descricao;
		this.sessao = new Sessao(this);
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getGenero() {
		return genero;
	}
	public boolean isLegendado() {
		return legendado;
	}
	public boolean isDublado() {
		return dublado;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public Sessao getSessao() {
		return sessao;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", genero=" + genero + ", legendado=" + legendado + ", dublado=" + dublado
				+ ", anoLancamento=" + anoLancamento + ", descricao=" + descricao + "]";
	}
	
}

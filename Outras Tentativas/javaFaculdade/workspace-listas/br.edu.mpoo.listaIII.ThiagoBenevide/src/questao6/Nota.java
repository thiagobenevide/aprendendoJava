package questao6;

import java.util.Date;

public class Nota {
	private Date validade;
	private Descricao descricao;
	
	public Nota(Date validade, Descricao descricao) {
		super();
		this.validade = validade;
		this.descricao = descricao;
	}

	public Descricao getDescricao() {
		return descricao;
	}

	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	
}

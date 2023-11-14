package questao6;

import java.util.Date;

public class Compra {
	private Nota nota;
	private double total;
	private Descricao descricao;
	private Cliente cliente;
	
	
	public Compra(Cliente cliente, Descricao descricao) {
		super();
		this.cliente = cliente;
		this.descricao = descricao;
	}
	
	
	public void criarNota(Date date) {
		Nota notaFinal = new Nota(date, this.getDescricao());
		this.setNota(notaFinal);
	}
	
	public boolean registrarCompra(Descricao descricao) {
		this.setDescricao(descricao);
		return true;
	}
	
	public Nota resumirCompra() {
		return this.getNota();
	}
	
	public double totalCompra(Descricao descricao){
		double valorTotal=0;
		for(Produto produtoCurrent: descricao.getProdutos()) {
			valorTotal+=produtoCurrent.getPreco();
		}
		return valorTotal;
	}
	
	

	public Nota getNota() {
		return nota;
	}
	public void setNota(Nota nota) {
		this.nota = nota;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Descricao getDescricao() {
		return descricao;
	}
	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
}

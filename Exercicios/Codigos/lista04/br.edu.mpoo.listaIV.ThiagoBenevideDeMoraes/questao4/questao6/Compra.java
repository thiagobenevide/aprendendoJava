package questao6;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Compra {
	private static int id;
	private Date date;
	private ArrayList<Produto>produtos;
	private double desconto;
	private double valorTotal;
	
	
	public Compra(double desconto, double valorTotal) {
		super();
		this.id = this.id + 1;
		Date data = new Date();
		
		this.date = new Date(System.currentTimeMillis());
		this.produtos = new ArrayList<Produto>();
		this.desconto = desconto;
		this.valorTotal = valorTotal;
	}


	public int getId() {
		return id;
	}



	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public ArrayList<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}


	public double getDesconto() {
		return desconto;
	}


	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
	
	
	
	
}

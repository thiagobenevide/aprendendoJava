package entidades;

public class Compra {
	private int id;
	private double valor;
	private int ultima;
	
	public Compra(int id, double valor, int ultima) {
		super();
		this.setId(id);
		this.setValor(valor);
		this.setUltima(ultima);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getUltima() {
		return ultima;
	}
	public void setUltima(int ultima) {
		this.ultima = ultima;
	}
	
	
}

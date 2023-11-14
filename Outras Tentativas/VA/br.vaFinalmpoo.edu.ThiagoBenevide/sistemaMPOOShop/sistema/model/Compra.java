package sistema.model;

public class Compra {
	public int id;
	private static int numero;
	private Brinde brinde;
	private double valor;
	private Cliente cliente;
	
	
	public Compra(int id, Brinde brinde, double valor, Cliente cliente) {
		super();
		this.id = id;
		this.brinde = brinde;
		this.valor = valor;
		this.cliente = cliente;
	}
	
	
	public static int getNumero() {
		return numero;
	}






	public static void setNumero(int numero) {
		Compra.numero = numero;
	}






	public Brinde getBrinde() {
		return brinde;
	}






	public void setBrinde(Brinde brinde) {
		this.brinde = brinde;
	}






	public double getValor() {
		return valor;
	}






	public void setValor(double valor) {
		this.valor = valor;
	}






	public Cliente getCliente() {
		return cliente;
	}






	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}






	public void calcularValor(double desconto) {
		
	}
	
	
	
}

package entidades;

public class Compra {
//	public final static int numero=2;
	//Questionamento: Como representar um atr final no UML?
	//Questionamento: Como representar um atr static no UML?
	
	private static int numero;
	
	private int id;
	private double valor;
	Cliente cliente;
	Produto produto;
	
	public Compra(Cliente cliente, Produto produto) {
		numero++;
		this.id = numero;
		if(produto!=null) //solução de quem não aprendeu Exception!
			this.valor = produto.getPreco();//futuramenbte aplicar RN de desconto!
		else
			this.valor = 0;
		
		//obs.: relação 1..1 - futuramente relação 1..N
		this.cliente = cliente;
		this.produto = produto;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}

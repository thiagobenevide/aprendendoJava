package entidades;

public class Compra {
	private int id;
	private double valor;
	private int ultima;

	
	
	
	
	public Compra(int id, double valor, int ultima) {
		numero++;
		this.id = id;
		this.valor = valor;
		
		
		//Atualizar todas as regras que eenvolve a cardinalidade
		//if(produto!=null){ solução de quem não aprensenu exception
		//this.valor = produto.getPreco();
		//else{
		//relação 1..1 - futuramente relação 1..N
		//this.produto = produto
		
	}
	
	public void adicionarProduto(Produto produto) {
		//Atenção as RN
		//Atenção collection ArrayList: add, get, 
		
		if (produto!=null) {
			produtos.add(produto);
		}
		
		valorCompra();
	}
	
	
	private void valorCompra() {
		//Assumir relação 1..N
		//valor+=produtos.get(produto.size()-1).getPreco();
		//Atnção apara exitencia de RN de outra classe que seja responsável por aplicar de
		if(cliente.isAceitarReceberPromocao()) {
			valor+=produtos.get(produto.size()-1).getPrecoPromocional();
		}else {
			valor+=produtos.get(produto.size()-1).getPreco();
		}
		
	}
	
	//Questionamento: Como seria o remover um produto da compra?
	//Qual elemento vai remover? Envolve uma busca
	
	
	
	
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
	
	public ArrayList<Produto> getProdutos(){
		
	}
}

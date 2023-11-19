package campanhaVenda;

public class Verao extends Campanha{

	public Verao() {}
	
	public Verao(int numero, int ano) {
		super(numero, ano);
	}

	@Override
	public void definirCampanha(Produto produto) {
		if (produto.getNome().contains("biquini"))
			produto.setPrecoPromocional(produto.getPreco()-produto.getPreco()/2);
	}
	
	@Override 
	public String toString() {
		return super.toString() + "[Desconto biquine = 50%]";
	}
}
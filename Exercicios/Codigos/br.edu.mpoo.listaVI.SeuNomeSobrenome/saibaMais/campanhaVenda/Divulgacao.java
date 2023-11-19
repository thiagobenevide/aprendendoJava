package campanhaVenda;

public class Divulgacao extends Campanha {

	private static final int cupomPromocional=90;

	public Divulgacao() {}
	
	public Divulgacao(int numero, int ano) {
		super(numero, ano);
	}

	@Override
	public void definirCampanha(Produto produto) {
		if (produto!=null)
			produto.setPrecoPromocional(produto.getPreco()-produto.getPreco()*(this.cupomPromocional/100));
	}

	@Override 
	public String toString() {
		return super.toString() + "[Cupom Promocional = " + cupomPromocional + "%]";
	}

	public static int getCupompromocional() {
		return cupomPromocional;
	}	
}

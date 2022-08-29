package questao6;

public class Divulgacao extends Campanha{
	private static int cupomDesconto = 90;

	
	public Divulgacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Divulgacao(int numero, int ano) {
		super(numero, ano);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void definirCampanha(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	public static int getCupomDesconto() {
		return cupomDesconto;
	}	
	
}

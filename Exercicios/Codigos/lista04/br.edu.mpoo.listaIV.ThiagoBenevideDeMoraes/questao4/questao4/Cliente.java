package questao4;

public class Cliente extends Pessoa{
	private static double cupom=5;
	
	public Cliente(String nome, String cpf, String telefone, String email) {
		super(nome, cpf, telefone, email);
		// TODO Auto-generated constructor stub
	}

	


	public static double getCupom() {
		return cupom;
	}

	public static void setCupom(double cupom) {
		Cliente.cupom = cupom;
	}
	
	
	
	
}

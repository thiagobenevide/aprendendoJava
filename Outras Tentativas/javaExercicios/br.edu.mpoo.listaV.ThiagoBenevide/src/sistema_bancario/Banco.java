package sistema_bancario;

public class Banco {
	private String nome;
	
	
	public Banco(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static boolean depositar(double valor, Conta conta) {
		if(conta!=null) {
			conta.setSaldo(valor);
			return true;
		}
		return false;
	}
	
	public static boolean sacar(double valor, Conta conta) {
		if(conta!=null && conta.getSaldo()>valor) {
			conta.setSaldo(-valor);
			return true;
		}
		return false;
	}
}

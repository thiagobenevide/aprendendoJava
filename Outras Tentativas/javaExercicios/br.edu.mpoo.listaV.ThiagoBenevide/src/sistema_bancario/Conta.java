package sistema_bancario;

public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	private String senha;
	
	public Conta(Cliente cliente, int agencia, int numero, double saldo, String senha) {
		super();
		cliente.getContas().add(new Conta(agencia,numero,saldo,senha));
	}

	private Conta(int agencia, int numero, double saldo, String senha) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.senha = senha;
	
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
}

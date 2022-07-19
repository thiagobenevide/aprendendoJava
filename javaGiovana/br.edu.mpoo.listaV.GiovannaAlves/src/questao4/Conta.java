package questao4;

public class Conta extends Banco{

	private int agencia;
	private int numero;
	private double saldo;
	private String senha;
	private int id = 0;
	
	public Conta(int agencia, int numero, double saldo, String senha, Cliente cliente) {
		cliente.getContas().add(new Conta(agencia, numero, saldo, senha));
	}
	
	private Conta(int agencia, int numero, double saldo, String senha) {
		this.id = id + 1;
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
		this.saldo = saldo;
	}

	public int getConta() {
		return id;
	}
	
	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", ID" + id + "]";
	}


	
}

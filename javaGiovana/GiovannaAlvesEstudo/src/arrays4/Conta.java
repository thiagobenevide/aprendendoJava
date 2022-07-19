package arrays4;

public class Conta {

	private int agencia;
	private int numero;
	private double saldo;
	private String senha;
	
	public Conta(int agencia, int numero, double saldo, String senha, Cliente cliente) {
		
		cliente.getContas().add(new Conta(agencia, numero, saldo, senha));
		
		}

	private Conta(int agencia, int numero, double saldo, String senha) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.senha = senha;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", senha=" + senha + "]";
	}
	
	
}

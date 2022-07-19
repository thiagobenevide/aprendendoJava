package model_4;

public class Conta {

	private int id = 0;
	private int agencia;
	private int numero;
	private double saldo;
	private String senha;
	private static int count = 0;
	
	public Conta(int agencia, int numero, double saldo, String senha, Cliente cliente) {
		cliente.getContas().add(new Conta(agencia, numero, saldo, senha));
	}

	private Conta(int agencia, int numero, double saldo, String senha) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.senha = senha;
		this.id = count;
		count ++;
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

	public int getId() {
		return id;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "Conta [" + "id = " + id + " ,agencia =" + agencia + ", numero =" + numero + ", saldo =" + saldo + "]";
	}
}

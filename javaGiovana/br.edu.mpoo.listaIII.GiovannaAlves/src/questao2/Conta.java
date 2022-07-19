package questao2;

public class Conta {

	private int num;
	private double saldo;
	
	public  Conta(int n, double saldo) {
		this.num = n;
		this.saldo = saldo;
	}
	
	public void debito (double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public void credito(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}

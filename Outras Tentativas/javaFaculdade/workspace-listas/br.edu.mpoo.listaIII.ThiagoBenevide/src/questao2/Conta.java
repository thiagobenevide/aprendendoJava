package questao2;

public class Conta {
	private int num;
	private double saldo;
	
	public Conta(int num, double saldo) {
		//Construtor escrito de forma incorreta com retorno e sintaxicamente incorrerto
		this.num = num;
		this.saldo = saldo;
	}

	public boolean debido(double valor) {
		//Validação do saldo e valor débito e retorno de realização
		if(this.getSaldo()>=valor) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	public void credito(double valor) {
		//Realizando o método com encapsulamento
		this.setSaldo(this.getSaldo()+valor);
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

	@Override
	public String toString() {
		return "Conta [num=" + num + ", saldo=" + saldo + "]";
	}
	
	
	
}

package questao2;

public class Poupanca extends Conta{

	public Poupanca(int num, double saldo) {
		super(num, saldo);
		// Utiliza-se o atributo saldo do processo de herança
	}
	
	//Não precisa criar um método débito pois ele já é herdado
	
	public double renderJuros(double taxa) {
		//Verificação do saldo
		//Cálculo do juros mais incrementação com encapsulamento de dados
		//Retorno da quantidade de juros
		if(this.getSaldo()>0) {
			double juros = (this.getSaldo()*taxa)/100;
			this.setSaldo(this.getSaldo()+juros);
			return juros; 
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Poupanca [getNum()=" + getNum() + ", getSaldo()=" + getSaldo() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}

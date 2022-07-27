package aula05;

public class ContaBanco {
	public int numeroConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco(int numeroConta, String tipo, String dono) {
		this.setNumeroConta(numeroConta);
		this.setTipo(tipo);
		this.setDono(dono);
		this.setSaldo(0);
		this.setStatus(false);
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);

		if (this.getTipo().equals("cc")) {
			this.setSaldo(50);
		}
		
		if (this.getTipo().equals("cp")) {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if(this.isStatus()) {
			if (this.getSaldo()>0 && this.getSaldo()<=1000) {
				while (this.getSaldo()!=0) {
					this.sacar(1000);
				}
				this.setStatus(false);
			}
		}
	}
	
	public void depositar(double deposito) {
		if (this.isStatus()) {
			if (deposito > 0  && deposito <=5000) {
				double novoSaldo = this.getSaldo()+deposito;
				this.setSaldo(novoSaldo);
			}
		}
	}
	
	public double sacar(double resgate) {
		if (resgate > 0 && resgate <= 1000) {
			if (this.getSaldo()>0) {
				if (resgate <= this.getSaldo()) {
					double novoSaldo = this.getSaldo()-resgate;
					this.setSaldo(novoSaldo);
					return resgate;					
				}else {
					double saldoAux = this.getSaldo();
					this.setSaldo(0);
					return saldoAux;
				}
			}
			if (this.getSaldo()<0) {
				return 0.0;
			}
		}else {
			return 0.0;
		}
		return 0.0;
		
	}
	
	
	public void pagarMensal() {
		if (this.isStatus()) {
			if (this.getTipo().equalsIgnoreCase("cc")){
				double novoSaldo = this.getSaldo()-12;
				this.setSaldo(novoSaldo);
			}
			if (this.getTipo().equalsIgnoreCase("cp")) {
				double novoSaldo = this.getSaldo()-20;
				this.setSaldo(novoSaldo);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Numero da Conta: " + numeroConta + "\nTipo da Conta: " + tipo + "\nDono da Conta: " + dono + "\nSaldo da Conta: " + saldo
				+ "\nStatus da Conta: " + status;
	}

	//Gets and sets
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}

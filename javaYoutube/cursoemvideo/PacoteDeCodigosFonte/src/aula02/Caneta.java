package aula02;

public class Caneta {
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	protected boolean tampada;
	
	
	public Caneta(String modelo, String cor, double ponta, int carga, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}


	void status() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Carga: "+this.carga);
		System.out.println("Está tampada? "+this.tampada);
	}
	
	
	public void rabiscar() {
		if (this.tampada) {
			System.out.println("Erro!: Não posso rabiscar!");			
		}else {
			System.out.println("Estou rabiscando!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}

	
	//Get and Set
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	
	
}

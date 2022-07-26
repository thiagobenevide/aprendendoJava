package entidades;

public class Telefone {
	private int ddd;
	private int numero;
	private String codPais;
	
	public Telefone(int ddd, int numero, String codPais) {
		this.ddd = ddd;
		this.numero = numero;
		this.codPais = codPais;
	}
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCodPais() {
		return codPais;
	}
	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}
	
	
}

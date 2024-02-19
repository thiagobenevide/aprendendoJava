package model;

import java.util.Date;

public class FichaAtendimentoModel {
	private String numero;
	private Date hora;
	
	
	public FichaAtendimentoModel(String numero, Date hora) {
		super();
		this.numero = numero;
		this.hora = hora;
	}
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	
}

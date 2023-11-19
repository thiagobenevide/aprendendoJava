package campanhaVenda;

import java.time.LocalDateTime;

public abstract class Campanha {
	
	private static int numeroUltimaCampanha; 
	private static int anoUltimaCampanha=2021;
	private int numero; 
	private int ano;
	
	public Campanha() {
		numeroUltimaCampanha++;
		if(LocalDateTime.now().getYear()>anoUltimaCampanha){
			anoUltimaCampanha++;
			numeroUltimaCampanha=1;
		}
		this.numero = numeroUltimaCampanha;
		this.ano = anoUltimaCampanha;
	}
	
	public Campanha(int numero, int ano) {
		this.numero = numero;
		this.ano = ano;
	}

	public abstract void definirCampanha(Produto produto);
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public static int getNumeroUltimaCampanha() {
		return numeroUltimaCampanha;
	}

	public static int getAnoUltimaCampanha() {
		return anoUltimaCampanha;
	}
	
	@Override
	public String toString() {
		return "Campanha: [" + numero + "/" + ano + "]";
	}
} 
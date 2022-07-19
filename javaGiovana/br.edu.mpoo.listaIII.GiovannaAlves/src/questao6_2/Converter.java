package questao6_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {

	public Date data;
	public int ano;
	public int dia;
	public int mes;
	
	
	
	public Converter(Date data, int ano, int dia, int mes) {
		this.data = data;
		this.ano = ano;
		this.dia = dia;
		this.mes = mes;
	}


	public Converter(int ano, int dia, int mes) {
		this.ano = ano;
		this.dia = dia;
		this.mes = mes;
	}
	

	public Converter(int ano, int mes) {
		super();
		this.ano = ano;
		this.mes = mes;
	}

	public Converter(Date data) {
		SimpleDateFormat formatar = new SimpleDateFormat("dd/M/YY");
		String dataFormatada = formatar.format(data);
		System.out.println("Ano " + dataFormatada);
		return;
	}
	
	public Converter(int ano) {
		SimpleDateFormat formatar = new SimpleDateFormat("D");
		String dataFormatada = formatar.format(ano);
		System.out.println("dias do ano " + dataFormatada);
		return;
	}
	
}

package model;

import java.util.Calendar;

public class Sessao {


	private int sala;
	private double valorIngresso;
	private Calendar horario;

	public Sessao (Filme filme) {
		
	}
	
	public Sessao(int sala, double valorIngresso, Calendar horario, Filme filme) {
		super();
		filme.sessao.sala = sala;
		filme.sessao.valorIngresso = valorIngresso;
		filme.sessao.horario = horario;
		
	}

	public int getSala() {
		return sala;
	}

	public double getValorIngresso() {
		return valorIngresso;
	}

	public Calendar getHorario() {
		return horario;
	}

	@Override
	public String toString() {
		return "sessao [sala=" + sala + ", valorIngresso=" + valorIngresso + ", horario=" + horario + "]";
	}

}

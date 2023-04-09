package model;

import java.util.Date;

public class Cliente extends UsuarioAbstract {
	private double cupomDescontoAtivo;

	public Cliente(String nome, String senha, String cpf, Date dataNascimento) {
		super(nome, senha, cpf, dataNascimento);
	}

	public double getCupomDescontoAtivo() {
		return cupomDescontoAtivo;
	}

	public void setCupomDescontoAtivo(double cupomDescontoAtivo) {
		this.cupomDescontoAtivo = cupomDescontoAtivo;
	}
}

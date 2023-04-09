package model;

import java.util.Date;

public class Cliente extends UsuarioAbstract {
	private double cupomDesconto;

	public Cliente(String nome, String senha, String cpf, Date dataNascimento,
			double cupomDesconto) {
		super(nome, senha, cpf, dataNascimento);
		this.cupomDesconto = cupomDesconto;
	}

	public double getCupomDesconto() {
		return cupomDesconto;
	}

	public void setCupomDesconto(double cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}
}
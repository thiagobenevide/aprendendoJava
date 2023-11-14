package entidades;

import java.util.Date;

public class Cliente extends Pessoa{
	
	private boolean aceitarReceberPromocao;
	
	//permitiu que as antigas instâncias pudessem continuar com a definição antida
	public Cliente(String nome, Telefone telefone, Endereco endereco,
			Email email, String sexo, boolean aceitarReceberPromocao, String cpf) {
		super(nome, telefone, endereco, email, sexo, cpf, null,	0);
		this.aceitarReceberPromocao = aceitarReceberPromocao;
	}
	
	//atualização do sistema!. Novos clientes terão de informar data e voucher
	public Cliente(String nome, Telefone telefone, Endereco endereco,
			Email email, String sexo, boolean aceitarReceberPromocao, String cpf, Date dataNascimento,
			double voucher) {
		super(nome, telefone, endereco, email, sexo, cpf, dataNascimento,
				voucher);
		this.aceitarReceberPromocao = aceitarReceberPromocao;
	}
	
	
	public boolean isAceitarReceberPromocao() {
		return aceitarReceberPromocao;
	}
	public void setAceitarReceberPromocao(boolean aceitarReceberPromocao) {
		this.aceitarReceberPromocao = aceitarReceberPromocao;
	}

	@Override
	public String toString() {
		return "Cliente [aceitarReceberPromocao=" + aceitarReceberPromocao
				+ ", toString()=" + super.toString() + "]";
	}
}


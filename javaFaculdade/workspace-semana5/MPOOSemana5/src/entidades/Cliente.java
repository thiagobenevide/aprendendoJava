package entidades;

import java.util.Date;

public class Cliente extends Pessoa{

	private boolean aceitaReceberProdutoPromocional;
	
	public Cliente(String nome, Telefone telefone, Endereco endereco, String sexo, String cpf, Date dataNascimento,
			double voucher) {
		super(nome, telefone, endereco, sexo, cpf, dataNascimento, voucher);
		
	}

	public boolean isAceitaReceberProdutoPromocional() {
		return aceitaReceberProdutoPromocional;
	}

	public void setAceitaReceberProdutoPromocional(boolean aceitaReceberProdutoPromocional) {
		this.aceitaReceberProdutoPromocional = aceitaReceberProdutoPromocional;
	}
	
	
	
	
	
}

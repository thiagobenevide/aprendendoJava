package sistema;

import java.util.Date;

public class Cliente extends Pessoa {
	private boolean aceitaProdutoPromocional;
	
	public Cliente(String nome, 
				Telefone telefone, 
				Endereco endereco, 
				String sexo, 
				String cpf, 
				Date dataNascimento,
				double voucher, 
				boolean aceitaProdutoPromocional) 
				{
					super(nome, telefone, endereco, sexo, cpf, dataNascimento, voucher);
					this.aceitaProdutoPromocional = aceitaProdutoPromocional;
				}

	public boolean isAceitaProdutoPromocional() {
		return aceitaProdutoPromocional;
	}

	public void setAceitaProdutoPromocional(boolean aceitaProdutoPromocional) {
		this.aceitaProdutoPromocional = aceitaProdutoPromocional;
	}
	
	
}

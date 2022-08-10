package sistema;

import java.util.Date;

public class Cliente extends Pessoa {
	private boolean aceitaProdutoPromocional;

	
	//Permite que as antigas instâncias pudessem continuar com a definição antiga
	
	public Cliente(String nome, Telefone telefone, Endereco endereco, String sexo,boolean aceitaProdutoPromocional, String cpf) {
		super(nome, telefone, endereco, sexo, cpf, null, 0);
		this.aceitaProdutoPromocional = aceitaProdutoPromocional;
	}
	
	
	//Atualização do Sistema! Novos clientes terão de informar data e voucher
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


	@Override
	public String toString() {
		return "Cliente [aceitaProdutoPromocional=" + aceitaProdutoPromocional +
				", toString()="+ super.toString()+"]";
	}
	
	
}

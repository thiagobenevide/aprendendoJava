package entidade;

import javax.swing.JOptionPane;

import gui.Mensagem;

public class Gerente extends Funcionario{

	public Gerente(String nome, String cpf) {
		super(nome, cpf);
		calcularSalario();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSalario() {
		setSalario(SALARIO_MINIMO*5);
		
	}
	
	public void darDesconto(Produto produto, int desconto) {
		/**
		 * <bold><i>darDesconto</i></bold>
		 * <p>public void darDesconto(Produto produto, int desconto)</p>
		 * <p>Este método dar o desconto em porcentagem a um produto</p>
		 * <bold>Parameters</bold>
		 * <p><bold>desconto</bold> - Desconto em porcentagem. Ex: Se o preco do produto é de R$10% então o novo preço de produto é de R$ 9,00.</p>
		 * <p><bold>produto</bold> - Produto que receberá o desconto.</p>
		 * 
		 * */
		produto.setPreco(produto.getPreco()-(produto.getPreco()*desconto*0.01));			
		
	}
	
	public void darDesconto(Compra compra, double desconto) {
		/**
		 * <bold><i>darDesconto</i></bold>
		 * <p>public void darDesconto(Produto produto, )</p>
		 * <p>Este método dar o desconto em porcentagem a um produto</p>
		 * <bold>Parameters</bold>
		 * <p><bold>desconto</bold> - Desconto em porcentagem. Máximo de 10% para uma compra mínima de R$100,00. Ex: Se valor de compra é de R$100,00 e desconto é 10%, então o novo valor de compra é R$90,00</p>
		 * <p><bold>produto</bold> - Compra que receberá o desconto</p>
		 * 
		 * */
		
		if(compra.getValorTotal()<100) {
			Mensagem.exibirMensagem("Desconto não permitido: Compra não atingiu o valor mínimo");
		}else if(desconto>10) {
			Mensagem.exibirMensagem("Desconto não permitido: superior ao permitido!");
		}else {
			compra.setValorTotal(compra.getValorTotal()-(compra.getValorTotal()*desconto*0.01));
		}		
	}

}

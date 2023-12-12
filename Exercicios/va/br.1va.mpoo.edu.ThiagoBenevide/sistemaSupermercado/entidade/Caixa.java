package entidade;

import app.App;
import base.BaseDados;

public class Caixa extends Funcionario{

	
	public Caixa(String nome, String cpf) {
		super(nome, cpf);
		calcularSalario();
	}

	@Override
	public void calcularSalario() {
		setSalario(SALARIO_MINIMO);
		
	}
	
	public void registrarVenda(Compra compra, Produto produto, String codVendedor) {
		//Chamar comissao
		if(codVendedor!=null) {
			App.getSupermercado().buscarVendedor(codVendedor).setTotalComissao(
					App.getSupermercado().buscarVendedor(codVendedor).getTotalComissao()+
					(compra.getValorTotal()*App.getSupermercado().buscarVendedor(codVendedor).COMISSAO));
			App.getSupermercado().buscarVendedor(codVendedor).calcularSalario();
			
			//Adiciona compra ao supermercado
			App.getSupermercado().compra.add(compra);
		}
		App.getSupermercado().compra.add(compra);
		
		
		
		
	}

}

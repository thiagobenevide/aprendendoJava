package sistema;

import java.time.LocalDateTime;

public class AniversarioCliente extends Campanha {

	public AniversarioCliente(String nome, int ano, int numero) {
		super(nome, ano, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Produto indicarProduto(Cliente cliente) {
		if (cliente.getDataNascimento().getDate()==LocalDateTime.now().getDayOfMonth()
				&&
				cliente.getDataNascimento().getMonth()==LocalDateTime.now().getMonthValue()) {
			if(cliente.isAceitaProdutoPromocional()) {
				if(cliente.getSexo().equalsIgnoreCase("masculino")) {
					return new Produto("Creme Barbear", 50.00, 50.00-cliente.getVoucher(), "CD003", ano, nome, null);
				}
				if(cliente.getSexo().equalsIgnoreCase("feminino")) {
					return new Produto("Creme Barbear", 50.00, 50.00-cliente.getVoucher(), "CD003", ano, nome, null);
				}
			}
		}
		

	}
	
	public void definirVoucher() {
		//Como ela saberá quemsão os clientes
		//O conceito de base de dados
		//Analisando Herança,Onde vamos usar o conecito de herança
		//Vamos pecisar trar cliente como pessoa
	}

	
	
}

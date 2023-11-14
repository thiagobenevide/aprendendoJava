package entidades;

import java.time.LocalDateTime;
import java.util.Date;

import javax.swing.JOptionPane;

public class AniversarioCliente extends Campanha{

	
	public AniversarioCliente(String nome, int ano, int numero) {
		super(nome, ano, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Produto indicarProduto(Cliente cliente) {
		//que assunto abordado: por Herança sobreescrever o método abstrato de Campanha 
		//cliente faz aniversário?
		if (cliente.getDataNascimento().getDate()==LocalDateTime.now().getDayOfMonth()
			&&
			cliente.getDataNascimento().getMonth()==LocalDateTime.now().getMonthValue()){
				if (cliente.isAceitarReceberPromocao()){	//opcional ver RN
					if(cliente.getSexo().equalsIgnoreCase("masculino")){
						//pq não pode ser assim: dar um new em produto ak? pode dar inconsistencia nos atributos!
						//precisamo recuperar de uma base!
					return new Produto("Creme Barbear",  
							50.00, 
//							(50.00-cliente.getVoucher()),//se voucher for maior temode pensar!
							50.00,
							"CD003", 
							100, 
							"masculino", 
							new Date(2020, 12, 1)); //mas e o produto vencido?
				}
				else 
					if(cliente.getSexo().equalsIgnoreCase("feminino")){
						return new Produto("Lixa de unha",  
								10.00, 
								10.00, 
								"CD004", 
								1, 
								"feminino", 
								new Date(2040, 12, 1));
					}
					else{
							return new Produto("Feijao",  
									9.00, 
									9.00, 
									"CD005", 
									1, 
									"null", 
									new Date(2040, 12, 1));
						}

					}
			}else return null;
		}
	
	public void definirVoucher(){
		//como ele saberá quem são os clientes?
		//o conceito de base de dados
		
		//vamos entrar no conceito de ArrayList
		
		//analisando Herança: Onde vamos usar o conceito de Herança?
               //Vamos precisar tratar Cliente como Pessoa (polimofismo de objeto)
		
	}
	

}

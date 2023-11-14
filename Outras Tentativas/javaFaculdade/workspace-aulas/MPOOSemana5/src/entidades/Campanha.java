package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public abstract class Campanha {
	private String nome;
	private int ano;
	private int numero;
	
	public Campanha(String nome, int ano, int numero) {
		this.nome = nome;
		this.ano = ano;
		this.numero = numero;
	}
	
	public abstract Produto indicarProduto(Cliente cliente);
//Revisão: Método abstrato obriga subclasse a @Override
	//Mas que subclasses?
//se herda metodo abstrato e a classe é concreta, então a classe é obrigada a sobrescrever o método herdado
	
	
//	public static Produto indicarProduto(Cliente cliente){
//
//		//observação: == apenas para dados numericos / null
//		//comparação de String usa equals ou equalsIgnorecase
//
//		if (cliente.isAceitarReceberPromocao()){
//			if(cliente.getSexo().equalsIgnoreCase("masculino")){
//				//indica produto masculino!
//				//Mas e o que é essa indicação?
//				//estamos retornando um dado fictício, pois o produto depende de uma base, e não de uma programação direta
//				return new Produto("Creme Barbear",  
//						50.00, 
//						50.00, 
//						"CD003", 
//						100, 
//						"masculino", 
//						new Date(2020, 12, 1)); //mas e o produto vencido?
//				//			LocalDateTime
//				//			Calendar
//
//			}
//			else 
//				if(cliente.getSexo().equalsIgnoreCase("feminino")){
//					//indica produto masculino!
//					//Mas e o que é essa indicação?
//					//estamos retornando um dado fictício, pois o produto depende de uma base, e não de uma programação direta
//					return new Produto("Lixa de unha",  
//							10.00, 
//							10.00, 
//							"CD004", 
//							1, 
//							"feminino", 
//							new Date(2040, 12, 1));
//				}
//				else{
//					JOptionPane.showMessageDialog(null, Mensagem.MENSAGEM_FALHA_RELACAO_PRODUTO_CLIENTE);
//					return null;
//
//				}
//		}else return null;
//
//
//
//	}

	
}

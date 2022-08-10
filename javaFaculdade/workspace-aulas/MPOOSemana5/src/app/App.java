package app;
import java.awt.image.BufferedImage;
import java.util.Date;

import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;

import entidades.Campanha;
import entidades.Cliente;
import entidades.Compra;
import entidades.Email;
import entidades.Endereco;
import entidades.Produto;
import entidades.Telefone;

public class App {
	public static void main(String[] args) {
		Telefone telefone = new Telefone(87, 999990000); //objeto concreto
		System.out.println(telefone.getNumero());
		telefone = null;
		System.gc();
		
		new Telefone(87, 999991111); //objeto anônimo
		System.out.println();//nãotem como!
		
		//Questionamento: Se estou trabalhando com objetos anônimos como fazer para liberar memória?
		
		//Questionamento: Como um desenvolvedor saberá a repretação de um dado?
		//Resposta:Documentação. Como fazê-la? Pesquisar
		//Atv.: Como fazer o doc do Construtor de Cliente de maneira ao desenvolvedor saber como é o cpf!
		Cliente cliente = new Cliente("Jose Silva", 
									   new Telefone(87, 999992222),
									   new Endereco("Rua UAST", "Universitario", "Serra Talhada", "PE", "57970-000", 0), 
									   new Email("zesilva@gmail.com"), 
									   "masculino",
									   true, 
									   "000.000.000-00");
		Cliente cliente2 = new Cliente("Maria Silva", 
				   				new Telefone(87, 999992222),
				   				new Endereco("Rua UAST", "Universitario", "Serra Talhada", "PE", "57970-000", 0), 
				   				new Email("mariasilva@gmail.com"), 
				   				"feminino",
				   				false, 
				   				"111.111.111-11");
		Produto produto1 = new Produto("Barbeador Tira Pelos", 
									   100.00, 
									   100.00, 
									   "CD001", 
									   1, 
									   "unissex", 
									   new Date(2021, 12, 1));
		
		Produto produto2 = new Produto("Esmalte Viva Verao", 
				   20.00, 
				   10.00, 
				   "CD002", 
				   20, 
				   "feminino", 
				   new Date(2022, 06, 13));
		
//		Compra compra = new Compra(cliente, produto1);
//		Compra compra2 = new Compra(cliente, produto1);
		
		Compra compra3 = new Compra(cliente, Campanha.indicarProduto(cliente));
		//obs.: compra3 é exemplo de garantia de aplicar o preço promocional (cenas dos próximos capítulos)
		
		Compra compra4 = new Compra(cliente2, Campanha.indicarProduto(cliente2));
		//obs.: compra4 não está podendo ser instanciada: pois a indicação é null, solução
		//Solução1: Exceção
		//Solução2: Quebra-galho!
		
		
		
		
	}
}

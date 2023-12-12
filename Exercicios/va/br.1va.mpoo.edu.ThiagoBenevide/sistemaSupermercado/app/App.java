package app;

import base.BaseDados;
import entidade.Caixa;
import entidade.Compra;
import entidade.Funcionario;
import entidade.Gerente;
import entidade.Supermercado;
import entidade.Vendedor;

public class App {
	private static Supermercado supermercado;
	
	public static Supermercado getSupermercado() {
		return supermercado;
	}

	public static void setSupermercado(Supermercado supermercado) {
		App.supermercado = supermercado;
	}

	public static void main(String[] args) {
	
		BaseDados.createBase();
		setSupermercado(new Supermercado("MPOO Supermarket"));
		
		
		
		Gerente g1 =  new Gerente("Maria Silva", "111.111.111-11");
		Vendedor v1 = new Vendedor("João Santos", "222.222.222-22", "vend001");
		Vendedor v2 = new Vendedor("Godofredo", "333.333.333-33", "vend002");
		Vendedor v3 = new Vendedor("Joana", "555.555.555-55", "vend003");
		Caixa c1 = new Caixa("José Lima", "444.444.444-44");
		
		supermercado.funcionarios.add(g1);
		supermercado.funcionarios.add(v1);
		supermercado.funcionarios.add(v2);
		supermercado.funcionarios.add(v3);
		supermercado.funcionarios.add(c1);
		
		for(Funcionario funcionarioCurrent : supermercado.funcionarios)
			System.out.println(funcionarioCurrent.toString());
		
		//Compra1----------------------------------
		Compra comp1 = new Compra();
		comp1.adicionarProduto(BaseDados.buscarProduto("PROD001"));
		c1.registrarVenda(comp1, BaseDados.buscarProduto("PROD001"), v1.getCodVendedor());
		
		//Compra2----------------------------------
		Compra comp2 = new Compra();
		for(int cont=0; cont<=10; cont++) {
			comp2.adicionarProduto(BaseDados.buscarProduto("PROD001"));
		}
		c1.registrarVenda(comp2, BaseDados.buscarProduto("PROD001"), v1.getCodVendedor());
		
		//Compra3----------------------------------
		Compra comp3 = new Compra();
		comp3.adicionarProduto(BaseDados.buscarProduto("PROD002"));
		c1.registrarVenda(comp3, BaseDados.buscarProduto("PROD001"), v3.getCodVendedor());
		
		//Compra4----------------------------------
		Compra comp4 = new Compra();
		for(int cont=0; cont<=10; cont++) {
			comp4.adicionarProduto(BaseDados.buscarProduto("PROD001"));
		}
		for(int cont=0; cont<=10; cont++) {
			comp4.adicionarProduto(BaseDados.buscarProduto("PROD002"));
		}
		
		g1.darDesconto(comp4, 10);
		c1.registrarVenda(comp4, BaseDados.buscarProduto("PROD001"), v2.getCodVendedor());		
		
		//Compra 5----------------------------------
		Compra comp5 = new Compra();
		for(int cont=0; cont<=10; cont++) {
			comp5.adicionarProduto(BaseDados.buscarProduto("PROD004"));
		}
		g1.darDesconto(BaseDados.buscarProduto("PROD004"), 50);
		
		c1.registrarVenda(comp5, BaseDados.buscarProduto("PROD001"), null);
	
		
		for(Compra compraCurrent : Supermercado.compra) {
			System.out.println(compraCurrent.id);
			System.out.println(compraCurrent.getValorTotal());
		}
		

		
		

		
		
		System.out.println("Novo Status dos Salário dos Vendedores e o salario padrão dos outros funcionarios");
		for(Funcionario funcionarioCurrent : supermercado.funcionarios)
			System.out.println(funcionarioCurrent.toString());
		
	}
	
}

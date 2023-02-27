package app;

import java.util.ArrayList;

import model.Funcionario;
import model.GerenciarVenda;
import model.Gerente;
import model.Vendedor;

public class App {
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("13077735407", "thiago.moraes");
		Funcionario vendedor = new Vendedor("22446545545", "jose.silva");
		
		GerenciarVenda.calcularComissao(((Vendedor)vendedor), 1200);
		System.out.println(vendedor.toString());
		System.out.println(gerente.toString());
		
		
	}

}

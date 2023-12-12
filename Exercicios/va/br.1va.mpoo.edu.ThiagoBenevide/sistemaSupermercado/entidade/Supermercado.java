package entidade;

import java.util.ArrayList;

public class Supermercado {
	public String nome;
	public static ArrayList<Funcionario>funcionarios;
	public static ArrayList<Compra>compra;
	
	public Supermercado(String nome) {
		super();
		this.nome = nome;
		funcionarios = new ArrayList<Funcionario>();
		compra = new ArrayList<Compra>();
	}
	
	public static Funcionario buscarFuncionario(String cpf) {
		if(cpf!=null) 
			for(Funcionario funcionarioCurrent: funcionarios)
				if(funcionarioCurrent.getCpf().equalsIgnoreCase(cpf))
					return funcionarioCurrent;
		return null;
	}
	
	public static Vendedor buscarVendedor(String codVendedor) {
		if(codVendedor!=null)
			for(Funcionario funcionarioCurrent : funcionarios) {
				if(funcionarioCurrent instanceof Vendedor)
					if(((Vendedor) funcionarioCurrent).getCodVendedor().equalsIgnoreCase(codVendedor))
						return ((Vendedor)funcionarioCurrent);					
			}
		return null;
				
	}
	
	public static Compra buscarCompra(int id) {
		for(Compra compraCurrent : compra) {
			if(compraCurrent.id == id)
				return compraCurrent;
		}
		return null;
	}
	
	
	
	
}

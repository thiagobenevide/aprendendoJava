package mpooStore.model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Pessoa> pessoas;
	
	public static void createBase(){
		pessoas = new ArrayList<Pessoa>();
		inicializarBase();
	}
	
	private static void inicializarBase(){
			try {
				pessoas.add(new Cliente("Maria Silva", "83355316334", "maria@gmail.com"));
				pessoas.add(new Cliente("Thiago Benevide", "13077735407", "thiagobenevide@live.com"));
				//pessoas.add(new Cliente("joao Santos", "11111111111", "joao@gmail.com"));
				//Se colocar esse cliente irá ocorre a mensage inicial de cpfException, por isso comentei, mas não irá quebrar o código!
				pessoas.add(new Cliente("Godofredo Alves", "35825183027", "godofredo@gmail.com"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private static Pessoa buscarPessoa(String cpf){ 
		if (cpf == null)
			return null;
		
		for (Pessoa pessoaCurrent : pessoas){
			if (pessoaCurrent.getCpf().equalsIgnoreCase(cpf))
				return pessoaCurrent;
		}
		return null;
	}
	
	private static Cliente buscarCliente(String email){ 
		if (email== null)
			return null;
		
		for (Pessoa pessoaCurrent : pessoas){
			if (pessoaCurrent instanceof Cliente)
				if (((Cliente) pessoaCurrent).getEmail().equalsIgnoreCase(email))
					return (Cliente)pessoaCurrent;
		}
		return null;
	}
	
	public static Cliente buscarCliente(Cliente cliente){ 
		if(cliente!=null) {
			for (Pessoa pessoaCurrent : pessoas){
				if (pessoaCurrent instanceof Cliente)
					if (((Cliente) pessoaCurrent).getCpf().equalsIgnoreCase(cliente.getCpf())
							&& ((Cliente) pessoaCurrent).getEmail().equalsIgnoreCase(cliente.getEmail())
							)
						return (Cliente)pessoaCurrent;
			}
			return null;
		}
		return null;
	}


	public static boolean isCliente(Cliente cliente) throws ClienteExeption{

		if(pessoas.contains(buscarPessoa(cliente.getCpf()))
				&& pessoas.contains(buscarCliente(cliente.getEmail())))
				 {
			return true;
		}else {
			throw new ClienteExeption();
		}
	}
	
	
	
}
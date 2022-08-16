package sistema;

import java.util.ArrayList;

public class BaseDados {
	
	private static ArrayList<Compra>compras;
	private static ArrayList<Cliente>clientes;
	
	public static void createBase() {
		compras = new ArrayList<Compra>();
		clientes = new ArrayList<Cliente>();
		inicializarBase();
	}
	
	private static void inicializarBase() {
		//Adiciona um novo cliente na função de administrador
	}
	
	//Métodos da Compra na base de dados
	
	public static boolean adicionarCompra(Compra compra) {
		if(compra!=null) {
			return compras.add(compra); //Comando de inserir compra em arquivo ou base de dados
		}
		return false;
	}
	
	public static Compra buscarCompra(int id) {
		for (Compra compraCurrent:compras) {  //Varredura de dados usando o forEach
			if (compraCurrent.getId()==id) {
				return compraCurrent;
			}
		}
		return null;
	}

	
	//Métodos do Cliente na base de dados
	
	private static Cliente buscarCliente(Cliente cliente) {
		for(Cliente clienteCurrent:clientes) {
			if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf())) {
				return clienteCurrent;
			}
		}
		return null;
	}
	
	private static Cliente buscarCliente(String cpf) {
		for(Cliente clienteCurrent:clientes) {
			if(clienteCurrent.getCpf().equalsIgnoreCase(cpf)) {
				return clienteCurrent;
			}
		}
		return null;	
	}
	
	public static boolean isCliente(Cliente cliente) {
		return clientes.contains(buscarCliente(cliente));
	}
	
	public static boolean isCliente(String cpf) {
		return clientes.contains(buscarCliente(cpf));
	}
	
	public static boolean adicionarCliente(Cliente cliente) {
		if (cliente!=null) {
			if(!isCliente(cliente)) {
				return clientes.add(cliente);
				
			}
		}
		return false;
	}
	
	public static boolean removerCliente(Cliente cliente) {
		if(cliente!=null) {
			return clientes.remove(buscarCliente(cliente));
		}
		return false;
	}
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		if(clienteNew!=null && clienteOld!=null) {
			clientes.set(clientes.indexOf(buscarCliente(clienteOld)), clienteNew);
			return true;
		}
		return false;
	}
	
}

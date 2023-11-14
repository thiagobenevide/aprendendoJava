package sistema_bancario;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente> clientes;

	public static void createBase() {
		clientes = new ArrayList<Cliente>();
	}
	
	private static Cliente buscarCliente(Cliente cliente) {
		if(cliente!=null) {
			for(Cliente clienteCurrent : clientes) {
				if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf())) {
					return clienteCurrent;
				}
			}
		}
		return null;
	}
	
	private static Cliente buscarCliente(String cpf) {
	
		for(Cliente clienteCurrent : clientes) {
			if(clienteCurrent.getCpf().equalsIgnoreCase(cpf)) {
				return clienteCurrent;
			}
		}
		return null;
	}
	
	public static boolean isCliente(Cliente cliente) {
		if(cliente!=null) {
			return clientes.contains(buscarCliente(cliente));
		}
		return false;
	}
	
	public static boolean isCliente(String cpf) {
		if(clientes.contains(buscarCliente(cpf))) {
			return true;
		}
		return false;
		
	}
	
	
	public static boolean adicionarCliente(Cliente cliente) {
		if(cliente!=null) {
			if(!isCliente(cliente)) {
				clientes.add(cliente);
				return true;
			}		
		}
		return false;	
	}
	
	public static boolean removerCliente(Cliente cliente) {
		if(cliente!=null) {
			clientes.remove(clientes.indexOf(buscarCliente(cliente)));
			return true;
		}	
		return false;
	}
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		if(clienteNew != null && clienteOld != null) {
			clientes.set(clientes.indexOf(buscarCliente(clienteOld)), clienteNew);
			return true;
		}
		return false;
	}
	
	

	
}

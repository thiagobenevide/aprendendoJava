package sistema_bancario;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<Cliente>clientes;
	
	
	public static void createBase() {
		clientes = new ArrayList<Cliente>();
	}
	
	public static Cliente buscarCliente(Cliente cliente) {
		if(cliente!=null) {
			for(Cliente clienteCurrent:clientes) {
				if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf())) {
					return clienteCurrent;
				}
			}
			return null;
		}
		return null;
	}
	
	public static Cliente buscarCliente(String cpf) {
		for(Cliente clienteCurrent:clientes) {
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
	
	
	public static boolean adicionarCliente(Cliente cliente) {
		if(cliente!=null && isCliente(cliente)) {
			clientes.add(cliente);
			return true;
		}
		return false;
	}
	
	public static boolean removerCliente(Cliente cliente) {
		if(cliente!=null && isCliente(cliente)) {
			clientes.remove(clientes.indexOf(buscarCliente(cliente)));
			return true;
		}
		return false;
	}
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		if(clienteOld!=null && clienteNew!=null && isCliente(clienteOld)) {
			if(isCliente(clienteNew)) {
				return false;
			}
			clientes.set(clientes.indexOf(clienteOld), clienteNew);
			return true;
		}
		return false;
	}
}

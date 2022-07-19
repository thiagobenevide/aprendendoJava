package questao3;

import java.util.ArrayList;

public class BaseDadosClientes {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void inicializarBase() {
		clientes = new ArrayList<Cliente>();
	}
	
	public static Cliente buscarCliente(Cliente cliente) {
		for(Cliente clienteCurrent : clientes) {
			if(clienteCurrent.getCpf().equals(cliente.getCpf())) {
				return clienteCurrent;
			}
		}
		return null;
	}

	public static Cliente buscarCliente(String cpf) {
		for(Cliente clienteCurrent : clientes) {
			if(clienteCurrent.getCpf().equals(cpf)) {
				return clienteCurrent;
			}
		}
		return null;
	}
	
	public static boolean isCliente(Cliente cliente) {
		if (buscarCliente(cliente.getCpf()) != null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarCliente(Cliente cliente) {
		if (cliente.getEndereco() != null)
			if (buscarCliente(cliente) == null) {
				clientes.add(cliente);
				return true;
			}
		return false;
	}
	
	public static boolean removerCliente(Cliente cliente) {
		if(buscarCliente(cliente) != null) {
			clientes.remove(cliente);
			return true;
		}
		return false;
	}
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		if(clienteOld != null && clienteNew != null) {
			if(buscarCliente(clienteNew) == null && buscarCliente(clienteOld) != null) {
				clientes.set(clientes.indexOf(clienteOld), clienteNew);
				return true;
			}	
			return false;
		}
		return false;
	}
}

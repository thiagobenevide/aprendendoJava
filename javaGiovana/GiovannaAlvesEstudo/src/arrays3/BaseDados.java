package arrays3;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Cliente> clientes = new ArrayList<>();
	
	public static Cliente buscarCliente(Cliente cliente) {
		for (Cliente clienteCurrent : clientes) {
			if (clienteCurrent.getCpf().equals(cliente.getCpf())) {
				return clienteCurrent;
			}
		}
		return null;
	}
	
	public static Cliente buscarCliente(String cpf) {
		for (Cliente clienteCurrent : clientes)
			if (clienteCurrent.getCpf().equals(cpf))
				return clienteCurrent;
		return null;
	}
	
	public static boolean isCliente(Cliente cliente) {
		if (buscarCliente(cliente) != null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarCliente(Cliente cliente) {
		if(buscarCliente(cliente) == null) {
			clientes.add(cliente);
			return true;
		}
		return false;
	}
	
	public static boolean removerCliente(Cliente cliente) {
		if (isCliente(cliente) == true) {
			clientes.remove(cliente);
			System.gc();
			return true;
		}
		return false;
	}
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		if(isCliente(clienteOld) == true && isCliente(clienteNew) == false) {
			clientes.set(clientes.indexOf(clienteOld), clienteNew);
			return true;
		}
		return false;
	}
	
	
}

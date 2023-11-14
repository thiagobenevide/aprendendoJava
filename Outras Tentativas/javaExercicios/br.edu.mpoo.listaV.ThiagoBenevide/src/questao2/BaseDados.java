package questao2;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente>clientes;
	
	public static void createBase() {
		clientes = new ArrayList<Cliente>();
	}
	
	
	public static Cliente buscarCliente(Cliente cliente) {
		if(cliente!=null) {
			for(Cliente clienteCurrent: clientes) {
				if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf())) {
					return clienteCurrent;
				}
				
			}
			return null;
		}
		return null;
	}
	
	public static boolean isCliente(String cpf) {
		return clientes.contains(buscarCliente(new Cliente(cpf)));
	}
	
	public static boolean adicionarCliente(Cliente cliente) {
		if(cliente!=null) {
			if(isCliente(cliente.getCpf())) {
				return false;
			}
			clientes.add(cliente);
			return true;
		}
		return false;
		
		
	}
	
	


	public static boolean removeCliente(Cliente cliente) {
		if(cliente!=null && isCliente(cliente.getCpf())) {
			clientes.remove(clientes.indexOf(buscarCliente(cliente)));
			return true;
		}
		return false;
	}
	
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		if(clienteOld!=null && clienteNew!=null && isCliente(clienteOld.getCpf())) {
			clientes.set(clientes.indexOf(clienteOld), clienteNew);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "BaseDados [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}

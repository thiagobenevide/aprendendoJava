package questao2;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente>clientes;
	
	
	public static void createBase() {
		clientes = new ArrayList<Cliente>();
	}
	
	public static Cliente buscarCliente(Cliente cliente) {
		if(cliente!=null)
			for(Cliente clienteCurrent:clientes)
				if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf()))
					return clienteCurrent;
		
		return null;
	}
	
	public static Cliente buscarCliente(String cpf) {
		if(cpf!=null && cpf.length()>0)
			for(Cliente clienteCurrent:clientes)
				if(clienteCurrent.getCpf().equalsIgnoreCase(cpf))
					return clienteCurrent;
		return null;
	}
	
	public static boolean isCliente(Cliente cliente) {
		if(buscarCliente(cliente)!=null)
			return true;
		return false;
			
	}
	
	public static boolean adicionarCliente(Cliente cliente) {
		if(!isCliente(cliente))
			clientes.add(cliente);
		return false;
	}
	
	
	public static boolean removerCliente(Cliente cliente) {
		if(cliente!=null && isCliente(cliente)) {
			Cliente clienteTemp = buscarCliente(cliente);
			clientes.remove(clientes.indexOf(buscarCliente(cliente)));
			clienteTemp = null;
			System.gc();
			return true;
		}
		return false;
			
	}
	
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		if(clienteOld!=null && clienteNew!=null && isCliente(clienteOld)) {
			clientes.set(clientes.indexOf(buscarCliente(clienteNew)), clienteNew);
			return true;
		}
		return false;
	}
	
	public static boolean possuiEnderecoDuplicado(Cliente cliente, Endereco endereco) {
		if(isCliente(cliente)) {
				for(Endereco enderecoCurrent : buscarCliente(cliente).getEnderecos())
					if(enderecoCurrent.getBairro().equals(endereco.getBairro())
							&& enderecoCurrent.getCep().equals(endereco.getCep())
							&& enderecoCurrent.getCidade().equals(endereco.getCidade())
							&& enderecoCurrent.getEstado().equals(endereco.getEstado())
							&& enderecoCurrent.getLogradouro().equals(endereco.getLogradouro())
							&& enderecoCurrent.getNumero() == enderecoCurrent.getNumero()
							) {return true;}
			return false;
		}
		return false;
					
	}
	
	
}

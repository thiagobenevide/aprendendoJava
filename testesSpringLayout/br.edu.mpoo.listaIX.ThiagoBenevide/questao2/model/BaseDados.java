package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente>clientes = new ArrayList<Cliente>();
	private static final String CLIENTE_NULL = "Erro ao adicionar o cliente: Dados inválidos!";
	private static final String CLIENTE_EXISTE = "Erro ao adicionar o cliente: Já existe na base!"; 
	
	private static Cliente buscarCliente(Cliente cliente){
		for(Cliente clienteCurrent: clientes) {
			if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf())) {
				return clienteCurrent;
			}
		}
		return null;
	}
	
	private static Cliente buscarCliente(String cpf) {
		for(Cliente clienteCurrent: clientes) {
			if(clienteCurrent.getCpf().equalsIgnoreCase(cpf)) {
				return clienteCurrent;
			}
		}
		return null;
	}
	
	private static boolean isCliente(Cliente cliente) {
		return clientes.contains(cliente);
	}
	
	public static boolean adicionarCliente(Cliente cliente) throws ClienteException, CPFException {

		if(cliente==null) {
			throw new ClienteException(CLIENTE_NULL);
		}else if(isCliente(cliente)) {
			throw new ClienteException(CLIENTE_EXISTE);
		}else if(Validador.validarCPF(cliente.getCpf())) {
			clientes.add(cliente);
			throw new ClienteException("Cliente adicionado com sucesso!");
		}
		
		return false;
		
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	
	
	
	
}

package questao1;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Cliente> clientes;
	private static final String CLIENTE_NULL = "Erro ao adicionar o cliente: dados inválidos";
	private static final String CLIENTE_EXISTE = "Erro ao adicionar o cliente: já existe na base!";
	
	public static void createBase() {
		
		clientes = new ArrayList<Cliente>();
		inicializarBase();
	}
	
	public static void inicializarBase() {
		
	}
	
	public static Cliente buscarCliente(Cliente cliente) {
		for (Cliente c : clientes) {
			if (c.getCpf().equals(cliente.getCpf())) {
				return c;
			}
		}
		return null;
	}
	
	public static Cliente buscarCliente(String cpf) {
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf))
				return cliente;
		}
		return null;
	}
	
	public static boolean isCliente(Cliente cliente){
		if (buscarCliente(cliente.getCpf()) != null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarCliente(Cliente cliente) throws ClienteException, CPFException {
	
		if (cliente == null) {
			throw new ClienteException(CLIENTE_NULL);
		}
		
		else if(isCliente(cliente) == false) {
		
			if (Validador.validarCPF(cliente.getCpf())) {
				clientes.add(cliente);
				throw new ClienteException("Cliente adicionado com sucesso!");	
			}
		}
		else {
			
			throw new ClienteException(CLIENTE_EXISTE);
		}
		return false;
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
}

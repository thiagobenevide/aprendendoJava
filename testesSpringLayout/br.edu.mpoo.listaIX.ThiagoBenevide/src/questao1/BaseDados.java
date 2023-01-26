package questao1;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Cliente>clientes;
	private static final String CLIENTE_NULL = "Erro ao adicionar o cliente: Dados inválidos!";
	private static final String CLIENTE_EXISTE = "Erro ao adicionar o cliente: Já existe na base!";
	
	public static void createBase()	{
		clientes = new ArrayList<Cliente>();
	}
	
	public static void inicializarBase() {
		
	}
	
	public static Cliente buscarCliente(Cliente cliente) {
		if(cliente!=null) {
			for(Cliente clienteCurrent:clientes) {
				if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf())) {
					return clienteCurrent;
				}
			}
		}
		return null;
	}
	
	public static Cliente buscarCliente(String cpf) {
		if(Validador.validarCPF(cpf)) {
			for(Cliente clienteCurrent: clientes) {
				if(clienteCurrent.getCpf().equalsIgnoreCase(cpf)) {
					return clienteCurrent;
				}
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
	
}

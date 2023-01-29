package questao1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	
	private static Cliente buscarCliente(String cpf) throws CPFException {
		if(Validador.validarCPF(cpf)) {
			for(Cliente clienteCurrent: clientes) {
				if(clienteCurrent.getCpf().equalsIgnoreCase(cpf)) {
					return clienteCurrent;
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, Validador.validarCPF(cpf));
		}
		return null;
	}
	
	private static boolean isCliente(Cliente cliente) {
		if(cliente!=null) {
			return clientes.contains(buscarCliente(cliente));
		}
		return false;
	}
	
	public static boolean adicionarCliente(Cliente cliente) throws ClienteException, CPFException{
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
	
}

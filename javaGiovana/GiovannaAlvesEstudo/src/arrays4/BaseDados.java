package arrays4;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Cliente> clientes;
	
	public static void createBase() {
		clientes = new ArrayList<>();
		inicializar();
	}
	
	private static void inicializar() {
		
		Cliente cliente = new Cliente("081", "Giovanna", "87", "gmail");
		
		BaseDados.adicionarCliente(cliente);
		
		new Conta(1, 9172, 0.5, "123", BaseDados.buscarCliente(cliente));
		
		Banco.sacar(10, BaseDados.buscarCliente(cliente).getContas().get(0));
		Banco.depositar(100, BaseDados.buscarCliente(cliente).getContas().get(0));
		Banco.sacar(10, BaseDados.buscarCliente(cliente).getContas().get(0));
		
	}
	
	public static Cliente buscarCliente(Cliente cliente) {
		for (Cliente clienteCurrent : clientes) {
			if (clienteCurrent.getCpf().equals(cliente.getCpf()))
				return clienteCurrent;
		}
		return null;
	}
	
	public static Cliente buscarCliente(String cpf) {
		for (Cliente clienteCurrent : clientes) {
			if (clienteCurrent.getCpf().equals(cpf))
				return clienteCurrent;
		}
		return null;
	}
	
	public static boolean isCliente(Cliente cliente) {
		if (buscarCliente(cliente) != null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarCliente (Cliente cliente) {
		
		if (buscarCliente(cliente) == null) {
			clientes.add(cliente);
			return true;
		}
		return false;
		
	}
	
	public static boolean removerCliente(Cliente cliente) {
		if (buscarCliente(cliente) != null) {
			clientes.remove(cliente);
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

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	public static int getTamanhoBase() {
		return clientes.size();
	}
	
	public static String getDadosCliente(String cpf) {
		return buscarCliente(cpf).toString();
	}
	
	public static String getDadosBase() {
		
		ArrayList<String> dados = new ArrayList<>();
		
		for (Cliente clienteCurrent : clientes) {
			dados.add(clienteCurrent.toString());
		}
		
		return dados.toString();
		
	}
}

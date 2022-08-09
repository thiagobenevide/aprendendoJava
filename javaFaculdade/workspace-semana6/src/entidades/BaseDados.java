package entidades;

import java.util.ArrayList

public class BaseDados {	
	private static ArrayList<Compra> compras;
	private static ArrayList<Produto> produtos;
	private static ArrayList<Cliente> clientes;
	
	public static void createBase() {
		compras = new ArrayList<Compra>();
		produtos = new ArrayList<Produto>();
		clientes = new ArrayLIst<Cliente>();
		inicializarBase();
	}
	
	private static void inicializarBase() {
		//Adiciona um novo cliente como adiministrador
	}
	
	public static boolean adicionarCompra() {
		if (compra!=null)
			return compras.add(compra); //Comando de inserir compra em arquivo ou bd
		return false;
	}
	
	public static Compra buscarCompra(int id) {
		for (Compra compraCurrent:compras) {
			if (compraCurrent.getId()==id)
				return compraCurrent;
		}
		return null;	
		
	}
	//BaseDados.created()
	//BaseDados.adicionarCompra(compra);
	
	//Clientes
	//Cuidado: falha segurança! Acesso a informações pessoais do cliente
	
	private static Cliente buscarCliente(Cliente cliente) {//Cuidado com o tamanho do objeto
		for(Cliente clienteCurrent:clientes)
			if (clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf()))
				return cliente;
		return null;
	}
	
	//Sobscrever dados e informações
	private static Cliente buscarCliente(Cliente cliente, Adm adm) {//Cuidado com o tamanho do objeto
		for(Cliente clienteCurrent:clientes)
			if (clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf()))
				return cliente;
		return null;
	}
	
	
	private static Cliente buscarCliente(String cpf) {
		for(Cliente clienteCurrent:clientes)
			if (clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf()))
				return clienteCurrent;
		return null;
	}
	
	//Por questões de segurança no final essa busca deve retornar ou um true ou false
	//Se está na minha base o cliente
	//Para ele ser igual a arvore de memória precisa ser igual
	//Só posso adicionar pelo método adicionar
	//Falha de segurança é na comunicação 
	private static boolean isCliente(Cliente cliente) {
		return clientes.contains(buscarCliente(cliente));
	}
	
	
	public static boolean isCliente(String cpf) {
		return clientes.contains(buscarCliente(cpf));
	}
	
	public static boolean adicionarCliente(Cliente cliente) {
		if (cliente!=null) {
			if(!isCliente(cliente))
				return cliente.add(cliente);
		}
		return false;
		
	}
	
	//Questionamento: 
	//A app sabe sabe qual é a tecnologia de armazenamento de dados?
	//Dados de acesso a objeto
	
	
	
	
	//BaseDados.isCliente(cliente)
	public static boolean removerCliente(Cliente cliente) {
		if (cliente!=null)
			return clientes.remove(buscarClente(cliente));
		
		return false;
		
	}
	
	public static boolean atualizarCliente(Cliente clientOld, Cliente clienteNew) {
		if(clienteNew!=null && clieteOld=null)
			if (!isclienteNew())
				cliente.set(clientes.indexOf(buscarCliente(clienteOld)), clienteNew);
				return true;
		return false;
	}
}
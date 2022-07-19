package questao7_3;

import java.util.ArrayList;

public class BaseDados {
	
	private static ArrayList<Pessoa> pessoas;
	
	private static void Base() {
		
		pessoas = new ArrayList<Pessoa>();
	}
	
	public static void createBase() {
		Base();
	}
	
	//CLIENTES
	
	public static boolean adicionarCliente(Cliente cliente) {
		if(cliente == null  || cliente.getNome()==null || cliente.getCpf()==null) {
			return false;
		}
		for (int i=0; i < pessoas.size(); i++)
			if(pessoas.get(i).getCpf().equals(cliente.getCpf()))
				return false;
		System.out.println("Cliente adicionado com sucesso!");
		pessoas.add(cliente);
		return true;
	}
	
	public static Pessoa buscarCliente(Cliente cliente) {
		for (Pessoa pessoasCurrent: pessoas)
			if(pessoasCurrent.getCpf().equals(cliente.getCpf())) {
				return pessoasCurrent;
			}
		return cliente;
	}
	
	public static Pessoa buscarCliente(String cpf) {
		for (Pessoa pessoasCurrent: pessoas)
			if(pessoasCurrent.getCpf().equals(cpf)) {
				return pessoasCurrent;
			}
		return null;
	}
	
	public static boolean isCliente(Cliente cliente) {
		for (Pessoa pessoasCurrent: pessoas)
			if(pessoasCurrent.getCpf().equals(cliente.getCpf())) {
				return true;
			}
		return false;
	}
	
	public static boolean removerCliente(Cliente cliente) {
		if(cliente==null || cliente.getCpf()==null || cliente.getNome()==null)
			return false;
		if(pessoas.contains(buscarCliente(cliente)))
			return pessoas.remove(buscarCliente(cliente));
		return false;
	}
	
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		if (clienteOld!=null && clienteNew!=null)
			if (!isCliente(clienteNew)) {
				pessoas.set(pessoas.indexOf(buscarCliente(clienteOld)), clienteNew);
				return true;
			}
		return false;
	}
	
	// FUNCIONARIO
	
	
	public static boolean adicionarFuncionario(Funcionario funcionario) {
		if(funcionario == null  || funcionario.getNome()==null || funcionario.getCpf()==null) {
			return false;
		}
		for (int i=0; i < pessoas.size(); i++)
			if(pessoas.get(i).getCpf().equals(funcionario.getCpf()))
				return false;
		System.out.println("Funcionario adicionado com sucesso!");
		pessoas.add(funcionario);
		return true;
	}
	
	public static Pessoa buscarFuncionario(Funcionario funcionario) {
		for (Pessoa pessoasCurrent: pessoas)
			if(pessoasCurrent.getCpf().equals(funcionario.getCpf())) {
				return pessoasCurrent;
			}
		return funcionario;
	}
	
	public static Pessoa buscarFuncionario(String cpf) {
		for (Pessoa funcionarioCurrent: pessoas)
			if(funcionarioCurrent.getCpf() == cpf) {
				return funcionarioCurrent;
			}
		return null;
	}
	
	public static boolean isFuncionario(Funcionario funcionario) {
		for (Pessoa pessoasCurrent: pessoas)
			if(pessoasCurrent.getCpf().equals(funcionario.getCpf())) {
				return true;
			}
		return false;
	}
	
	public static boolean removerFuncionario(Funcionario funcionario) {
		if(funcionario==null || funcionario.getCpf()==null || funcionario.getNome()==null)
			return false;
		if(pessoas.contains(buscarFuncionario(funcionario)))
			return pessoas.remove(buscarFuncionario(funcionario));
		return false;
	}
	
	public static boolean atualizarFuncionario(Funcionario funcionarioOld, Funcionario funcionarioNew) {
		if (funcionarioOld!=null && funcionarioNew!=null)
			if (!isFuncionario(funcionarioNew)) {
				pessoas.set(pessoas.indexOf(buscarFuncionario(funcionarioOld)), funcionarioNew);
				return true;
			}
		return false;
	}
	
	
}

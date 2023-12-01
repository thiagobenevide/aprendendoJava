package questao5;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Usuario>usuarios;
	
	public static void createBase() {
		usuarios = new ArrayList<Usuario>();
		inicializarBase();
		
	}
	
	public static void inicializarBase() {
		
	}
	
	public static boolean adicionarCliente(Usuario cliente) {
		if(cliente!=null) 
			if(ValidadorCPF.validador(cliente.getCpf()))
				if(isCliente(cliente))
					usuarios.add(cliente);
		return false;
	}
	
	public static Usuario buscarCliente(String cpf) {
		if(ValidadorCPF.validador(cpf))
			for(Usuario usuarioCurrent: usuarios)
				if(usuarioCurrent.getCpf().equals(cpf))
					return usuarioCurrent; 
		return null;
	}
	
	public static Usuario buscarCliente(Usuario cliente) {
		if(ValidadorCPF.validador(cliente.getCpf()))
			for(Usuario usuarioCurrent: usuarios)
				if(usuarioCurrent.getCpf().equals(cliente.getCpf()))
					return usuarioCurrent; 
		return null;
	}
	
	
	public static boolean isCliente(Usuario cliente) {
		if(buscarCliente(cliente)!=null)
			return true;
		return false;
	}
	
	public static boolean removerCliente(Usuario cliente) {
		if(cliente!=null)
			if(isCliente(cliente)) {
				usuarios.remove(usuarios.indexOf(buscarCliente(cliente.getCpf())));
				return true;
			}
				
		return false;
	}
	
	
	public static boolean atualizarCliente(Usuario clienteNew, Usuario clienteOld) {
		if(clienteNew !=null && clienteOld != null)
			if(isCliente(clienteOld)) {
				if(clienteNew.getEmail()!=null)
					buscarCliente(clienteOld).setEmail(clienteNew.getEmail());
				if(clienteNew.getNome()!=null)
					buscarCliente(clienteOld).setNome(clienteNew.getNome());
				return true;
			}
		
		return false;
			
	}
	
	
	
	
	
	
}
	
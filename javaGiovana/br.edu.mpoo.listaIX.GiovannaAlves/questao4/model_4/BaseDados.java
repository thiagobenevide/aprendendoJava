package model_4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BaseDados {

	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public static boolean addUsuario(Usuario usuario) throws NullUsuarioExpection {

		if (buscarUsuario(usuario.getCpf()) == null) {
			usuarios.add(usuario);
			JOptionPane.showMessageDialog(null, "Usuário adicionado a base!");
			return true;
		}
		
		JOptionPane.showMessageDialog(null, "Usuário já existe na base!");
		return false;
	}
	
	public static boolean removerUsuario(Usuario usuario) throws NullUsuarioExpection {
		
		if (buscarUsuario(usuario) != null) {
			usuarios.remove(usuario);
			System.gc();
			return true;
		}
		
		throw new NullUsuarioExpection("Usuário não existe não encontrado!");
	}
	
	public static boolean existeUsuario(Usuario usuario) throws NullUsuarioExpection {
		
		try {
			if (usuario instanceof Cliente) {
				try {
					if (buscarUsuario(usuario.getCpf()) != null) {
						return true;
					}
					else {
						throw new NullUsuarioExpection("Cliente não existe!");
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static Usuario buscarUsuario(String cpf) {
		
		for (Usuario userCurrent : usuarios) {
			if (userCurrent.getCpf().equals(cpf)) 
				return userCurrent;
		}
		return null;
	}
	
	public static Usuario buscarUsuario(Usuario usuario) throws NullUsuarioExpection {
	
		for (Usuario userCurrent : usuarios) {
			if (userCurrent.getCpf().equals(usuario.getCpf())){
				return userCurrent;
			}
		}
		throw new NullUsuarioExpection("Usuário não encontrado!");
	}
	
	public static String consultarDadosUsuario(Usuario usuario) throws NullUsuarioExpection {
		
		if (buscarUsuario(usuario.getCpf()) != null) {
			System.out.println(buscarUsuario(usuario.getCpf()).toString());;
		}
		return null;
	}
	
}

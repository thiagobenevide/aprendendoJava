package model;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<UsuarioAbstract> usuarios;
	
	public static UsuarioAbstract buscarUsuario(UsuarioAbstract usuario) {
		for (UsuarioAbstract userCurrent : usuarios) {
			if (userCurrent.getCpf().equals(usuario.getCpf())){
				return userCurrent;
			}
		}
		return null;
	}
	
	
	public static boolean buscarUsuario(String login, String senha) {
		for (UsuarioAbstract userCurrent : usuarios) {
			if (userCurrent.getLogin().equalsIgnoreCase(login) && userCurrent.getSenha().equals(senha)){
				return true;
			}
		}
		return false;
	}
	
	
	public static UsuarioAbstract buscarUsuario(String cpf) {
		for(UsuarioAbstract user : usuarios) {
			if (user.getCpf().equals(cpf)) {
				return user;
			}
		}
		return null;
	}
	
	public static boolean isUsuario(UsuarioAbstract usuario) {
		if (buscarUsuario(usuario)  != null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarUsuario(UsuarioAbstract usuario) {
		if(isUsuario(usuario) == false) {
			usuarios.add(usuario);
			return true;
		}
		return false;
	}
	
	public static boolean removerUsuario(UsuarioAbstract usuario) {
		if (isUsuario(usuario) == true) {
			usuarios.remove(usuario);
			return true;
		}
		return false;
	}
	
	public static boolean atualizarUsuario(UsuarioAbstract usuarioOld, UsuarioAbstract usuarioNew) {
		if (isUsuario(usuarioOld) == true && isUsuario(usuarioNew) == false) {
			usuarios.set(usuarios.indexOf(usuarioOld), usuarioNew);
			return true;
		}
		
		return false;
	}
	
	public static void createBase() {
		usuarios = new ArrayList<UsuarioAbstract>();
		iniciliazarBase();
	}
	
	private static void iniciliazarBase() {
		// colocar os obj
	}


	public static ArrayList<UsuarioAbstract> getUsuarios() {
		return usuarios;
	}
	
}

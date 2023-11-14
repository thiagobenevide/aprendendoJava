package base;

import java.util.ArrayList;

import entidades.UsuarioAbstract;

public class BaseDados {
	public static ArrayList<UsuarioAbstract> usuarios;
	
	public static void createBase() {
		usuarios = new ArrayList<UsuarioAbstract>();
		
	}
	
	private static UsuarioAbstract buscarUsuario(UsuarioAbstract usuario) {
		if(usuario!=null) {
			for(UsuarioAbstract usuarioCurrent:usuarios) {
				if(usuarioCurrent.getCpf().equalsIgnoreCase(usuario.getCpf())) {
					return usuarioCurrent;
				}
			}
		}
		return null;
	}
	
	private static UsuarioAbstract buscarUsuario(String cpf) {
		for(UsuarioAbstract usuarioCurrent : usuarios) {
			if(usuarioCurrent.getCpf().equalsIgnoreCase(cpf)) {
				return usuarioCurrent;
			}
		}
		return null;
	}
	
	public static boolean isUsuario(UsuarioAbstract usuario) {
		if(usuario!=null) {
			usuarios.contains(buscarUsuario(usuario));
			return true;
		}
		return false;
	}
	
	public static boolean isUsuario(String cpf) {
		return usuarios.contains(buscarUsuario(cpf));
	}
	
	public static boolean adicionarUsuario(UsuarioAbstract usuario) {
		if(usuario != null && isUsuario(usuario)) {
			usuarios.add(usuario);
			return true;
		}
		return false;
	}
	
	public static boolean removerUsuario(UsuarioAbstract usuario) {
		if(usuario!=null && isUsuario(usuario) == true) {
			usuarios.remove(usuarios.indexOf(buscarUsuario(usuario)));
			return true;
		}
		return false;
	}
	
	
	public static boolean atualizarUsuario(UsuarioAbstract usuarioOld, UsuarioAbstract usuarioNew) {
		if(usuarioOld!=null && usuarioNew!=null && isUsuario(usuarioOld) == true) {
			usuarios.set(usuarios.indexOf(usuarioOld), usuarioNew);
			return true;
		}
		return false;
	}
	
	
	
}

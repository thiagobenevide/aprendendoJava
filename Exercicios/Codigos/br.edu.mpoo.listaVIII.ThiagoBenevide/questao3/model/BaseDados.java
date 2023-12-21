package model;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<UsuarioAbstract>usuarios;
	
	public static void createBase() {
		usuarios = new ArrayList<UsuarioAbstract>();
		inicializarBase();
	}
	
	public static void inicializarBase() {
		
	}
	
	public static UsuarioAbstract buscarUsuario(UsuarioAbstract usuario) {
		if(usuario!=null) {
			for(UsuarioAbstract usuarioCurrent : usuarios) {
				if(usuarioCurrent.getCpf().equalsIgnoreCase(usuario.getCpf()))
					return usuarioCurrent;
			}
			return null;
		}
		return null;
	}
	
	public static UsuarioAbstract buscarUsuario(String cpf) {
		if(cpf!=null) {
			for(UsuarioAbstract usuarioCurrent : usuarios) {
				if(usuarioCurrent.getCpf().equalsIgnoreCase(cpf))
					return usuarioCurrent;
			}
			return null;
		}
		return null;
	}
	
	public static boolean isUsuario(UsuarioAbstract usuario) {
		if(buscarUsuario(usuario)!=null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarUsuario(UsuarioAbstract usuario) {
		if(isUsuario(usuario)) {
			return false;
		}else {
			usuarios.add(usuario);
		}
		return false;
	}
	
	public static boolean removeUsuario(UsuarioAbstract usuario) {
		if(isUsuario(usuario)) {
			usuarios.remove(usuarios.indexOf(buscarUsuario(usuario)));
			return true;
		}
		return false;
	}
	
	public static boolean atualizarUsuario(UsuarioAbstract usuarioOld, UsuarioAbstract usuarioNew) {
		if(usuarioOld!=null && usuarioNew!=null) {
			if(isUsuario(usuarioOld)) {
				if(isUsuario(usuarioNew)) {
					return false;
				}else {
					usuarios.set(usuarios.indexOf(buscarUsuario(usuarioOld)), usuarioNew);
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}
	
	
	
	
}

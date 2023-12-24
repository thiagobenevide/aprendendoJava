package model;

import java.util.ArrayList;

public class BaseDados2 {
	public static ArrayList<UsuarioAbstract3>usuarios;
	
	public static void createBase() {
		usuarios = new ArrayList<UsuarioAbstract3>();
		inicializarBase();
	}
	
	public static void inicializarBase() {
		
	}
	
	public static UsuarioAbstract3 buscarUsuario(UsuarioAbstract3 usuario) {
		if(usuario!=null) {
			for(UsuarioAbstract3 usuarioCurrent : usuarios) {
				if(usuarioCurrent.getCpf().equalsIgnoreCase(usuario.getCpf()))
					return usuarioCurrent;
			}
			return null;
		}
		return null;
	}
	
	public static UsuarioAbstract3 buscarUsuario(String cpf) {
		if(cpf!=null) {
			for(UsuarioAbstract3 usuarioCurrent : usuarios) {
				if(usuarioCurrent.getCpf().equalsIgnoreCase(cpf))
					return usuarioCurrent;
			}
			return null;
		}
		return null;
	}
	
	public static boolean isUsuario(UsuarioAbstract3 usuario) {
		if(buscarUsuario(usuario)!=null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarUsuario(UsuarioAbstract3 usuario) {
		if(isUsuario(usuario)) {
			return false;
		}else {
			usuarios.add(usuario);
		}
		return false;
	}
	
	public static boolean removeUsuario(UsuarioAbstract3 usuario) {
		if(isUsuario(usuario)) {
			usuarios.remove(usuarios.indexOf(buscarUsuario(usuario)));
			return true;
		}
		return false;
	}
	
	public static boolean atualizarUsuario(UsuarioAbstract3 usuarioOld, UsuarioAbstract3 usuarioNew) {
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

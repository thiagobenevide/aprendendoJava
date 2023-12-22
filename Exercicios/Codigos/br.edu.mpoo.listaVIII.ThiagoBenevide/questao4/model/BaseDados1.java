package model;

import java.util.ArrayList;

public class BaseDados1 {
	private static ArrayList<UsuarioAbstract2>usuarios;
	
	public static void createBase() {
		usuarios = new ArrayList<UsuarioAbstract2>();
		inicializarBase();
	}
	
	public static void inicializarBase() {
		
	}
	
	public static UsuarioAbstract2 buscarUsuario(UsuarioAbstract2 usuario) {
		if(usuario!=null) {
			for(UsuarioAbstract2 usuarioCurrent : usuarios) {
				if(usuarioCurrent.getCpf().equalsIgnoreCase(usuario.getCpf()))
					return usuarioCurrent;
			}
			return null;
		}
		return null;
	}
	
	public static UsuarioAbstract2 buscarUsuario(String cpf) {
		if(cpf!=null) {
			for(UsuarioAbstract2 usuarioCurrent : usuarios) {
				if(usuarioCurrent.getCpf().equalsIgnoreCase(cpf))
					return usuarioCurrent;
			}
			return null;
		}
		return null;
	}
	
	public static boolean isUsuario(UsuarioAbstract2 usuario) {
		if(buscarUsuario(usuario)!=null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarUsuario(UsuarioAbstract2 usuario) {
		if(!isUsuario(usuario)) {
			usuarios.add(usuario);
		}
		return false;
		
	}
	
	public static boolean removeUsuario(UsuarioAbstract2 usuario) {
		if(isUsuario(usuario)) {
			usuarios.remove(usuarios.indexOf(buscarUsuario(usuario)));
			return true;
		}
		return false;
	}
	
	public static boolean atualizarUsuario(UsuarioAbstract2 usuarioOld, UsuarioAbstract2 usuarioNew) {
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
	
	public static ArrayList<String> usuariosBase(){
		ArrayList<String>usuariosTemp = new ArrayList<String>();
		for(UsuarioAbstract2 usuarioCurrent : usuarios)
			usuariosTemp.add(usuarioCurrent.getNome());
		return usuariosTemp;
	}
	
	
}

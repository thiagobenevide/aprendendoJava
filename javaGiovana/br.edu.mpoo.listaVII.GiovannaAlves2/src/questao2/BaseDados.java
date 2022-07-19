package questao2;

import java.util.ArrayList;

public class BaseDados {

	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void createBase() {
		usuarios = new ArrayList<Usuario>();
	}
	
	public static Usuario buscarUsuario(Usuario usuario) {
		if (usuario != null)
			for (Usuario userCorrente : usuarios)
				if (userCorrente.getCpf().equals(usuario.getCpf()))
					return userCorrente;
		return null;
	}
	
	public static Usuario buscarUsuario(String cpf) {
		if (cpf != null)
			for (Usuario userCorrente : usuarios)
				if (userCorrente.getCpf().equals(cpf))
					return userCorrente;
		return null;
	}
	
	public static boolean isUsuario(Usuario usuario) {
		if (buscarUsuario(usuario) != null)
			return true;
		return false;
	}
	
	public static boolean isUsuario(String cpf) {
		if (buscarUsuario(cpf) != null)
			return true;
		return false;
	}
	public static boolean adicionarUsuario(Usuario usuario) {
		if (usuario != null) {
			if (isUsuario(usuario) == false)
				usuarios.add(usuario);
				return true;
		}
		return false;
	}
	
	public static boolean removerUsuario(Usuario usuario) {
		if(isUsuario(usuario) == true) {
			usuarios.remove(usuario);
			return true;
		}
		return false;
	}
	
	public static boolean atualizarUsuario(Usuario usuarioOld, Usuario usuarioNew) {
		if (usuarioOld != null && usuarioNew != null) {
			if (isUsuario(usuarioOld) == true && isUsuario(usuarioNew) == false) {
				usuarios.set(usuarios.indexOf(usuarioOld), usuarioNew);
				return true;
			}
		}
		return false;
	}
}

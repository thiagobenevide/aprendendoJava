package questao1;

import java.util.ArrayList;

public class BaseDados {

	public static ArrayList<UsuarioAbstract> usuarios = new ArrayList<UsuarioAbstract>();

	public static UsuarioAbstract buscarUsuario(UsuarioAbstract usuario) {
		try {
			for (UsuarioAbstract user : usuarios) {
				if (user.getCpf().equals(usuario.getCpf()))
					return user;
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static UsuarioAbstract buscarUsuario(String cpf) {
		try {
			for (UsuarioAbstract user : usuarios) {
				if (user.getCpf().equals(cpf))
					return user;
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;

	}
	
	public static boolean isUsuario(UsuarioAbstract usuario) {
		try {
			if (buscarUsuario(usuario) != null) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean adicionarUsuario(UsuarioAbstract usuario) {
		try {
			if (buscarUsuario(usuario) == null) {
				usuarios.add(usuario);
				return true;
			}
			
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean removerUsuario(UsuarioAbstract usuario) {
		try {
			if (buscarUsuario(usuario) != null) {
				usuarios.remove(usuario);
				return true;
			}
			
			return false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean atualizarUsuario(UsuarioAbstract usuarioOld, UsuarioAbstract usuarioNew) {
		try {
			if (buscarUsuario(usuarioOld) != null && buscarUsuario(usuarioNew) == null) {
				usuarios.set(usuarios.indexOf(usuarioOld), usuarioNew);
				return true;
			}
			
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
}

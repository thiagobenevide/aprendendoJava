package base;


import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import entidade.UsuarioAbstract;

public class BaseDados {

	public static ArrayList<UsuarioAbstract>usuarios;
	
	
	public static void createBase() {
		usuarios =  new ArrayList<UsuarioAbstract>();
	}
	
	public static UsuarioAbstract buscarUsuarios(UsuarioAbstract usuario) {
		if(usuario!=null) {
			for(UsuarioAbstract usuarioCurrent: usuarios) {
				if(usuarioCurrent.getCpf().equalsIgnoreCase(usuario.getCpf())) {
					return usuarioCurrent;
				}
				return null;
			}
		}
		return null;
	}
	
	public static UsuarioAbstract buscarUsuarios(String cpf) {
		for(UsuarioAbstract usuarioCurrent: usuarios) {
			if(usuarioCurrent.getCpf().equalsIgnoreCase(cpf)) {
				return usuarioCurrent;
			}
			return null;
		}
	
		return null;
	}
	
	public static boolean isUsuario(UsuarioAbstract usuario) {
		if(usuario!=null) {
			return usuarios.contains(buscarUsuarios(usuario));
		}
		return false;
	}
	
	
	public static boolean adicionarUsuario(UsuarioAbstract usuario){
		if(usuario!=null) {
			if(isUsuario(usuario)) {
				JOptionPane.showMessageDialog(null, "Erro ao adicionar, usuário já existente!");
				return false;
			}
			usuarios.add(usuario);
			JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
			return true;
		}
		JOptionPane.showMessageDialog(null, "Não foi possível adicionar o usuário!");
		return false;
	}
	
	public static boolean removerUsuario(UsuarioAbstract usuario) {
		if(usuario!=null && isUsuario(usuario)) {
			usuarios.remove(usuarios.indexOf(buscarUsuarios(usuario)));
			JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
			return true;
		}
		JOptionPane.showMessageDialog(null, "Não foi possível remover o usuário!");
		return false;
	}
	
	public static boolean atualizarUsuario(UsuarioAbstract usuarioOld, UsuarioAbstract usuarioNew) {
		if(usuarioOld!=null && usuarioNew !=null && isUsuario(usuarioOld) && isUsuario(usuarioNew)==false) {
			usuarios.set(usuarios.indexOf(usuarioOld), usuarioNew);
			JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
			return true;
		}
		JOptionPane.showMessageDialog(null, "Não foi possível atualizar o usuário!");
		return false;
	}
	
}

package sistema.model;


public class Validador {
	public static boolean validarUsuario(String login, String senha){
//		if (login.equalsIgnoreCase(BaseDados.getUser1().getLogin()) &&
//			senha.equals(BaseDados.getUser1().getSenha())) 
//			return true;
//		if (login.equalsIgnoreCase(BaseDados.getAdmin().getLogin()) &&
//			senha.equals(BaseDados.getAdmin().getSenha()))
//			return true;
//		return false;
		
//		ffazendo uso da BaseDados com ArrayList
//		if (BaseDados.buscarUsuario(login, senha)!=null)
//			return true;
//		return false;
		
		return BaseDados.isUsuario(login, senha);
	}
	
	public static boolean validarUsuario(UsuarioOld usuario){
//		if (usuario.getLogin().equalsIgnoreCase(BaseDados.getUser1().getLogin()) &&
//				usuario.getSenha().equals(BaseDados.getUser1().getSenha())) 
//				return true;
//			if (usuario.getLogin().equalsIgnoreCase(BaseDados.getAdmin().getLogin()) &&
//					usuario.getSenha().equals(BaseDados.getAdmin().getSenha()))
//				return true;
//			return false;
		//fazer varredura ak ocorreria em redundância de código!
//		if (BaseDados.buscarUsuario(usuario.getLogin(), usuario.getSenha())!=null)
//			return true;
//		return false;
		
		return BaseDados.isUsuario(usuario.getLogin(), usuario.getSenha());
	}
}
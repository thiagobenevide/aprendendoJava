package sistema.model;

import java.util.ArrayList;

public class BaseDados {
//	ROM
	//conexão com um SGBD
	//abrir/fechar um txt, xml, csv
	//em código-fonte
//	RAM
	// variável simples/classe
	// estrutura de dados
	
	
	//CRUD - create, retrieve, update, delete
//	         estabelecerconexão
	
//	cardinalidade 1..1
//	private static Usuario user1;
//	private static Usuario admin;
	
	//cardinalidade passará a ser 1..N
	private static ArrayList<Usuario> usuarios;
	
	public static void createBase(){
//		user1 = new Usuario();
//		admin= new Usuario();
		usuarios = new ArrayList<Usuario>();
		
		inicializarBase();
	}
	
	private static void inicializarBase(){
//		user1.setLogin("jose");
//		user1.setSenha("jose1234");
//		
//		admin.setLogin("admin");
//		admin.setSenha("admin");
		
		usuarios.add(new Usuario("jose", "jose1234"));
		usuarios.add(new Usuario("admin", "admin"));
	}
	
//	private static Usuario buscarUsuario(String login){}
	
	//ERRO de POLIMORFISMO - mesma assinatura
	
	//lembrar que precisaria de um comments
	public static ArrayList<String> buscarUsuario(String login){
		if (login==null || login.equalsIgnoreCase(""))
			return null;
		
		Usuario userTemp = buscarUsuario(new Usuario(login));
		ArrayList<String> dadosUsuario = new ArrayList<String>();
				
		dadosUsuario.add(userTemp.getLogin());
//		dadosUsuario.add(userTemp.getSenha());//mas não pode ter acesso a senha (SEGURANÇA)
//		dadosUsuario.add(userTemp.get....());//e assim para outros atributos que existissem
		
		return dadosUsuario;
	}
	
	//Tendo em vista que o sistema pede a senha, usar buscarUsuario ou isUsuario!
	//Falha de segurança se deixar public
	private static Usuario buscarUsuario(String login, String senha){
		if (login == null || senha == null)
			return null;

		for (Usuario userCurrent : usuarios){
			if (userCurrent.getLogin().equalsIgnoreCase(login)
					&&
				userCurrent.getSenha().equalsIgnoreCase(senha)
				)
				return userCurrent;
		}
		return null;
	}

	private static Usuario buscarUsuario(Usuario usuario){
		if (usuario == null)
			return null;

		for (Usuario userCurrent : usuarios){
			if (userCurrent.getLogin().equalsIgnoreCase(usuario.getLogin()))
				return userCurrent;
		}
		return null;
	}
	
	public static boolean isUsuario(Usuario usuario){
//		if (buscarUsuario(usuario)!=null)
//			return true;
//		
//		return false;
		//verificará sem a senha
		return usuarios.contains(buscarUsuario(usuario));
	}
	
	//Respeita segurança de dados 
	public static boolean isUsuario(String login, String senha){
//		if (buscarUsuario(usuario)!=null)
//			return true;
//		
//		return false;
		return usuarios.contains(buscarUsuario(login, senha));
	}
	
	public static boolean adicionarUsuario(Usuario usuario){
		//Pode-se incorporar regras de negócios definidas no sistema
		/*Ex.: Só pode haver um usuario válido
		 * 
		 * RN001 - cada usuario possui login único
		 * RN002 - cada usuario possui como "chave primária" o cpf (cpf único)
		 * RN003 - um usuário precisa ter um cpf válido
		 */

		
//		if (!ValidadorCPF.validarCPF(usuario.getCPF())) RN003
//			return false;
			
		
		//fazer uma varredura para atender as RNs: Ex.: RN001
//		for (Usuario userCurrent : usuarios){
//			if (userCurrent.getLogin().equalsIgnoreCase(usuario.getLogin())){//RN001
//				return false;		
//			}
//		}
		
		//substituindo a varredura pelo buscarUsuario
		
//		if (buscarUsuario(usuario)!=null)
//			return false;
		if (isUsuario(usuario))
			return false;
		return usuarios.add(usuario);
	}
	
	//Vantagens de OO: reusabilidade de código -> não duplicar código
	
	public static boolean removerUsuario(Usuario usuario){
//		for (Usuario userCurrent : usuarios){
//			if (userCurrent.getLogin().equalsIgnoreCase(usuario.getLogin())){
//				return usuarios.remove(userCurrent);
////				return usuarios.remove(usuario);
//			}
//		}
		
//		substituindo pelo buscarUsuario
		
		//CUIDADO AO ERRO DE LÓGICA
//		if (buscarUsuario(usuario)!=null)
//			return usuarios.remove(usuario);
		return usuarios.remove(buscarUsuario(usuario));//
		
		//query sql de acesso ao sgbd
	}

	public static boolean atualizarUsuario(Usuario Usuario, Usuario usuarioNew){
		
		if (Usuario==null || usuarioNew==null)
			return false;
		
		usuarios.set(usuarios.indexOf(buscarUsuario(Usuario)), usuarioNew);
		return true;
	}
	
	//Questionamento: Qual o problema que a solução anterior gerava em deixar o getters 
	//               para elementos da base?
	//Resposta: Falha de segurança!
	
//	public static Usuario getUser1() { //retrieve
//		return user1;
//	}
//
//	public static Usuario getAdmin() {//retrieve
//		return admin;
//	}
}
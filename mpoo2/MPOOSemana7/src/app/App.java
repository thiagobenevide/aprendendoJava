package app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import sistema.controller.LoginController;
import sistema.model.BaseDados;
import sistema.model.NaoUsuario;
import sistema.model.Pessoa;
import sistema.model.Usuario2;
import sistema.view.LoginView;

public class App {
	public static void main(String[] args) {
		
//		new Pessoa("nome", "cpf", "email"); //abstract - não permite instanciar
		new NaoUsuario("nome", "cpf", "email"); // ok objeto anônimo
		Usuario2 usuario = new Usuario2("José Silva", "111.111.111-11", "ze@gmail.com", "zesilva", "12345");
		Pessoa usuario2 = new Usuario2("José Silva", "111.111.111-11", "ze@gmail.com", "zesilva", "12345");
//		System.out.println(usuario.getCpf_2());
//		System.out.println(usuario.getCpf());
		System.out.println(usuario.cpf);
		
		System.out.println(usuario instanceof Usuario2);
		System.out.println(usuario instanceof Pessoa);
//		System.out.println(usuario instanceof NaoUsuario);
		
		if (usuario2 instanceof Usuario2)
			System.out.println(((Usuario2)usuario2).getLogin()); //como fazer para voltar ao tipo em que foi criado? downcast
		                                          //vinculação dinâmica de memória
		                                          //"polimorfismo de objeto"
		
		
		
//		try {
//			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//		} catch (ClassNotFoundException | InstantiationException
//				| IllegalAccessException | UnsupportedLookAndFeelException e) {
//			e.printStackTrace();
//		}
//		
//		BaseDados.createBase();
//		LoginView loginView = new LoginView();
//		LoginController loginController = new LoginController(loginView);
	}
}
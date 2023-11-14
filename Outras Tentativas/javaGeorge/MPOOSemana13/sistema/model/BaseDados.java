package model;

import java.util.ArrayList;
import java.util.Date;

public class BaseDados {
	static ArrayList<UsuarioAbstract> usuarios;
	
	public static void createBase(){
		usuarios = new ArrayList<UsuarioAbstract>();
		inicializarBase();
	}
	
	private static void inicializarBase(){
		//Obs.: É preciso alterar a data de nascimento para simular um aniversariante
		usuarios.add(new Cliente("José Silva", "1111", "111.111.111-11", new Date(1980, 9, 19), 0));
		usuarios.add(new Cliente("Maria Silva", "1111", "222.111.111-11", new Date(1985, 9, 22), 0));
		usuarios.add(new Cliente("João Santos", "1111", "333.111.111-11", new Date(1980, 02, 2), 0));
		usuarios.add(new Funcionario("João Santos", "1111", "333.111.111-11", new Date(1980, 04, 8), 10));
	}

}

package model;

import java.util.ArrayList;
import java.util.Date;

public class BaseDados {
	public static ArrayList<UsuarioAbstract> usuarios;
	
	@SuppressWarnings("deprecation")
	
	public static void incializarBaseDados(){
		 usuarios = new ArrayList<UsuarioAbstract>();

		 usuarios.add(new Cliente("Beto Silva", "123", "111.111.111-11", new Date(1980,9,19)));
		 usuarios.add(new Cliente("Jose Silva", "123", "333.333.333-33", new Date(1990,12,30)));
		 usuarios.add(new Funcionario("maria Silva", "12333", "222.222.222-22", new Date(1980,01,03)));
		 
//		 usuarios.add(new Cliente("Beto Silva", "123", "111.111.111-11", new Date(22/11/1980)));
//		 usuarios.add(new Cliente("Jose Silva", "123", "333.333.333-33", new Date(30/12/1990)));
//		 usuarios.add(new Funcionario("maria Silva", "12333", "222.222.222-22", new Date(03/01/1980)));
	}

	public ArrayList<UsuarioAbstract> getUsuarios() {
		return usuarios;
	}
}
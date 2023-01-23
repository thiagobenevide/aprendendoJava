package entidade;

import base.BaseDados;
import javax.swing.SpringLayout;

import gui.TelaCadastro;

public class App {
	public static void main(String[] args) {
		BaseDados.createBase();
		/*
		UsuarioAbstract cliente1 = new Cliente("Thiago", "13077735407", "thiagobenevide@live.com", "87999026780", true);
		UsuarioAbstract cliente2 = new Cliente("Thiago", "13077735407", "thiagobenevide@live.com", "87999026780", true);
		UsuarioAbstract funcionario1 = new Funcionario("Thiago", "13077735407", "thiagobenevide@live.com", "87999026780","12546");
		BaseDados.adicionarUsuario(cliente1);
		BaseDados.adicionarUsuario(cliente2);
		BaseDados.adicionarUsuario(funcionario1);
		
		BaseDados.removerUsuario(cliente1);
		*/
		
		
		TelaCadastro tela =  new TelaCadastro();
		
		 
		
		
		
	}
}

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import model.MalaDiretaParabens;
//import controller.GerenciamentoController.ButtonHandler;
import view.TelaAbertura;
import view.TelaGerenciamento;

public class Controller {

	AberturaController aberturaController;
	GerenciamentoController gerenciamentoController;
	CadastrarUsuarioController cadastrarUsuarioController;
	TelaAbertura telaAbertura;
	TelaGerenciamento telaGerenciamento;

	public Controller(TelaAbertura telaAbertura, TelaGerenciamento telaGerenciamento) {
		this.telaAbertura = telaAbertura;
		this.telaGerenciamento= telaGerenciamento;
		
		aberturaController = new AberturaController(telaAbertura, telaGerenciamento);
		gerenciamentoController = new GerenciamentoController(telaGerenciamento);
		cadastrarUsuarioController = new CadastrarUsuarioController(telaGerenciamento.getCadastrarProdutoPanel());

	}
}
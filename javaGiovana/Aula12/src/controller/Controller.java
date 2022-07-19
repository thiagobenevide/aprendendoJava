package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import GUI.TelaMedico;
import GUI.TelaRecepcao;
import model.FichaAtendimento;

public class Controller implements ActionListener {

	TelaMedico telaMedico;
	ArrayList<TelaRecepcao> telasRecepcao;
	FichaAtendimento fichaAtendimento;
	
	
	public Controller(TelaMedico telaMedico, ArrayList<TelaRecepcao> telasRecepcao, FichaAtendimento fichaAtendimento) {
		this.telaMedico = telaMedico;
		this.telasRecepcao = telasRecepcao;
		this.fichaAtendimento = fichaAtendimento;
		control();
	}
	
	private void control() {
		telaMedico.getProximaFichaButton().addActionListener(this);
	}

	private void atualizarChamada() {
		fichaAtendimento.chamarProx();
		telaMedico.getNumeroFichaLabel().setText(fichaAtendimento.getNumero());
		
		for (TelaRecepcao telaCurrente : telas) {
			telasRecepcao.getNumeroFichaLabel().setText(fichaAtendimento.getNumero());
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaMedico.getProximaFichaButton()) {
		}
		
	}
	
	
	
}

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

//Solu��o 4
public class ButtonHandler implements ActionListener{
	
	TelaTratamentoEventoOutraClasseExterna tela;
	
	public ButtonHandler(TelaTratamentoEventoOutraClasseExterna tela) {
		this.tela = tela;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==tela.getAddButton())
			JOptionPane.showMessageDialog(null, "bot�o Add pressionado");
		
		if (event.getSource()==tela.getSairButton())
			System.exit(0);//encerra o sistema
	}
}
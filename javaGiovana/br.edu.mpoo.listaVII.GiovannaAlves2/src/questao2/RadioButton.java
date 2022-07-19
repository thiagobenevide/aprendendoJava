package questao2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton implements ActionListener {

	Tela tela;
	
	public RadioButton(Tela tela) {
		 this.tela = tela;
		 } 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(tela.opcao1Radio.equals(e.getSource())) {
			tela.matriculaField.setVisible(false);
			tela.matriculaLabel.setVisible(false);
		}
		
		if (e.getSource().equals(tela.opcao2Radio.isSelected())) {
			tela.matriculaField.setVisible(true);
			tela.matriculaLabel.setVisible(true);
			tela.checkBox.setVisible(false);
		}
		
	}

	
	
}

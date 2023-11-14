package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProdutoPanel extends JPanel{
	JLabel nomeLabel, codBarrasLabel;
	JTextField nomeField, codBarrasField;
	JButton button;
	
	public ProdutoPanel(String nomeButton) {
		setSize(200,200);
		
		nomeLabel = new JLabel("Nome:");
		codBarrasLabel = new JLabel("CodBarras:");
		nomeField = new JTextField(10);
		codBarrasField = new JTextField(10);
		
		button = new JButton(nomeButton);
//		button.setText("Remover");

		add(nomeLabel);
		add(nomeField);
		
		add(codBarrasLabel);
		add(codBarrasField);
		
		add(button);
		setVisible(false);
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JButton getButton() {
		return button;
	}

	public JTextField getCodBarrasField() {
		return codBarrasField;
	}
}
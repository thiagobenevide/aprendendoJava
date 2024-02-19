package mpooStore.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import mpooStore.util.SpringUtilities;

public class CamposPanel extends JPanel{
	
	JLabel nomeLabel, cpfLabel, emailLabel;
	JFormattedTextField cpfFormatField;
	JTextField nomeField, emailField; 
	
	
	public CamposPanel() {
		setLayout(new SpringLayout());
		nomeLabel = new JLabel("Nome: ");
		cpfLabel = new JLabel("Cpf: ");
		emailLabel = new JLabel("Email: ");
		try {
			cpfFormatField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfFormatField.setColumns(30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		nomeField = new JTextField(30);
		emailField = new JTextField(30);
		
		add(nomeLabel);
        add(nomeField);
        add(cpfLabel);
        add(cpfFormatField);
        add(emailLabel);
        add(emailField);
        
        SpringUtilities.makeCompactGrid(this, 3, 2, 0, 0, 0, 0);
		
	}
	
	public JFormattedTextField getCpfFormatField() {
		return cpfFormatField;
	}


	public JTextField getNomeField() {
		return nomeField;
	}


	public JTextField getEmailField() {
		return emailField;
	}
	
	
}
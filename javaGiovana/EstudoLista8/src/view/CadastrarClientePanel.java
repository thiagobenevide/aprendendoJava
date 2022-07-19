package view;


import java.awt.BorderLayout;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import util.SpringUtilities;

public class CadastrarClientePanel extends JPanel {

	JLabel tituloLabel, nomeLabel, sexoLabel, cpfLabel, foneLabel, emailLabel;
	JTextField nomeField, cpfField, foneField, emailField;
	JRadioButton masculinoRadioButton, femininoRadioButton;
	JButton adicionarButton;
	JCheckBox propaganda;
	
	JPanel painelTitulo, painelRadioButton, painelCentral; 
	
	public CadastrarClientePanel() {
		
		setLayout(new BorderLayout());
		
		painelTitulo = new JPanel();
		tituloLabel = new JLabel("Cliente");
		painelTitulo.add(tituloLabel);
		
		sexoLabel = new JLabel("Sexo: ");
		
		painelRadioButton = new JPanel(new SpringLayout());
		
		masculinoRadioButton = new JRadioButton("Masculino", true);
		femininoRadioButton = new JRadioButton("Feminino", false);

		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(masculinoRadioButton);
		buttonGroup.add(femininoRadioButton);
		
		painelRadioButton.add(masculinoRadioButton);
		painelRadioButton.add(femininoRadioButton);
		
		SpringUtilities.makeCompactGrid(painelRadioButton, 1, 2, 6, 6, 6, 6);
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField(10);

		cpfLabel = new JLabel("CPF: ");
		
		try {
			
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);
			
		} catch (ParseException e) {
			e.printStackTrace();
			
		}
		
		foneLabel = new JLabel("Fone: ");
		
		try {
			foneField = new JFormattedTextField(new MaskFormatter("(##)# ####-####"));
			foneField.setColumns(10);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		emailLabel = new JLabel("E-mail: ");
		emailField = new JTextField(10);
		
		painelCentral = new JPanel(new SpringLayout());
		painelCentral.add(sexoLabel);
		painelCentral.add(painelRadioButton);
		painelCentral.add(nomeLabel);
		painelCentral.add(nomeField);
		painelCentral.add(cpfLabel);
		painelCentral.add(cpfField);
		painelCentral.add(foneLabel);
		painelCentral.add(foneField);
		painelCentral.add(emailLabel);
		painelCentral.add(emailField);
		
		SpringUtilities.makeCompactGrid(painelCentral, 5, 2, 6, 6, 6, 6);
		
		propaganda = new JCheckBox("Aceita receber propaganda");
		
		adicionarButton = new JButton("Adicionar");
		
		add(getPainelTitulo(), BorderLayout.NORTH);
		add(getPainelCentral(), BorderLayout.CENTER);
		add(getPropaganda(), BorderLayout.PAGE_END);
		add(getAdicionarButton(), BorderLayout.EAST);
	
		
		setVisible(false);
		
	}

	public JLabel getTituloLabel() {
		return tituloLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getSexoLabel() {
		return sexoLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getFoneLabel() {
		return foneLabel;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getFoneField() {
		return foneField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JRadioButton getMasculinoRadioButton() {
		return masculinoRadioButton;
	}

	public JRadioButton getFemininoRadioButton() {
		return femininoRadioButton;
	}

	public JButton getAdicionarButton() {
		return adicionarButton;
	}

	public JCheckBox getPropaganda() {
		return propaganda;
	}

	public JPanel getPainelTitulo() {
		return painelTitulo;
	}

	public JPanel getPainelRadioButton() {
		return painelRadioButton;
	}

	public JPanel getPainelCentral() {
		return painelCentral;
	}

	
}

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

public class ClienteGUI extends JPanel{

	JLabel tituloLabel, tipoLabel, nomeLabel, cpfLabel, foneLabel, emailLabel;
	JTextField nomeField, cpfField, foneField, emailField;
	JRadioButton femininoRadioButton, masculinoRadioButton;
	JCheckBox propagandaCheckBox;
	JButton adicionarClienteButton;
	
	public ClienteGUI() {
		
		setLayout(new BorderLayout());
		
		//-------------------------------------------------
		
		JPanel panelTitulo = new JPanel();
		
		tituloLabel = new JLabel("Cliente");
		tituloLabel.setFont(new Font("", Font.BOLD, 20));
		
		panelTitulo.add(tituloLabel);
		
		//-------------------------------------------------
		
		JPanel panelRadioButton = new JPanel(new SpringLayout());
		
		masculinoRadioButton = new JRadioButton("Masculino", true);
		femininoRadioButton = new JRadioButton("Feminino");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(femininoRadioButton);
		buttonGroup.add(masculinoRadioButton);
		
		panelRadioButton.add(masculinoRadioButton);
		panelRadioButton.add(femininoRadioButton);
		
		util.SpringUtilities.makeCompactGrid(panelRadioButton, 1, 2, 6, 6, 6, 6);
		
		//------------------------------------------------
		JPanel panelPrincipal = new JPanel(new SpringLayout());
		
		tipoLabel = new JLabel("Tipo: ");
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField("Nome completo", 10);
		nomeField.setForeground(Color.LIGHT_GRAY);
		
		try {
			
			cpfLabel = new JLabel("CPF: ");
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			foneLabel = new JLabel("Fone: ");
			foneField = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
			foneField.setColumns(10);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		emailLabel = new JLabel("E-mail: ");
		emailField = new JTextField(10);
		
		panelPrincipal.add(tipoLabel);
		panelPrincipal.add(panelRadioButton);
		panelPrincipal.add(nomeLabel);
		panelPrincipal.add(nomeField);
		panelPrincipal.add(cpfLabel);
		panelPrincipal.add(cpfField);
		panelPrincipal.add(foneLabel);
		panelPrincipal.add(foneField);
		panelPrincipal.add(emailLabel);
		panelPrincipal.add(emailField);
		
		util.SpringUtilities.makeCompactGrid(panelPrincipal, 5, 2, 6, 6, 6, 6);
		
		//------------------------------------------------------------------------------
		
		propagandaCheckBox = new JCheckBox("Aceita receber propaganda", true);
		
		adicionarClienteButton = new JButton("Adicionar");
		adicionarClienteButton.setEnabled(false);
		
		add(panelTitulo, BorderLayout.NORTH);
		add(panelPrincipal, BorderLayout.CENTER);
		add(adicionarClienteButton, BorderLayout.EAST);
		add(propagandaCheckBox, BorderLayout.PAGE_END);
		
		setVisible(false);
		
	}

	public JLabel getTituloLabel() {
		return tituloLabel;
	}

	public JLabel getTipoLabel() {
		return tipoLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
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

	public JRadioButton getFemininoRadioButton() {
		return femininoRadioButton;
	}

	public JRadioButton getMasculinoRadioButton() {
		return masculinoRadioButton;
	}

	public JCheckBox getPropagandaCheckBox() {
		return propagandaCheckBox;
	}

	public JButton getAdicionarClienteButton() {
		return adicionarClienteButton;
	}
	
}

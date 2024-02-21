package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import util.SpringUtilities;

public class CamposPanel extends JPanel{
	JLabel nomeLabel, cpfLabel, emailLabel, foneLabel, animalLabel;
	JTextField nomeField, emailField;
	JFormattedTextField cpfFormatted, foneFormatted;
	JRadioButton cachorroRadio, gatoRadio, coelhoRadio, semPreferenciaRadio;
	ButtonGroup radioGroup;
	JPanel panelRadio;
	public CamposPanel() {
		setLayout(new SpringLayout());
		
		nomeLabel = new JLabel("Nome: ");
		cpfLabel = new JLabel("Cpf: ");
		emailLabel = new JLabel("Email: ");
		foneLabel = new JLabel("Fone: ");
		
		
		nomeField = new JTextField(20);
		emailField = new JTextField(20);
		
		try {
			cpfFormatted =  new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			foneFormatted =  new JFormattedTextField(new MaskFormatter("+##(##) #####-####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		animalLabel = new JLabel("Animal: ");
		//Radios
		cachorroRadio = new JRadioButton("Cachorro", true);
		gatoRadio = new JRadioButton("Gato");
		coelhoRadio = new JRadioButton("Coelho");
		semPreferenciaRadio = new JRadioButton("Sem preferência");
		
		//Outros Compoenentes
		radioGroup = new ButtonGroup();
		panelRadio = new JPanel(new FlowLayout());
		
		//adds
		radioGroup.add(cachorroRadio);
		radioGroup.add(gatoRadio);
		radioGroup.add(coelhoRadio);
		radioGroup.add(semPreferenciaRadio);
				
		//addPanel
		panelRadio.add(animalLabel);
		panelRadio.add(cachorroRadio);
		panelRadio.add(gatoRadio);
		panelRadio.add(coelhoRadio);
		panelRadio.add(semPreferenciaRadio);
				
		
		add(nomeLabel);
		add(nomeField);
		add(cpfLabel);
		add(cpfFormatted);
		add(emailLabel);
		add(emailField);
		add(foneLabel);
		add(foneFormatted);
		add(animalLabel);
		add(panelRadio, BorderLayout.SOUTH);
		
		

		SpringUtilities.makeCompactGrid(this, 5, 2, 5 , 5, 5, 5);
		
		
		
		setVisible(true);
		
	}

	public JRadioButton getCachorroRadio() {
		return cachorroRadio;
	}

	public JRadioButton getGatoRadio() {
		return gatoRadio;
	}

	public JRadioButton getCoelhoRadio() {
		return coelhoRadio;
	}

	public JRadioButton getSemPreferenciaRadio() {
		return semPreferenciaRadio;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JFormattedTextField getCpfFormatted() {
		return cpfFormatted;
	}

	public JFormattedTextField getFoneFormatted() {
		return foneFormatted;
	}
	
	
	
	
	
	
	
	
	
	
}

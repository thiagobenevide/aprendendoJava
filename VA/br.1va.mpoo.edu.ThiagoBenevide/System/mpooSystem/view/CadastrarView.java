package mpooSystem.view;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import mpooSystem.util.SpringUtilities;

public class CadastrarView extends JFrame{
	JLabel nomeLabel, loginLabel, cpfLabel, senhaLabel;
	JTextField nomeField, loginField, cpfField, senhaField;
	JButton addButton, sairButton;
	JRadioButton masculinoRadio, femininoRadio;
	ButtonGroup radioGrupo;
	JPanel panelPrincipal, panelRadio, panelButton;
	
	
	
	public CadastrarView(){
		setSize(200,240);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField();
		loginLabel = new JLabel("Login: ");
		loginField = new JTextField();
		cpfLabel = new JLabel("CPF: ");
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (Exception e) {
			e.getMessage();
		}
		
		senhaLabel = new JLabel("Senha: ");
		senhaField = new JTextField();
		
		addButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		masculinoRadio = new JRadioButton("Masculino", true);
		femininoRadio = new JRadioButton("Feminino");
		
		panelPrincipal = new JPanel(new SpringLayout());
		panelRadio = new JPanel(new SpringLayout());
		panelButton = new JPanel(new SpringLayout());
		
		radioGrupo = new ButtonGroup();
		
		radioGrupo.add(masculinoRadio);
		radioGrupo.add(femininoRadio);
		
		panelPrincipal.add(nomeLabel);
		panelPrincipal.add(nomeField);
		panelPrincipal.add(loginLabel);
		panelPrincipal.add(loginField);
		panelPrincipal.add(cpfLabel);
		panelPrincipal.add(cpfField);
		panelPrincipal.add(senhaLabel);
		panelPrincipal.add(senhaField);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 4, 2, 6, 6, 6, 6);
		
		panelRadio.add(masculinoRadio);
		panelRadio.add(femininoRadio);
		
		SpringUtilities.makeCompactGrid(panelRadio, 1, 2, 6, 6, 6, 6);
		
		panelButton.add(addButton);
		panelButton.add(sairButton);
		
		SpringUtilities.makeCompactGrid(panelButton, 1, 2, 6, 6, 6, 6);
		
		
		add(panelPrincipal, BorderLayout.PAGE_START);
		add(panelRadio, BorderLayout.CENTER);
		add(panelButton, BorderLayout.PAGE_END);
	}



	public JTextField getNomeField() {
		return nomeField;
	}



	public JTextField getLoginField() {
		return loginField;
	}



	public JTextField getCpfField() {
		return cpfField;
	}



	public JTextField getSenhaField() {
		return senhaField;
	}



	public JButton getAddButton() {
		return addButton;
	}



	public JButton getSairButton() {
		return sairButton;
	}



	public JRadioButton getMasculinoRadio() {
		return masculinoRadio;
	}



	public JRadioButton getFemininoRadio() {
		return femininoRadio;
	}
	
	
	
	
	
}

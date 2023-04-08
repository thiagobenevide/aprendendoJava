package mpooSystem.view;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import mpooSystem.util.SpringUtilities;

public class CadastrarView extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel nomeLabel, loginLabel, cpfLabel, senhaLabel;
	JTextField nomeField, loginField, cpfField, senhaField;
	JRadioButton masculinoRadio, femininoRadio; 
	ButtonGroup grupoButtonRadio;
	JButton addButton, sairButton;
	JPanel panelPrincipal, panelButton, panelRadioButton;
	
	public CadastrarView() {
		setSize(400, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLayout(new BorderLayout());
		
		
//Panels
		panelPrincipal = new JPanel(new SpringLayout());
		panelButton = new JPanel(new SpringLayout());
		panelRadioButton = new JPanel(new SpringLayout());
		grupoButtonRadio = new ButtonGroup();
		
		
		
		//Prinncipal
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField();
		nomeField.setColumns(10);
		
		loginLabel = new JLabel("Login: ");
		loginField = new JTextField();
		loginField.setColumns(10);
		try {
			cpfLabel = new JLabel("CPF: ");
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);

			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		senhaLabel = new JLabel("Senha: ");
		senhaField = new JTextField();
		senhaField.setColumns(10);
		
		masculinoRadio = new JRadioButton("Masculino", true);
		femininoRadio = new JRadioButton("Feminino");
		
		addButton = new JButton("Add");
		sairButton = new JButton("Sair");
		
		
		//Add
		panelPrincipal.add(nomeLabel);
		panelPrincipal.add(nomeField);
		panelPrincipal.add(loginLabel);
		panelPrincipal.add(loginField);
		panelPrincipal.add(cpfLabel);
		panelPrincipal.add(cpfField);
		panelPrincipal.add(senhaLabel);
		panelPrincipal.add(senhaLabel);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 6, 2, 6, 6, 6,6);
		
		
		
		grupoButtonRadio.add(masculinoRadio);
		grupoButtonRadio.add(femininoRadio);
		panelRadioButton.add(masculinoRadio);
		panelRadioButton.add(femininoRadio);
		SpringUtilities.makeCompactGrid(panelRadioButton, 1, 2, 6, 6, 6, 6);

		
		panelButton.add(addButton);
		panelButton.add(sairButton);
		panelPrincipal.add(panelButton);
		SpringUtilities.makeCompactGrid(panelButton, 1, 2, 6, 6, 6, 6);
		
		
		add(panelPrincipal, BorderLayout.CENTER);
		add(panelRadioButton, BorderLayout.PAGE_END);
		add(panelButton, BorderLayout.PAGE_END);
			
		setVisible(true);

	}
}

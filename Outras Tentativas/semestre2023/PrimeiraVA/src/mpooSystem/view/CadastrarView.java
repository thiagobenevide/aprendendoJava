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

import mpoo.System.util.SpringUtilities;

public class CadastrarView extends JFrame{
	JLabel nomeLabel, loginLabel, cpfLabel, senhaLabel;
	JTextField nomeField, loginField, cpfField, senhaField;
	JRadioButton masculinoRadio, femininoRadio;
	JButton addButton, sairButton;
	JPanel principalPanel, botoesPanel, radiosPanel;
	ButtonGroup buttonGroup;
	
	public CadastrarView(){
		setSize(200, 240);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setResizable(false);
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField();
		loginLabel = new JLabel("Login: ");
		loginField = new JTextField();
		
		try {			
			cpfLabel = new JLabel("CPF: ");
			cpfField =  new JFormattedTextField(new MaskFormatter("###.###.###-##"));			
		}catch (Exception e) {
			e.getMessage();
		}
		
		senhaLabel = new JLabel("Senha: ");
		senhaField = new JTextField();
		
		masculinoRadio = new JRadioButton("Masculino", true);
		femininoRadio = new JRadioButton("Feminino");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(masculinoRadio);
		buttonGroup.add(femininoRadio);
		addButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		
		principalPanel = new JPanel(new SpringLayout());
		radiosPanel = new JPanel(new SpringLayout());
		botoesPanel = new JPanel(new SpringLayout());
		
		principalPanel.add(nomeLabel);
		principalPanel.add(nomeField);
		principalPanel.add(loginLabel);
		principalPanel.add(loginField);
		principalPanel.add(cpfLabel);
		principalPanel.add(cpfField);
		principalPanel.add(senhaLabel);
		principalPanel.add(senhaField);
		
		radiosPanel.add(masculinoRadio);
		radiosPanel.add(femininoRadio);
		
		botoesPanel.add(addButton);
		botoesPanel.add(sairButton);
		
		
		SpringUtilities.makeCompactGrid(principalPanel, 4, 2, 6, 6, 6, 6);
		SpringUtilities.makeCompactGrid(radiosPanel, 1, 2, 6, 6, 6, 6);
		SpringUtilities.makeCompactGrid(botoesPanel, 1, 2, 6, 6, 6, 6);
		
		add(principalPanel, BorderLayout.NORTH);
		add(radiosPanel, BorderLayout.CENTER);
		add(botoesPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new CadastrarView();
	}
	
}

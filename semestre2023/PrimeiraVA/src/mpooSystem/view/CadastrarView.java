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
import javax.swing.text.MaskFormatter;

public class CadastrarView extends JFrame{
	JLabel nomeLabel, loginLabel, cpfLabel, senhaLabel;
	JTextField nomeField, loginField, cpfField, senhaField;
	JRadioButton masculinoRadio, femininoRadio;
	JButton addButton, sairButton;
	JPanel principalPanel, botoesPanel, radiosPanel;
	ButtonGroup buttonGroup;
	
	public CadastrarView(){
		setSize(200, 240);
		setLayout(new BorderLayout());
		
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
		
		
	}
	
	
	public static void main(String[] args) {
		new CadastrarView();
	}
	
}

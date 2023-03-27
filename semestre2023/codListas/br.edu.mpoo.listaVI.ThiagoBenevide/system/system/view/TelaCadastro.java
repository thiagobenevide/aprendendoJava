package system.view;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame{
	JLabel nomeLabel, cpfLabel, foneLabel, emailLabel;
	JTextField nomeField, cpfField, foneField, emailField, tipoField;
	JRadioButton clienteRadio, funcionarioRadio;
	JButton adicionarButto;
	JCheckBox propagandaCheck;
	ButtonGroup grupoRadio;
	JPanel cabecalhoPanel, principalPanel, radioPanel;
	
	public TelaCadastro() {
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField();
		
		try {
			cpfLabel = new JLabel("CPF: ");
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			foneLabel = new JLabel("Fone: ");
			foneField = new JFormattedTextField(new MaskFormatter("(##) #-####-####"));
		} catch (Exception e) {
			e.getMessage();
		}
		
		emailLabel = new JLabel("E-mail: ");
		emailField = new JTextField();
		
		cabecalhoPanel = new JPanel()
		
		
		
		
		
		
		
		
		
		
		setVisible(true);
		
		
	}
	
	
}

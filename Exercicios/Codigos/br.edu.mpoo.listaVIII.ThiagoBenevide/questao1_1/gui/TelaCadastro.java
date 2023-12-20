package gui;

import java.awt.Checkbox;
import java.awt.Component;
import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame{
	JLabel nomeLabel, foneLabel, emailLabel,cpfLabel, sexoLabel;
	JFormattedTextField cpfField;
	JTextField nomeField, foneField, emailField;
	JRadioButton masculinoRadio, femininoRadio;
	JPanel panelGrupo;
	ButtonGroup grupoRadio;
	JCheckBox aceitaPropCheck;
	JButton adicionarButton;
	

	public TelaCadastro(){
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		nomeLabel = new JLabel("Nome: ");
		cpfLabel  = new JLabel("CPF: ");
		foneLabel = new JLabel("Fone: ");
		emailLabel = new JLabel("Email: ");
		sexoLabel = new JLabel("Sexo: ");
		
		nomeField = new JTextField(22);
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(22);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		foneField = new JTextField(22);
		emailField = new JTextField(22);
		
		
		add(nomeLabel);
		add(nomeField);
		add(cpfLabel);
		add(cpfField);
		add(foneLabel);
		add(foneField);
		add(emailLabel);
		add(emailField);
		
		
		masculinoRadio = new JRadioButton("Masculino", true);
		femininoRadio = new JRadioButton("Feminino");
		grupoRadio = new ButtonGroup();
		grupoRadio.add(masculinoRadio);
		grupoRadio.add(femininoRadio);
		
		add(sexoLabel);
		panelGrupo = new JPanel();
		panelGrupo.add(masculinoRadio);
		panelGrupo.add(femininoRadio);
		add(panelGrupo);
		
		aceitaPropCheck = new JCheckBox("Aceita Receber Propaganda");
		add(aceitaPropCheck);
		adicionarButton = new JButton("Adicionar");
		add(adicionarButton);
		
		
		
		setVisible(true);
	}
	
	
}

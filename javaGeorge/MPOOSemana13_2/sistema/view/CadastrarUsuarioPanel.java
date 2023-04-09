package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import sistema.util.SpringUtilities;

public class CadastrarUsuarioPanel extends JPanel{
	
	JLabel cadastrarLabel, nomeUsuarioLabel, cpfUsuarioLabel, senhaUsuarioLabel, dataNascimentoUsuarioLabel, tipoUsuarioLabel;
	JTextField nomeUsuarioField, senhaUsuarioField;
	JFormattedTextField cpfUsuarioField, dataNascimentoUsuarioField;
	
	JRadioButton tipoClienteUsuarioRadio, tipoFuncionarioUsuarioRadio;
	ButtonGroup tipoUsuarioGroup;
	
	JPanel dadosUsuarioPanel, tipoUsuarioGroupPanel;
	
	JButton salvarButton;
	
	public static final String tituloPanel = "Cadastrar Usuario";
	
	public CadastrarUsuarioPanel(){
		setPreferredSize(new Dimension(300, 300));//setSize
		setLayout(new FlowLayout());
		
		dadosUsuarioPanel = new JPanel();
		
		nomeUsuarioLabel = new JLabel("Usuario:", JLabel.TRAILING);
		nomeUsuarioField = new JTextField("Nome Completo", 10);
		nomeUsuarioField.setForeground(Color.LIGHT_GRAY);
		
		cpfUsuarioLabel = new JLabel("CPF:", JLabel.TRAILING);
		try {
			cpfUsuarioField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfUsuarioField.setColumns(8);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		senhaUsuarioLabel = new JLabel("Senha:", JLabel.TRAILING);
		senhaUsuarioField = new JPasswordField(8);
		
		dataNascimentoUsuarioLabel = new JLabel("Data de Nascimento:", JLabel.TRAILING);
		try {
			dataNascimentoUsuarioField = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		tipoUsuarioLabel = new JLabel("Tipo:", JLabel.TRAILING);
		
		tipoClienteUsuarioRadio = new JRadioButton("Cliente",true);
		tipoFuncionarioUsuarioRadio= new JRadioButton("Funcionario");
		
		tipoUsuarioGroup = new ButtonGroup();
		tipoUsuarioGroup.add(tipoClienteUsuarioRadio);
		tipoUsuarioGroup.add(tipoFuncionarioUsuarioRadio);
		
		tipoUsuarioGroupPanel = new JPanel();
		tipoUsuarioGroupPanel.add(tipoClienteUsuarioRadio);
		tipoUsuarioGroupPanel.add(tipoFuncionarioUsuarioRadio);
		
		dadosUsuarioPanel.setLayout(new SpringLayout());
		dadosUsuarioPanel.add(nomeUsuarioLabel);
		dadosUsuarioPanel.add(nomeUsuarioField);
	
		dadosUsuarioPanel.add(cpfUsuarioLabel);
		dadosUsuarioPanel.add(cpfUsuarioField);
		
		dadosUsuarioPanel.add(senhaUsuarioLabel);
		dadosUsuarioPanel.add(senhaUsuarioField);
		
		dadosUsuarioPanel.add(dataNascimentoUsuarioLabel);
		dadosUsuarioPanel.add(dataNascimentoUsuarioField);
		
		dadosUsuarioPanel.add(tipoUsuarioLabel);
		dadosUsuarioPanel.add(tipoUsuarioGroupPanel);
		
		SpringUtilities.makeCompactGrid(dadosUsuarioPanel,
				5, 2, //rows, cols
				3, 3,        //initX, initY
				3, 3);       //xPad, yPad

		salvarButton = new JButton("Salvar");
		salvarButton.setEnabled(false);
		
		add(dadosUsuarioPanel);
		add(salvarButton);
	}

	public JTextField getNomeUsuarioField() {
		return nomeUsuarioField;
	}

	public JTextField getSenhaUsuarioField() {
		return senhaUsuarioField;
	}

	public JFormattedTextField getCpfUsuarioField() {
		return cpfUsuarioField;
	}

	public JFormattedTextField getDataNascimentoUsuarioField() {
		return dataNascimentoUsuarioField;
	}

	public JRadioButton getTipoClienteUsuarioRadio() {
		return tipoClienteUsuarioRadio;
	}

	public JRadioButton getTipoFuncionarioUsuarioRadio() {
		return tipoFuncionarioUsuarioRadio;
	}

	public JPanel getDadosUsuarioPanel() {
		return dadosUsuarioPanel;
	}

	public JButton getSalvarButton() {
		return salvarButton;
	}

	public void setNomeUsuarioField(JTextField nomeUsuarioField) {
		this.nomeUsuarioField = nomeUsuarioField;
	}
}

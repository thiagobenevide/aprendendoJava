package view;

import java.awt.BorderLayout;
import java.text.ParseException;

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

import util.SpringUtilities;

public class CadastrarFuncionarioPanel extends JPanel {

	JLabel tituloFuncionarioLabel, sexoFuncionarioLabel, nomeFuncionarioLabel, cpfFuncionarioLabel, foneFuncionarioLabel, emailFuncionarioLabel, matriculaFuncionarioLabel;
	JTextField nomeFuncionarioField, cpfFuncionarioField, foneFuncionarioField, emailFuncionarioField, matriculaFuncionarioField;
	JRadioButton masculinoFuncionarioRadioButton, femininoFuncionarioRadioButton;
	JButton adicionarFuncionarioButton;
	JPanel painelTituloFuncionario, painelRadioButtonFuncionario, painelCentralFuncionario;
	
	public CadastrarFuncionarioPanel() {
		
	
		painelTituloFuncionario = new JPanel();
		tituloFuncionarioLabel = new JLabel("Funcionário");
		painelTituloFuncionario.add(tituloFuncionarioLabel);
		
		sexoFuncionarioLabel = new JLabel("Sexo: ");
		
		painelRadioButtonFuncionario = new JPanel(new SpringLayout());
		
		masculinoFuncionarioRadioButton = new JRadioButton("Masculino", true);
		femininoFuncionarioRadioButton = new JRadioButton("Feminino", false);
		
		ButtonGroup buttonGroupFuncionario = new ButtonGroup();
		buttonGroupFuncionario.add(masculinoFuncionarioRadioButton);
		buttonGroupFuncionario.add(femininoFuncionarioRadioButton);
		
		painelRadioButtonFuncionario.add(masculinoFuncionarioRadioButton);
		painelRadioButtonFuncionario.add(femininoFuncionarioRadioButton);
		
		SpringUtilities.makeCompactGrid(painelRadioButtonFuncionario, 1, 2, 6, 6, 6, 6);
		
		nomeFuncionarioLabel = new JLabel("Nome: ");
		nomeFuncionarioField = new JTextField(10);
		
		cpfFuncionarioLabel = new JLabel("CPF: ");
		
		try {
			cpfFuncionarioField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfFuncionarioField.setColumns(10);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		foneFuncionarioLabel = new JLabel("Fone: ");
		
		try {
			foneFuncionarioField = new JFormattedTextField(new MaskFormatter("(##)# ####-####"));
			foneFuncionarioField.setColumns(10);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		emailFuncionarioLabel = new JLabel("E-mail: ");
		emailFuncionarioField = new JTextField(10);
		
		matriculaFuncionarioLabel = new JLabel("Matrícula: ");
		matriculaFuncionarioField = new JTextField(10);
		
		adicionarFuncionarioButton = new JButton("Adicionar");
		
		painelCentralFuncionario = new JPanel(new SpringLayout());
		
		painelCentralFuncionario.add(sexoFuncionarioLabel);
		painelCentralFuncionario.add(painelRadioButtonFuncionario);
		painelCentralFuncionario.add(nomeFuncionarioLabel);
		painelCentralFuncionario.add(nomeFuncionarioField);
		painelCentralFuncionario.add(cpfFuncionarioLabel);
		painelCentralFuncionario.add(cpfFuncionarioField);
		painelCentralFuncionario.add(foneFuncionarioLabel);
		painelCentralFuncionario.add(foneFuncionarioField);
		painelCentralFuncionario.add(emailFuncionarioLabel);
		painelCentralFuncionario.add(emailFuncionarioField);
		painelCentralFuncionario.add(matriculaFuncionarioLabel);
		painelCentralFuncionario.add(matriculaFuncionarioField);
		
		SpringUtilities.makeCompactGrid(painelCentralFuncionario, 6, 2, 6, 6, 6, 6);
		
		
		setVisible(false);
	}

	public JLabel getTituloFuncionarioLabel() {
		return tituloFuncionarioLabel;
	}

	public JLabel getSexoFuncionarioLabel() {
		return sexoFuncionarioLabel;
	}

	public JLabel getNomeFuncionarioLabel() {
		return nomeFuncionarioLabel;
	}

	public JLabel getCpfFuncionarioLabel() {
		return cpfFuncionarioLabel;
	}

	public JLabel getFoneFuncionarioLabel() {
		return foneFuncionarioLabel;
	}

	public JLabel getEmailFuncionarioLabel() {
		return emailFuncionarioLabel;
	}

	public JLabel getMatriculaFuncionarioLabel() {
		return matriculaFuncionarioLabel;
	}

	public JTextField getNomeFuncionarioField() {
		return nomeFuncionarioField;
	}

	public JTextField getCpfFuncionarioField() {
		return cpfFuncionarioField;
	}

	public JTextField getFoneFuncionarioField() {
		return foneFuncionarioField;
	}

	public JTextField getEmailFuncionarioField() {
		return emailFuncionarioField;
	}

	public JTextField getMatriculaFuncionarioField() {
		return matriculaFuncionarioField;
	}

	public JRadioButton getMasculinoFuncionarioRadioButton() {
		return masculinoFuncionarioRadioButton;
	}

	public JRadioButton getFemininoFuncionarioRadioButton() {
		return femininoFuncionarioRadioButton;
	}

	public JButton getAdicionarFuncionarioButton() {
		return adicionarFuncionarioButton;
	}

	public JPanel getPainelTituloFuncionario() {
		return painelTituloFuncionario;
	}

	public JPanel getPainelRadioButtonFuncionario() {
		return painelRadioButtonFuncionario;
	}

	public JPanel getPainelCentralFuncionario() {
		return painelCentralFuncionario;
	}
	
}

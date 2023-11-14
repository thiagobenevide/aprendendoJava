package view;

import java.awt.BorderLayout;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;
import util.SpringUtilities;

public class ProfessorView extends JFrame {
	JLabel diciplinaLabel, dataLabel;
	JTextField diciplinaField, dataField;
	JButton frequenciaButton;
	JPanel principalPanel;
	
	public ProfessorView(){
		setSize(200,200);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		diciplinaLabel = new JLabel("Matricula: ");
		diciplinaField = new JTextField();
		dataLabel = new JLabel("Data: ");
		try {
			dataField = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		frequenciaButton = new JButton("Realizar Frequência");
		principalPanel = new JPanel(new SpringLayout());
		
		principalPanel.add(diciplinaLabel);
		principalPanel.add(diciplinaField);
		principalPanel.add(dataLabel);
		principalPanel.add(dataField);
		
		SpringUtilities.makeCompactGrid(principalPanel, 2, 2, 6, 6, 6, 6);
		add(principalPanel, BorderLayout.CENTER);
		add(frequenciaButton, BorderLayout.PAGE_END);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ProfessorView();
		
	}
	
	
	
}

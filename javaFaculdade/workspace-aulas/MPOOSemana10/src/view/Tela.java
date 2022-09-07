package view;


import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.text.MaskFormatter;

public class Tela extends JFrame{
	JButton button1, button2;
	JPanel panel;
	JLabel label;
	JTextField field;
	JTextField dataField, cpfField;
	JPasswordField senhaField;
	JCheckBox checkBox;
	JRadioButton opcao1RadioButton, opcao2RadioButton, opcao3RadioButton;
	ButtonGroup bg;
	JTextArea area;
	JList list;
	
	
	public Tela() {
		super("Título");
	
		JFrame jFrame = new JFrame("Título");
		jFrame.setSize(300, 300);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setSize(300,300);
		
		
		
		button1 = new JButton("OK");
		button2 = new JButton("Cancel");
		add(button1);
		add(button2);
	
		
		label = new JLabel("Label");
		field = new JTextField(10);
		
		add(label);
		add(field);
		
		try {
			dataField = new JFormattedTextField(new MaskFormatter("##/##/####"));
			dataField.setColumns(6);
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(8);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		add(dataField);
		add(cpfField);
	
		checkBox = new JCheckBox();
		
		add(checkBox);
		
		senhaField = new JPasswordField(10);
		
		add(senhaField);
		
		opcao1RadioButton = new JRadioButton("opcao1", true);
		opcao2RadioButton = new JRadioButton("opcao2", false);
		opcao3RadioButton = new JRadioButton("opcao3", false);
		
		bg = new ButtonGroup();
		bg.add(opcao1RadioButton);
		bg.add(opcao2RadioButton);
		bg.add(opcao3RadioButton);
		
		area = new JTextArea(6,10);
		
		//Como colocar uma barra de rolagem em JtextArea?
	
		String opcoes [] = {"Opção1", "Opção2", "Opções3", "Opção4", "Opção5"};
		list = new JList(opcoes);
		list.setSelectedIndex(0);
		list.setVisibleRowCount(2);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(list);
		
		setVisible(true);
		
	}
	

}

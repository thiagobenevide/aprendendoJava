package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame1 extends JFrame {
	JButton abrirButton;
	
	
	public Frame1() {
		super("Como fechar um JFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		abrirButton = new JButton("Abrir Outro Frame");
		add(abrirButton);
		
		setVisible(true);
	}




	public JButton getAbrirButton() {
		return abrirButton;
	}

	
	
	
}

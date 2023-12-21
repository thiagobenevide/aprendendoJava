package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame2 extends JFrame{
	JButton hidenButton, disposeButton, setVisibleButton, sistemButton;
	JLabel textoLabel1, textoLabel2;
	
	public Frame2() {
		setLocationRelativeTo(null);
		setSize(500,200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		hidenButton = new JButton("hide()");
		disposeButton = new JButton("dispose()");
		setVisibleButton = new JButton("setVisible(false)");
		sistemButton = new JButton("System.exit(0)");
		
		textoLabel1 = new JLabel("Experimente Fechar com 'ALT + F4' ou 'X' da Barra de Títulos");
		textoLabel2 = new JLabel("Alguém sabe fechar com mesmo efeito do 'ALT + F4'?");
		
		add(hidenButton);
		add(disposeButton);
		add(setVisibleButton);
		add(sistemButton);
		
		add(textoLabel1);
		add(textoLabel2);
		
		
		setVisible(true);
	}

	public JButton getHidenButton() {
		return hidenButton;
	}

	public JButton getDisposeButton() {
		return disposeButton;
	}

	public JButton getSetVisibleButton() {
		return setVisibleButton;
	}

	public JButton getSistemButton() {
		return sistemButton;
	}
	
	
	
}

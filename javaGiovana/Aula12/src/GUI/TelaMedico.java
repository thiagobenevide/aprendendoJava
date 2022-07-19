package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaMedico extends JFrame {

	JLabel numeroFichaLabel;
	JButton proximaFichaButton;

	public TelaMedico(String titulo, int numero) {
		super(titulo);
		
		setSize(200, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//setResizable(false); //bloquear tamanho
		
		numeroFichaLabel = new JLabel(Integer.toString(numero), JLabel.TRAILING); // TRAILING PRA CENTRALIZAR
		numeroFichaLabel.setForeground(Color.RED);
		numeroFichaLabel.setFont(new Font("", Font.BOLD, 25));
		
		add(numeroFichaLabel, BorderLayout.CENTER);
		
		proximaFichaButton = new JButton("Proximo");
		add(proximaFichaButton, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}

	public JLabel getNumeroFichaLabel() {
		return numeroFichaLabel;
	}

	public void setNumeroFichaLabel(JLabel numeroFichaLabel) {
		this.numeroFichaLabel = numeroFichaLabel;
	}

	public JButton getProximaFichaButton() {
		return proximaFichaButton;
	}
	
	
}

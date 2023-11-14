package view;


import java.awt.BorderLayout;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Diciplina;


public class AlunoView extends JFrame {
	JLabel diciplinaLabel;
	public AlunoView() {
		String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
		JComboBox<String> comboBox = new JComboBox<>(opcoes);
		add(comboBox);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		
	}
	
	/*
	public AlunoView(Array diciplinas) {
		setSize(200,200);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		
		diciplinaLabel = new JLabel("Diciplina: ");
		JComboBox comboBox = new JComboBox<>(diciplinas);
		
		
	}
	*/


    public static void main(String[] args) {
        new AlunoView();
    }


	
}

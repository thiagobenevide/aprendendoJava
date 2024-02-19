package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MedicoView extends View {
	JLabel numeroPacienteLabel;
	JButton proximoButton;
	JPanel panel;
	public MedicoView() {
		 setSize(100,100);
		 setLocationRelativeTo(null);
		 setLayout(new BorderLayout());
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 
		 numeroPacienteLabel = new JLabel("2");
		 proximoButton = new JButton("Próximo");
		 panel = new JPanel(new GridBagLayout());
		 panel.add(numeroPacienteLabel);
		 
		 
		 add(panel,BorderLayout.CENTER);
		 add(proximoButton, BorderLayout.SOUTH);
		 
		 
		 setVisible(true);
		 
	}
	
	
	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}

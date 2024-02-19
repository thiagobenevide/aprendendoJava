package view;

import java.awt.FlowLayout;
import java.util.Observable;

import javax.swing.JLabel;

public class EsperaView extends View{
	JLabel numeroPacienteLabel;
	
	public EsperaView() {
		 setSize(300,500);
		 setLocationRelativeTo(null);
		 setLayout(new FlowLayout());
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 numeroPacienteLabel = new JLabel("2");
		 
		 add(numeroPacienteLabel);
		 
		 
		 setVisible(true);
		 
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}

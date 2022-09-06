package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaNaoUsar {
	JFrame jframe;
	JButton button1, button2;
	
	public TelaNaoUsar() {
		JFrame jFrame = new JFrame("Título");
		jFrame.setSize(300, 300);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		
		
		jFrame.setLayout(new FlowLayout());
		button1 = new JButton("OK");
		button2 = new JButton("Cancel");
		jFrame.add(button1);
		jFrame.add(button2);
		
	}
	
	
	
}

package view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IndexView extends JFrame{
	ImageIcon imageLogo;
	JLabel descricaoLabel, logoLabel;
	JButton adotarButton;
	
	public IndexView() {
		setSize(300, 205);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		imageLogo = new ImageIcon("mpooamigodopet.img/logo.png");
		logoLabel = new JLabel(imageLogo, JLabel.CENTER);

		descricaoLabel = new JLabel("Participe você também, adote um amigo pet");
		adotarButton = new JButton("Adotar");
		
		add(logoLabel);
		add(descricaoLabel);
		add(adotarButton);
		
		
		
		setVisible(true);
		
		
	}

	public JButton getAdotarButton() {
		return adotarButton;
	}
	
	
}

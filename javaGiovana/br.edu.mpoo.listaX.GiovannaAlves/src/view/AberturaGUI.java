package view;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Icone;
import model.Logo;

public class AberturaGUI extends JFrame {

	JLabel logoLabel;
	
	public AberturaGUI(ImageIcon icone, ImageIcon logo) {
		
		super("Abertura");
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		logoLabel = new JLabel(logo);
		
		setIconImage(icone.getImage());
		
		
		add(logoLabel);
		
		setVisible(true);
		
	}

	public JLabel getLogoLabel() {
		return logoLabel;
	}
	
}

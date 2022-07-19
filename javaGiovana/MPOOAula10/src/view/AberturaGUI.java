package view;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AberturaGUI extends JFrame {

	JLabel logoLabel;
	ImageIcon logoImageIcon, iconeImageIcon;
	
	public AberturaGUI() {
		super ("MPOO System");
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		logoImageIcon = new ImageIcon("img/logo.png"); //coloca o arquivo dentro do projeto como criar um folder. img é a pasta
		
		logoLabel = new JLabel(logoImageIcon);
		
		try {
			
			File file = new File("img/icone.png"); // ICONE
			BufferedImage bufferedImage = ImageIO.read(file); //serve para ler o arquivo
			iconeImageIcon = new ImageIcon(bufferedImage);
			setIconImage(iconeImageIcon.getImage());
			
		} catch (IOException e) {
			e.printStackTrace();
			new MessagemGUI("Erro ao carregar img/icone.png");
			//poderia exibir mensagem
		} 
		
		
		
		add(logoLabel);
		
		setVisible(true);
		
		
	}
	
}

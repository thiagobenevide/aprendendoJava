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

	ImageIcon logoIcon, iconeIcon;
	JLabel logoLabel;
	
	public AberturaGUI() {
		super("Abertura");
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		try {
			
			File fileLogo = new File("img/logo.png");
			BufferedImage bufferedImageLogo = ImageIO.read(fileLogo);
			logoIcon = new ImageIcon(bufferedImageLogo);
			logoLabel = new JLabel(logoIcon);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			
			File fileIcone = new File("img/icone.png");
			BufferedImage bufferedImageIcone = ImageIO.read(fileIcone);
			iconeIcon = new ImageIcon(bufferedImageIcone);
			setIconImage(iconeIcon.getImage());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		add(logoLabel);
		
		setVisible(true);
		
	}

	public ImageIcon getLogoIcon() {
		return logoIcon;
	}

	public ImageIcon getIconeIcon() {
		return iconeIcon;
	}

	public JLabel getLogoLabel() {
		return logoLabel;
	}
	
}

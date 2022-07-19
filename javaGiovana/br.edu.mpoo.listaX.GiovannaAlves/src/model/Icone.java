package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Icone {

	ImageIcon iconeIcon;
	
	public Icone() throws IOException {
		
		try {
			
			File fileIcone = new File("img/icone.png");
			BufferedImage bufferedImageIcone = ImageIO.read(fileIcone);
			iconeIcon = new ImageIcon(bufferedImageIcone);
			
			
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public ImageIcon getIconeIcon() {
		return iconeIcon;
	}
	
	
}

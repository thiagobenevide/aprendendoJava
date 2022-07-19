package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Icone {

	ImageIcon iconeImageIcon;
	
	public Icone() {
	
		try {
			
			File file = new File("img/icone.png");
			BufferedImage bufferedImage = ImageIO.read(file);
			iconeImageIcon = new ImageIcon(bufferedImage);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ImageIcon getIconeImageIcon() {
		return iconeImageIcon;
	}
	
	
}

package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Logo {

	ImageIcon logoIcon;
	
	public Logo() throws IOException {
		
		
		try {
			
			File fileLogo = new File("img/logo.png");
			BufferedImage bufferedImageLogo = ImageIO.read(fileLogo);
			logoIcon = new ImageIcon(bufferedImageLogo);
			
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}

		
	}

	public ImageIcon getLogoIcon() {
		return logoIcon;
	}
	
}

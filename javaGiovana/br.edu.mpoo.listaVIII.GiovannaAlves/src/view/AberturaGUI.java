package view;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AberturaGUI extends JFrame{

	JLabel logoLabel;
	ImageIcon imagemLogo, imagemIcone;
	
	public AberturaGUI() {
		super("Abertura");
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		try {
			
			File file = new File("img/logo.png");
			BufferedImage bufferedImage = ImageIO.read(file);
			imagemLogo = new ImageIcon(bufferedImage);
			logoLabel = new JLabel(imagemLogo);
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar imagem img/logo.png");
		}
		
		
		try {
			
			File file2 = new File("img/icone.png");
			BufferedImage bufferedImage2 = ImageIO.read(file2);
			imagemIcone= new ImageIcon(bufferedImage2);
			setIconImage(imagemIcone.getImage());
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar icone img/icone.png");
		}
		
		add(logoLabel);
		
		setVisible(true);
	}
}

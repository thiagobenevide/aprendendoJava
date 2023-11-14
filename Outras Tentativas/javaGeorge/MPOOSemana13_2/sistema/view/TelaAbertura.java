package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaAbertura extends JFrame{
	JLabel logoLabel;
	ImageIcon icone;
	
	public TelaAbertura(){
		super();
		setSize(300, 300);
//		setUndecorated(true);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		logoLabel = new JLabel(new ImageIcon("img/icon.png"));
		
//		try{
//		    icone = new ImageIcon("img/icone.png");
//		}catch (Exception e){
//			JOptionPane.showMessageDialog(null, "Erro ao carregar imagem img/icone.png");
//		}
//		setIconImage(icone.getImage());
		
		
		try{
			File file = new File("img/icone.png");
			BufferedImage bufferImage = ImageIO.read(file);
			icone = new ImageIcon(bufferImage);
			//icone = new ImageIcon("img/icone.png");
			setIconImage(icone.getImage());
		}catch (IOException e){
			e.printStackTrace();
			Mensagem.exibirMensagem("Erro ao carregar imagem img/icone.png");
//			System.exit(0);
		}
		
		
		//obs.: Uma vez definido uma aparência, ele persiste em todo o sistema!
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		
		
		logoLabel = new JLabel(new ImageIcon("img/logo.png"));
		add(logoLabel);
		setVisible(true);
	}

}

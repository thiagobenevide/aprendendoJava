package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AdocaoView extends JFrame{
	JLabel tituloLabel;
	JButton adotarButton;
	
	CamposPanel campoPanel;
	ImageIcon iconImage;
	
	public AdocaoView() {
		super("MPOOAmigodoPet");
		setSize(500, 250);
		setResizable(false);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		iconImage = new ImageIcon("mpooamigodopet.img/icone.png");
		setIconImage(iconImage.getImage());
		
		
		//Labels
		tituloLabel = new JLabel("Dados Adoção");
		tituloLabel.setFont(new Font("ARIAL", Font.BOLD, 20));
		
			adotarButton = new JButton("Adotar");
		
		campoPanel =  new CamposPanel();
		
		
		add(tituloLabel, BorderLayout.NORTH);
		add(adotarButton, BorderLayout.EAST);
		add(campoPanel, BorderLayout.CENTER);
		
		
		setVisible(false);
	}


	public JButton getAdotarButton() {
		return adotarButton;
	}


	public CamposPanel getCampoPanel() {
		return campoPanel;
	}
	
	
	
	
	
	
	
}

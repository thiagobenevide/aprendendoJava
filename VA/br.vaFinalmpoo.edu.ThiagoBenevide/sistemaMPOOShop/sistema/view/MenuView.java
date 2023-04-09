package sistema.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import sistema.util.SpringUtilities;

public class MenuView extends JFrame{
	JButton pegarCupomButton, pegarBrinteButton, sairButton;
	JLabel logoLabel;
	ImageIcon logoIcon;
	JPanel panelPrincipal;
	
	public MenuView() {
		setSize(520,150);
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		logoLabel = new JLabel();
		logoIcon = new ImageIcon("sistemaMPOOShop\\\\sistema\\\\imagem\\\\imagem.jpg");
		logoLabel.setIcon(logoIcon);
		
		panelPrincipal = new JPanel(new SpringLayout());
		
		pegarCupomButton = new JButton("Pegar Cupom");
		pegarBrinteButton = new JButton("Pegar Brinde");
		sairButton = new JButton("Sair");
		
		panelPrincipal.add(logoLabel);
		panelPrincipal.add(pegarCupomButton);
		panelPrincipal.add(pegarBrinteButton);
		panelPrincipal.add(sairButton);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 1, 4, 6, 6, 6, 6);
		
		add(panelPrincipal, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public JButton getPegarCupomButton() {
		return pegarCupomButton;
	}

	public JButton getPegarBrinteButton() {
		return pegarBrinteButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
	
}

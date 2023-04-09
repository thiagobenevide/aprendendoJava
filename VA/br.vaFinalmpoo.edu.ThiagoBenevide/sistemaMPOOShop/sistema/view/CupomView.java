package sistema.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import sistema.util.SpringUtilities;

public class CupomView extends JFrame{
	JLabel cupomLabel, clienteLabel;
	JButton cincoButton, dezButton, quinzeButton;
	ImageIcon cincoIcon, dezIcon, quinzeIcon;
	JTextField clienteField;
	JPanel panelPrincipal, clientePanel;
	
	public CupomView() {
		setSize(480,220);
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cupomLabel = new JLabel("Cupons disponíveis");
		add(cupomLabel, BorderLayout.PAGE_START);

		clienteLabel = new JLabel("Cliente: ");
		clienteField =  new JTextField();
		
		cincoIcon = new ImageIcon("sistemaMPOOShop\\sistema\\imagem\\imagem.jpg");
		dezIcon = new ImageIcon("sistemaMPOOShop\\sistema\\imagem\\imagem.jpg");
		quinzeIcon = new ImageIcon("sistemaMPOOShop\\sistema\\imagem\\imagem.jpg");
		
		cincoButton = new JButton(cincoIcon);
		dezButton = new JButton(dezIcon);
		quinzeButton = new JButton(quinzeIcon);
		
		
		clientePanel = new JPanel(new SpringLayout());
		panelPrincipal = new JPanel(new SpringLayout());
		
		panelPrincipal.add(cincoButton);
		panelPrincipal.add(dezButton);
		panelPrincipal.add(quinzeButton);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 1, 3, 6, 6, 6, 6);
		
		clientePanel.add(clienteLabel);
		clientePanel.add(clienteField);
		
		SpringUtilities.makeCompactGrid(clientePanel, 1, 2, 6, 6, 6, 6);
		
		add(panelPrincipal, BorderLayout.CENTER);
		add(clientePanel, BorderLayout.PAGE_END);
		
		setVisible(true);
	}

	public JButton getCincoButton() {
		return cincoButton;
	}

	public JButton getDezButton() {
		return dezButton;
	}

	public JButton getQuinzeButton() {
		return quinzeButton;
	}

	public JTextField getClienteField() {
		return clienteField;
	}
	
	
	
	
}

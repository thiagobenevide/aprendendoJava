package sistema.view;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import sistema.util.SpringUtilities;

public class BrindeView extends JFrame{
	JLabel brindeLabel, logoLabel, clienteLabel;
	ImageIcon brindeIco, logoIco;
	JRadioButton cincoButton, dezButton, quinzeButton;
	ButtonGroup grupoValor;
	JTextField clienteField;
	JButton semCupomButton,comCupomButton; 
	JPanel panelPrincipal;
	
	
	public BrindeView() {
		setSize(900,160);
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		brindeLabel = new JLabel();
		logoLabel = new JLabel();
		brindeIco = new ImageIcon("sistemaMPOOShop\\sistema\\imagem\\imagem.jpg");
		logoIco = new ImageIcon("sistemaMPOOShop\\sistema\\imagem\\imagem.jpg");
		brindeLabel.setIcon(brindeIco);
		logoLabel.setIcon(logoIco);
		
		
		cincoButton = new JRadioButton("R$5,00", true);
		dezButton = new JRadioButton("R$10,00");
		quinzeButton = new JRadioButton("R$15,00");
		
		grupoValor = new ButtonGroup();
		grupoValor.add(cincoButton);
		grupoValor.add(dezButton);
		grupoValor.add(quinzeButton);
		
		
		semCupomButton = new JButton("Comprar sem Cupom");
		comCupomButton = new JButton("Usar cupom");
		
		clienteLabel = new JLabel("Cliente");
		clienteField = new JTextField();
		
		panelPrincipal = new JPanel(new SpringLayout());
		
		panelPrincipal.add(brindeLabel);
		panelPrincipal.add(comCupomButton);
		panelPrincipal.add(semCupomButton);
		panelPrincipal.add(clienteLabel);
		panelPrincipal.add(clienteField);
		panelPrincipal.add(cincoButton);
		panelPrincipal.add(dezButton);
		panelPrincipal.add(quinzeButton);
		panelPrincipal.add(logoLabel);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 1, 9, 6, 6, 6, 6);
		
		add(panelPrincipal);
	}


	public JRadioButton getCincoButton() {
		return cincoButton;
	}


	public JRadioButton getDezButton() {
		return dezButton;
	}


	public JRadioButton getQuinzeButton() {
		return quinzeButton;
	}


	public JTextField getClienteField() {
		return clienteField;
	}


	public JButton getSemCupomButton() {
		return semCupomButton;
	}


	public JButton getComCupomButton() {
		return comCupomButton;
	}
	
	
}

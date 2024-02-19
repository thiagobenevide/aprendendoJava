package mpooStore.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import mpooStore.model.CupomDesconto;
import mpooStore.util.SpringUtilities;

public class GanharCupomView extends JFrame{
	ImageIcon logoIcon, brindeIcon, iconeIcon;
	JButton confirmarButton;
	JLabel logoLabel, brindeLabel, descontoLabel;
	CamposPanel camposPanel;
	JPanel panelBride;
	

	public GanharCupomView() {
		super("MPOOStore");
		setSize(300,350);
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		iconeIcon = new ImageIcon("mpooStore.img/brinde.png");
		setIconImage(iconeIcon.getImage());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
		//Imagens
		brindeIcon = new ImageIcon("mpooStore.img/brinde.png");
		logoIcon = new ImageIcon("mpooStore.img/logo.png");
		
		
		logoLabel = new JLabel(logoIcon, JLabel.CENTER);
		logoLabel.setIcon(logoIcon);
		brindeLabel = new JLabel();
		brindeLabel.setIcon(brindeIcon);
		
		//componentes
		descontoLabel = new JLabel("Cupom Desconto");
		camposPanel = new CamposPanel();
		confirmarButton = new JButton("Confirmar");
		panelBride = new JPanel();
		panelBride.add(descontoLabel);
		panelBride.add(brindeLabel);
		
		add(logoLabel, BorderLayout.NORTH);
		add(camposPanel, BorderLayout.CENTER);		
		add(confirmarButton, BorderLayout.EAST);
		add(panelBride, BorderLayout.SOUTH);
		setVisible(false);
			
	}
	



	public JButton getConfirmarButton() {
		return confirmarButton;
	}




	public CamposPanel getCamposPanel() {
		return camposPanel;
	}
	
	
	
	
	
	
}

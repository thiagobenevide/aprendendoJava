package mpooStore.view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class AberturaView extends JFrame{
	ImageIcon image;
	JLabel imageLabel, descricaoLabel, isClienteLabel;
	JRadioButton simRadio, naoRadio;
	ButtonGroup isClienteGroup;
	JButton pegarButton;
	
	public AberturaView() {
		setSize(300,200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		//image
		image = new ImageIcon("mpooStore.img/logo.png");
		imageLabel = new JLabel();
		imageLabel.setIcon(image);
		//descricao
		descricaoLabel = new JLabel("Ganhe um Cupom de Desconto");
		isClienteLabel = new JLabel("Você é cliente de MPOOStore?");
		simRadio = new JRadioButton("Sim", true);
		naoRadio = new JRadioButton("Não");
		isClienteGroup = new ButtonGroup();
		isClienteGroup.add(simRadio);
		isClienteGroup.add(naoRadio);
		pegarButton = new JButton("Pegar Cupom");
		
		add(imageLabel);
		add(descricaoLabel);
		add(isClienteLabel);
		add(simRadio);
		add(naoRadio);
		add(pegarButton);
		
		
		setVisible(true);
		
		
	}

	public JRadioButton getSimRadio() {
		return simRadio;
	}

	public JRadioButton getNaoRadio() {
		return naoRadio;
	}

	public JButton getPegarButton() {
		return pegarButton;
	}
	
	
	
	
}

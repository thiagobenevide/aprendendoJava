package mpooSystem.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import mpooSystem.util.SpringUtilities;

public class MenuView extends JFrame{
	JLabel imagemLabel;
	JButton logarButton, cadastrarButton, sairButton;
	ImageIcon imagem;
	JPanel panelButton;
	
	public MenuView() {
		setSize(250,180);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		imagem = new ImageIcon("System\\mpooSystem\\imagem\\carro.jpg");
		imagemLabel = new JLabel();
		imagemLabel.setIcon(imagem);
		
		add(imagemLabel, BorderLayout.PAGE_START);
		
		panelButton = new JPanel(new SpringLayout());
		
		logarButton = new JButton("Logar");
		cadastrarButton = new JButton("Cadastrar");
		sairButton = new JButton("Sair");
		
		panelButton.add(logarButton);
		panelButton.add(cadastrarButton);
		panelButton.add(sairButton);
		
		SpringUtilities.makeCompactGrid(panelButton, 1, 3, 6, 6, 6, 6);
		
		add(panelButton, BorderLayout.CENTER);
		
	}

	public JButton getLogarButton() {
		return logarButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	

}

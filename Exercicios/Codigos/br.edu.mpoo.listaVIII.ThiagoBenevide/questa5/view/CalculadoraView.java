package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class CalculadoraView extends JFrame{
	
	 private JTextField campoTexto;
	    private JButton[] botoes;
	    private String[] rotulos = {
	    	"<-", "C", "+-", "R","x²",
	    	"7", "8", "9", "/","x³",
	        "4", "5", "6", "*", "1/x",
	        "1", "2", "3", "-","=",
	        "0", ",", "+",
	    };

	public CalculadoraView() {
		 super("Calculadora");
	        campoTexto = new JTextField(10);
	        campoTexto.setEditable(false);

	        botoes = new JButton[rotulos.length];
	        JPanel painelBotoes = new JPanel(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.insets = new Insets(3, 3, 3, 3);
	        gbc.fill = GridBagConstraints.BOTH;
	        gbc.weightx = 1;
	        gbc.weighty = 1;

	        for (int i = 0; i < rotulos.length; i++) {
	        	
	        	
	        	if(rotulos[i] == "0") {
	        		botoes[i] = new JButton(rotulos[i]);
	        		botoes[i].addActionListener(new BotaoListener());
	        		botoes[i].setHorizontalAlignment(SwingConstants.LEFT); // Alinha o texto à esquerda

	        		gbc.gridx = i % 5;
	        		gbc.gridy = i / 5;
	        		gbc.gridwidth = 2;
	        		painelBotoes.add(botoes[i], gbc);
	        	}else if(rotulos[i] == "=") {
	        		botoes[i] = new JButton(rotulos[i]);
	        		botoes[i].addActionListener(new BotaoListener());
	        		botoes[i].setHorizontalAlignment(SwingConstants.LEFT); // Alinha o texto à esquerda

	        		gbc.gridx = i % 5;
	        		gbc.gridy = i / 5;
	        		gbc.gridheight = 2;
	        		painelBotoes.add(botoes[i], gbc);
	        	}else {
	        		
	        		botoes[i] = new JButton(rotulos[i]);
	        		botoes[i].addActionListener(new BotaoListener());
	        		botoes[i].setHorizontalAlignment(SwingConstants.LEFT); // Alinha o texto à esquerda
	        		gbc.gridx = i % 5;
	        		gbc.gridy = i / 5;
	        		gbc.gridwidth = 1;
	        		painelBotoes.add(botoes[i], gbc);
	        		
	        	}
	        }

	        getContentPane().setLayout(new BorderLayout());
	        getContentPane().add(campoTexto, BorderLayout.NORTH);
	        getContentPane().add(painelBotoes, BorderLayout.CENTER);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 300);
	        setLocationRelativeTo(null);
	        setVisible(true);
		
		
		
	}
	
	private class BotaoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String comando = ((JButton) e.getSource()).getText();
            campoTexto.setText(campoTexto.getText() + comando);
        }
    }
	
}

package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

public class ClientePanel extends JPanel {

	JLabel tituloLabel, nomeLabel, cpfLabel;
	JTextField nomeField, cpfField;
	JButton adicionarButton;
	JPanel panelCentral, panelPrincipal, panelButton;
	GridBagConstraints gbc = new GridBagConstraints();
	
	public ClientePanel() {

		setLayout(new BorderLayout());
		
		panelPrincipal = new JPanel();
		
		tituloLabel = new JLabel("Cliente");
		tituloLabel.setFont(new Font("", Font.BOLD, 20));
		
		panelPrincipal.add(tituloLabel);
		
		panelCentral = new JPanel(new SpringLayout());
		
		nomeLabel = new JLabel("Nome");
		nomeField = new JTextField(10);
		
		try {
			cpfLabel = new JLabel("CPF ");
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		adicionarButton = new JButton("Adicionar");
		adicionarButton.setEnabled(false);
		gbc.gridx = 2;
		gbc.gridy = 2;
		
		panelButton = new JPanel(new GridBagLayout());
		panelButton.add(adicionarButton, gbc);
		
		panelCentral.add(nomeLabel);
		panelCentral.add(nomeField);
		panelCentral.add(cpfLabel);
		panelCentral.add(cpfField);
		
		
		util.SpringUtilities.makeCompactGrid(panelCentral, 2, 2, 6, 6, 6, 6);
		
		add(panelPrincipal, BorderLayout.NORTH);
		add(panelCentral, BorderLayout.CENTER);
		add(panelButton, BorderLayout.PAGE_END);
		
		setVisible(false);
	}

	public JLabel getTituloLabel() {
		return tituloLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JButton getAdicionarButton() {
		return adicionarButton;
	}

	public JPanel getPanelCentral() {
		return panelCentral;
	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public JPanel getPanelButton() {
		return panelButton;
	}
	
}

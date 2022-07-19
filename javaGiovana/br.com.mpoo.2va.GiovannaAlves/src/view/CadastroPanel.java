package view;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CadastroPanel extends JPanel {

	JLabel tituloLabel, generoLabel, anoLabel, descricaoLabel, entradaLabel, salaLabel, dataLabel, horaLabel;
	JTextField tituloField, generoField, anoField, descricaoField, entradaField, salaField, dataField, horaField;
	JCheckBox legendadoCheckBox, dubladoCheckBox;
	JButton addButton;

	// FALTA O LAYOUT
	
	public CadastroPanel() {
		
		setLayout(new BorderLayout());
		
		tituloLabel = new JLabel("Título: ");
		tituloField = new JTextField(10);
		
		generoLabel = new JLabel("Gênero: ");
		generoField = new JTextField(10);
		
		anoLabel = new JLabel("Ano: ");
		anoField = new JTextField(10);

		descricaoLabel = new JLabel("Descrição: ");
		descricaoField = new JTextField(20);
		
		entradaLabel = new JLabel("Entrada: ");
		entradaField = new JTextField(10);

		salaLabel = new JLabel("Sala: ");
		salaField = new JTextField(10);

		dataLabel = new JLabel("Data: ");
		dataField = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
		((JFormattedTextField) dataField).setValue(new java.util.Date());

		horaLabel = new JLabel("Horário: (HH:mm)");
		horaField = new JFormattedTextField(new
		SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime()));
		
		JPanel panelButton = new JPanel();
		
		addButton = new JButton("Add");
		
		addButton.setSize(50,50);
		
		panelButton.add(addButton);
		
		legendadoCheckBox = new JCheckBox("Legendado", true);
		dubladoCheckBox = new JCheckBox("Dublado", true);
		
		
		JPanel panelPrincipal = new JPanel(new SpringLayout());
		
		panelPrincipal.add(tituloLabel);
		panelPrincipal.add(tituloField);
		
		panelPrincipal.add(generoLabel);
		panelPrincipal.add(generoField);
		
		panelPrincipal.add(anoLabel);
		panelPrincipal.add(anoField);
		
		panelPrincipal.add(descricaoLabel);
		panelPrincipal.add(descricaoField);
		
		panelPrincipal.add(legendadoCheckBox);
		panelPrincipal.add(dubladoCheckBox);
		
		panelPrincipal.add(entradaLabel);
		panelPrincipal.add(entradaField);
		
		panelPrincipal.add(salaLabel);
		panelPrincipal.add(salaField);
		
		panelPrincipal.add(dataLabel);
		panelPrincipal.add(dataField);
		
		panelPrincipal.add(horaLabel);
		panelPrincipal.add(horaField);

		util.SpringUtilities.makeCompactGrid(panelPrincipal, 9, 2, 6, 6, 6, 6);
		
		add(panelPrincipal, BorderLayout.CENTER);
		add(panelButton, BorderLayout.PAGE_END);
		
		setVisible(false);
		
	}

	public JLabel getTituloLabel() {
		return tituloLabel;
	}

	public JLabel getGeneroLabel() {
		return generoLabel;
	}

	public JLabel getAnoLabel() {
		return anoLabel;
	}

	public JLabel getDescricaoLabel() {
		return descricaoLabel;
	}

	public JLabel getEntradaLabel() {
		return entradaLabel;
	}

	public JLabel getSalaLabel() {
		return salaLabel;
	}

	public JLabel getDataLabel() {
		return dataLabel;
	}

	public JLabel getHoraLabel() {
		return horaLabel;
	}

	public JTextField getTituloField() {
		return tituloField;
	}

	public JTextField getGeneroField() {
		return generoField;
	}

	public JTextField getAnoField() {
		return anoField;
	}

	public JTextField getDescricaoField() {
		return descricaoField;
	}

	public JTextField getEntradaField() {
		return entradaField;
	}

	public JTextField getSalaField() {
		return salaField;
	}

	public JTextField getDataField() {
		return dataField;
	}

	public JTextField getHoraField() {
		return horaField;
	}

	public JCheckBox getLegendadoCheckBox() {
		return legendadoCheckBox;
	}

	public JCheckBox getDubladoCheckBox() {
		return dubladoCheckBox;
	}

	public JButton getAddButton() {
		return addButton;
	}

}

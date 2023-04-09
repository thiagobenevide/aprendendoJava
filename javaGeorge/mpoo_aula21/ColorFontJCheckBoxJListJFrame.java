/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_21: Fontes, Cores, Swing e Eventos
 */

//Interface com Tratamento para Eventos
//ColorFontJListJFrame.java

package mpoo_aula21;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ColorFontJCheckBoxJListJFrame extends JFrame{

	private String fontColorNames[]={"Red", "Blue", "Green"};
	private Color fontColors[]={Color.red, Color.blue, Color.green};

	private JTextField field;
	private JCheckBox bold, italic;
	private JList fontColorList= new JList(fontColorNames);

	public ColorFontJCheckBoxJListJFrame(){
		super("Aplicacão com ListBox e Fontes com Evento");
		setLayout(new FlowLayout());
		
		field = new JTextField("A Fonte poderá ser trocada!", 20);
		field.setFont(new Font("Serif", Font.PLAIN, 14));
		add(field);

		bold = new JCheckBox("Bold");
		add(bold);     

		italic = new JCheckBox("Italic");
		add(italic);

		// registrando listeners para JCheckBoxes
		CheckBoxHandler handlerCB = new CheckBoxHandler();
		bold.addItemListener(handlerCB);
		italic.addItemListener( handlerCB );

		// cria uma lista com itens do array fontColorNames
		fontColorList.setVisibleRowCount(1);
		// não permite seleções múltiplas
		fontColorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// addicional umJScrollPane que contém JList ao painel de conteúdo

		add(new JScrollPane(fontColorList));

		ListBoxHandler handlerLB = new ListBoxHandler();
		fontColorList.addListSelectionListener(handlerLB);
//		fontColorList.add
		

		setSize(275, 100);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String args[]){ 
		ColorFontJCheckBoxJListJFrame application = new ColorFontJCheckBoxJListJFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}

	// classe interna privada para ItemListener event handling
	private class CheckBoxHandler implements ItemListener {
		private int valBold = Font.PLAIN;
		private int valItalic = Font.PLAIN;

		// respond to checkbox events
		public void itemStateChanged(ItemEvent event){
			if (event.getSource() == bold)
				if (event.getStateChange() == ItemEvent.SELECTED)
					valBold = Font.BOLD;

			if (event.getSource() == italic)
				if (event.getStateChange() == ItemEvent.SELECTED)
					valItalic = Font.ITALIC;
				else
					valItalic = Font.PLAIN;

			field.setFont(new Font("Serif", valBold + valItalic, 14));
		}
	}// fim da classe interna CheckBoxHandler

	private class ListBoxHandler implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent event){
			field.setBackground(fontColors[fontColorList.getSelectedIndex()]);
		}
	}//fim da classe interna ListboxHandler
}  // fim da class ColoFontJList
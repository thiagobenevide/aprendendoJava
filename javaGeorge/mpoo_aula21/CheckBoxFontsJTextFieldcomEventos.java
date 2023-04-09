/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_21: Fontes, Cores, Swing e Eventos
 */

//Interface com Tratamento de Evento

package mpoo_aula21;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFontsJTextFieldcomEventos extends JFrame {
	 
	   private JTextField field;
	   private JCheckBox bold, italic;
	  
	   public CheckBoxFontsJTextFieldcomEventos(){
	      super("Mudando Fonte");
	      
	      setLayout(new FlowLayout());

	      field = new JTextField("A Fonte poderá ser trocada!", 20);
	      field.setFont(new Font("Serif", Font.PLAIN, 14));
	      add(field);

	      bold = new JCheckBox("Bold");
	      add(bold);     

	      italic = new JCheckBox("Italic");
	      add(italic);

	      // registrando listeners para os JCheckBoxes
	      CheckBoxHandler handler = new CheckBoxHandler();
	      bold.addItemListener( handler );
	      italic.addItemListener( handler );

	      setVisible(true);
	      setSize(275, 100);
	      setLocationRelativeTo(null);
	   }
	   

	   // execute application
	   public static void main(String args[]){ 
	      CheckBoxFontsJTextFieldcomEventos application = new CheckBoxFontsJTextFieldcomEventos();
	      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }

	   // classe interna para o ItemListener event
	   private class CheckBoxHandler implements ItemListener {
	      private int valBold = Font.PLAIN;
	      private int valItalic = Font.PLAIN;

	      // método manipulados para os eventos do JCheckBox
	      public void itemStateChanged(ItemEvent event){
	         // avaliando de negrito foi selecionado
	         if (event.getSource() == bold)
	            if (event.getStateChange() == ItemEvent.SELECTED)
	               valBold = Font.BOLD;
	            else
	               valBold = Font.PLAIN;
	               
	         // avaliando se italico foi selecionado
	         if (event.getSource() == italic)
	            if (event.getStateChange() == ItemEvent.SELECTED)
	               valItalic = Font.ITALIC;
	            else
	               valItalic = Font.PLAIN;

	         // setando a fonte do JTextField
	         field.setFont(new Font("Serif", valBold + valItalic, 14));
	      }
	   }
}
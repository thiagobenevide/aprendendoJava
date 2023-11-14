/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_21: Fontes, Cores, Swing e Eventos
 */

// ColorJListJFrame.java
// Selecionando cores de um JList.

package mpoo_aula21;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ColorJListJFrame extends JFrame{
	private Container container;
	private JList colorList;
 
   private String colorNames[] = {"Black", "Blue", "Cyan", 
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
      "Orange", "Pink", "Red", "White", "Yellow"};

   private Color colors[] = {Color.black, Color.blue, 
      Color.cyan, Color.darkGray, Color.gray, Color.green,
      Color.lightGray, Color.magenta, Color.orange, Color.pink,
      Color.red, Color.white, Color.yellow};

   public ColorJListJFrame(){
      super( "List Test" );

      container = getContentPane();//para mudar as configurações do JFrame - na classe interna anônima
      container.setLayout(new FlowLayout());

      colorList = new JList(colorNames);
      colorList.setVisibleRowCount(5); //número de linhas visíveis no JList
      colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// modo de seleção

      colorList.addListSelectionListener(
    		  new ListSelectionListener() {//classe interna anônima para os eventos da seleção do JList
    			  public void valueChanged( ListSelectionEvent event ){//método manipulador
    				  container.setBackground(colors[colorList.getSelectedIndex()]);
    			  }
    		  });

      add(new JScrollPane(colorList));// adicionando o JList com scroll ao JFrame

      setSize( 350, 150 );
      setVisible( true );
      setLocationRelativeTo(null);
   }

   public static void main(String args[]){ 
      ColorJListJFrame application = new ColorJListJFrame();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
   }
}
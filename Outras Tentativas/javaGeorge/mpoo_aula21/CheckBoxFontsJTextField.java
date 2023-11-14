/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_21: Fontes, Cores, Swing e Eventos
 */

//Interface sem Tratamento para Eventos

package mpoo_aula21;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFontsJTextField extends JFrame {

	private JTextField field;
	private JCheckBox bold, italic;

	// set up GUI
	public CheckBoxFontsJTextField() {
		super("Alterando Fontes");

		setLayout(new FlowLayout());

		field = new JTextField( "A Fonte poderá ser trocada!", 20 );
		field.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
		add( field );

		bold = new JCheckBox( "Bold" );
		add( bold );    

		italic = new JCheckBox( "Italic" );
		add( italic );

		setVisible(true);
		setSize( 275, 100 );
		setLocationRelativeTo(null);
	}

	// Executa a aplicação
	public static void main( String args[] )
	{ 
		CheckBoxFontsJTextField application = new CheckBoxFontsJTextField();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
}
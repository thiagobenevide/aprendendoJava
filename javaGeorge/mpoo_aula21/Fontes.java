package mpoo_aula21;
import java.awt.Graphics;
import java.awt.*;

import javax.swing.*;

public class Fontes extends JFrame {
	public Fontes(){
		super( "Using fonts" );
		setLayout(null);
		setSize( 420, 125 );
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	
	public void paint(Graphics g){
		super.paint( g ); // call superclass's paint method
		// seta a fonte como Serif (Times), bold e 12pt
		g.setFont( new Font( "Serif", Font.BOLD, 12));
		g.drawString("Serif 12 point negrito.", 40, 50 );
		// seta a fonte como Monospaced(Courier), italic e 24pt
		g.setFont( new Font( "Monospaced", Font.ITALIC, 24));
		g.drawString("Monospace 24 points italic", 20, 50);
		// seta a fonte como SansSerif(Helvetica), plain e 14pt
		g.setFont( new Font( "SansSerif", Font.PLAIN, 14));
		g.drawString("SansSerif 14 points normal", 20, 90);
		// seta a fonte como Serif (times), bold/italic e 18pt
		g.setColor(Color.red);
		g.setFont(new Font( "Serif", Font.BOLD +Font.ITALIC, 18));
		g.drawString(g.getFont().getName() + " " + 
				g.getFont().getSize() + " point bold and italic.", 20, 110);
		
		
	}
	// aplicacao
	public static void main(String args[]){
		Fontes application = new Fontes();
	}
} //fim da classe Fontws

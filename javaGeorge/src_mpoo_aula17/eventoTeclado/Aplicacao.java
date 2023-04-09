package eventoTeclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aplicacao extends JFrame implements KeyListener
{
	JLabel label = new JLabel("frase");
	
	public Aplicacao(){
		super("titulo");
		setSize(200,200);
		setLayout(null);
		
		add(label);
		
//		label.setLocation(50, 50);
		label.setBounds(0,0,50,10);
		addKeyListener(this);
		
		setVisible(true);
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyText(e.getKeyCode()).equalsIgnoreCase("escape"))
			System.exit(0);
		if (e.getKeyCode()==40)//baixo 
			label.setLocation(label.getX(), label.getY()+1);
		if (e.getKeyCode()==38)//cima
			label.setLocation(label.getX(), label.getY()-1);
		if (e.getKeyCode()==39)//direita
			label.setLocation(label.getX()+1, label.getY());
		if (e.getKeyCode()==37)//esquerda
			label.setLocation(label.getX()-1, label.getY());
			
	}
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}

	public static void main(String[] args) {
		new Aplicacao();
	}
}

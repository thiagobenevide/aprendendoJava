package eventoTeclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aplicacao2 extends JFrame implements KeyListener
{
	JLabel label = new JLabel("frase");
	String posicao = "baixo";
	int x, y;

	public Aplicacao2(){
		super("titulo");
		setSize(200,200);
		setLayout(null);

		add(label);

		label.setBounds(0,0,50,10);
		y=label.getY();
		addKeyListener(this);

		setVisible(true);
		run();
	}

	public void run(){
		while (true){
			if (posicao.equalsIgnoreCase("baixo") && y<=this.getHeight())
				label.setLocation(label.getX(), y--);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
		}
	}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_UP){
			posicao="cima";
			label.setLocation(label.getX(), y++);
		}
	}
	public void keyReleased(KeyEvent arg0) {
		posicao="baixo";
		}
		
	public void keyTyped(KeyEvent arg0) {}

	public static void main(String[] args) {
		new Aplicacao2();
	}
}

package eventoTeclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemo extends JFrame implements KeyListener{
	
	String linha1 = "", linha2 = "", linha3 = "";
	JTextArea textArea;
	
	public KeyDemo(){
		super("Demonstrando Eventos de Teclado");
		
		textArea = new JTextArea (10,15);
		textArea.setText("Pressione qualquer tecla do teclado:");
		textArea.setEditable(false);
		
		add(textArea);
				
//		addKeyListener (this);
		textArea.addKeyListener(this);

		setLocationRelativeTo(null);
		setSize (350, 100);
		setVisible (true);
	}
	
	public void keyPressed(KeyEvent e){
		linha1 = "Tecla Pressionada: " + e.getKeyText(e.getKeyCode());
		setLinhas2e3(e);
	}

	public void keyReleased(KeyEvent e){
		linha1 = "Tecla atualizada: " + e.getKeyText(e.getKeyCode());
		setLinhas2e3(e);
	}
	
	public void keyTyped(KeyEvent e){
		linha1 = "Tecla digitada: " + e.getKeyChar();
		setLinhas2e3(e);
	}

	public void setLinhas2e3(KeyEvent e){
		linha2 = "A Tecla " + (e.isActionKey() ? "eh" : "não é") + " uma ação de teclado";
		
		String temp = e.getKeyModifiersText(e.getModifiers());
		
		linha3 = "Teclas modificadas pressionadas: " + (temp.equals("") ?  "nenhum" : temp);
		
		textArea.setText (linha1 + "\n" + linha2 + "\n" + linha3 + "\n");
	}
	
	public static void main(String args[]){
		KeyDemo aplicacao = new KeyDemo();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
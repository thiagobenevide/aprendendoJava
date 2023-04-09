package eventoMouse;
//Exemplo java Como Programar Pag 632 (Edi��o 4)

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseTracker2 extends JFrame implements MouseMotionListener{

	private JLabel statusMouse;
	
	// configura a GUI e registra os Listeners (tratadores dos eventos)
	public MouseTracker2(){
		super ("Aplica��o com Mouse e Eventos");
		
		statusMouse = new JLabel();
		getContentPane().add (statusMouse, BorderLayout.SOUTH);
		
		addMouseMotionListener(this);
		
		setSize(300, 100);
		setVisible(true);
	}
	
	//****tratadores de eventos para MouseMotionListener
	
	//trata evento quando o mouse � ARRASTADO COM BOT�O CLICADO
	public void mouseDragged (MouseEvent e){
		statusMouse.setText("ARRASTADO E CLICADO na posi��o (" +e.getX() + ", " +e.getY() + ")");
	}
	//trata evento quando o mouse EST� EM MOVIMENTO
	public void mouseMoved (MouseEvent e){
		statusMouse.setText("Mouse movendo na posi��o (" +e.getX() + ", " +e.getY() + ")");
	}

	// executa a aplica��o
	public static void main (String args []){
		MouseTracker2 aplicacao = new MouseTracker2 ();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

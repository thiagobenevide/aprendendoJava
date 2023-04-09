package eventoMouse;
//Exemplo java Como Programar Pag 632 (Edição 4)

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseTracker2 extends JFrame implements MouseMotionListener{

	private JLabel statusMouse;
	
	// configura a GUI e registra os Listeners (tratadores dos eventos)
	public MouseTracker2(){
		super ("Aplicação com Mouse e Eventos");
		
		statusMouse = new JLabel();
		getContentPane().add (statusMouse, BorderLayout.SOUTH);
		
		addMouseMotionListener(this);
		
		setSize(300, 100);
		setVisible(true);
	}
	
	//****tratadores de eventos para MouseMotionListener
	
	//trata evento quando o mouse é ARRASTADO COM BOTÃO CLICADO
	public void mouseDragged (MouseEvent e){
		statusMouse.setText("ARRASTADO E CLICADO na posição (" +e.getX() + ", " +e.getY() + ")");
	}
	//trata evento quando o mouse ESTÁ EM MOVIMENTO
	public void mouseMoved (MouseEvent e){
		statusMouse.setText("Mouse movendo na posição (" +e.getX() + ", " +e.getY() + ")");
	}

	// executa a aplicação
	public static void main (String args []){
		MouseTracker2 aplicacao = new MouseTracker2 ();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

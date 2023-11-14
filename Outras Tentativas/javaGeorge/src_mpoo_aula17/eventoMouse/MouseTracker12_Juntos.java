package eventoMouse;
//Exemplo java Como Programar Pag 632 (Edi��o 4)

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseTracker12_Juntos extends JFrame implements MouseListener, MouseMotionListener{

	private JLabel statusMouse;
	
	// configura a GUI e registra os Listeners (tratadores dos eventos)
	public MouseTracker12_Juntos(){
		super ("Aplica��o com Mouse e Eventos");
		
		statusMouse = new JLabel();
		getContentPane().add (statusMouse, BorderLayout.SOUTH);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setSize(300, 100);
		setVisible(true);
	}
	
	//****tratadores de eventos para MouseListener
	
	//trata evento quando o mouse � CLICADO
	/*public void mouseClicked (MouseEvent e){
		statusMouse.setText("Mouse CLICADO na posi��o (" +e.getX() + ", " +e.getY() + ")");
	}
	*/
	
	public void mouseClicked(MouseEvent e) {
	}

	//trata evento quando o mouse � PRESSIONADO
	public void mousePressed (MouseEvent e){
		statusMouse.setText("Mouse PRESSIONADO na posi��o (" +e.getX() + ", " +e.getY() + ")");
	}
	
	//trata evento quando o mouse � LIBERADO
	public void mouseReleased (MouseEvent e){
		statusMouse.setText("Mouse LIBERADO na posi��o (" +e.getX() + ", " +e.getY() + ")");
	}
	
	//trata evento quando o mouse EST� NA JANELA
	
	public void mouseEntered (MouseEvent e){
//		JOptionPane.showMessageDialog(null, "Mouse EST� NA JANELA");
		statusMouse.setText("Mouse EST� NA JANELA");
	}

	//trata evento quando o mouse SAI DA JANELA
	public void mouseExited (MouseEvent e){
		//JOptionPane.showMessageDialog(null, "Mouse SAIU DA JANELA");
		statusMouse.setText("Mouse SAIU DA JANELA");
		System.out.println("teste");
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
		MouseTracker12_Juntos aplicacao = new MouseTracker12_Juntos ();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

	

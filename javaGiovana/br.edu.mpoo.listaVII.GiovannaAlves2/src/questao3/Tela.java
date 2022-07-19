package questao3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame implements ActionListener {

JButton botaoHide, botaoDispose, botaoSetVisible, botaoExit;
ButtonHandler buttonHandler;
ButtonHandler2 buttonHandler2;
	
	public Tela() {
		super("Quero Fechar essa Tela");
		setSize(400,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		botaoHide = new JButton("hide()");
		add(botaoHide);
	
		botaoDispose = new JButton("Dispose()");
		add(botaoDispose);
		
		buttonHandler = new ButtonHandler();
		botaoDispose.addActionListener(buttonHandler);
		
		botaoSetVisible = new JButton("SetVisible()");
		add(botaoSetVisible);
		
		buttonHandler2 = new ButtonHandler2(this);
		botaoSetVisible.addActionListener(buttonHandler2);

		botaoExit = new JButton("Exit()");
		add(botaoExit);
		botaoExit.addActionListener(
				 new ActionListener() { //tratamento por classe interna anônima
				 @Override
				public void actionPerformed(ActionEvent e) {
				 // exit
					 if (e.getSource() == botaoExit) {
						 System.exit(0);
					 }
				 }
				 }); 

		
		setVisible(true);
}
	
	private class ButtonHandler2 implements ActionListener{

		Tela tela;
		
		public ButtonHandler2(Tela tela) {
		
			this.tela = tela;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// SetVisible
			if (e.getSource() == botaoSetVisible) {
				tela.setVisible(false);
			}
			
		}
		
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//dispose
			if (e.getSource() == botaoDispose) {
				dispose();
			}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// metodo HIDE
		if (e.getSource() == botaoHide) {

			botaoHide.hide();
		}
		
	}

}

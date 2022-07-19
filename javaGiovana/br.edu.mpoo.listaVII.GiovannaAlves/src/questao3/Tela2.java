package questao3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela2 extends JFrame implements ActionListener {

	private JButton hideButton, disposeButton, setVisibleButton, exitButton;
	ButtonHandler buttonHandler;
	ButtonHandler2 buttonHandler2;
	
	public Tela2() {
		super("Quero fechar essa Tela");
		
		setSize(600,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		hideButton = new JButton("Hide()");
		
		hideButton.addActionListener(this);
		
		
		
		disposeButton = new JButton("dispose()");
		buttonHandler = new ButtonHandler();
		
		disposeButton.addActionListener(buttonHandler);
		
		
		setVisibleButton = new JButton("setVisible(false)");
		
		buttonHandler2 = new ButtonHandler2(this);
		
		setVisibleButton.addActionListener(buttonHandler2);
		
		exitButton = new JButton("System.exit(0)");
		
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == exitButton)
					System.exit(0);
			}
		});
		
		add(hideButton);
		add(disposeButton);
		add(setVisibleButton);
		add(exitButton);
		
		setVisible(false);
	}

	private class ButtonHandler implements ActionListener {

		// CLASSE INTERNA 
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == disposeButton) {
				dispose();
			}
			
		}
		
	}
	
	public JButton getHideButton() {
		return hideButton;
	}

	public JButton getDisposeButton() {
		return disposeButton;
	}

	public JButton getSetVisibleButton() {
		return setVisibleButton;
	}

	public JButton getExitButton() {
		return exitButton;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == hideButton) {
			hide();
		}
		
	}
	
}

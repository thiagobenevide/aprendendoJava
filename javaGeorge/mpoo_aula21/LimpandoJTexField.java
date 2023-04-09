package mpoo_aula21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LimpandoJTexField extends JFrame{

	JTextField field, field2;
	JButton botao;
	
	public LimpandoJTexField(){
		super("");
		
		field2 = new JTextField("Texto continua ao clicar");
		field2.setLocation(20, 20);
		field2.setSize(200,30);
		
		field = new JTextField("Texto SAI ao clicar");
		field.setLocation(20, 60);
		field.setSize(200,30);
		this.field.addFocusListener(new FocusListener(){
			public void focusGained(FocusEvent e) {field.setText("");}
			public void focusLost(FocusEvent e) {}
		});

		botao = new JButton("Confirmar");
		botao.setSize(100,50);
		botao.setLocation(20, 100);
		botao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, field2.getText()+"\n"+field.getText());
			}
		});
		
		add(field2);
		add(field);
		add(botao);
		
		setLayout(null);
		setSize(400,300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String [] args){
		new LimpandoJTexField();
	}
}
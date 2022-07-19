package control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import model.Validador;
import view.ClientePanel;
import view.CadastroGUI;

public class CadastroControl implements ActionListener, CaretListener, FocusListener {

	CadastroGUI cadastroGUI;
	MouseTratadora mouseTratadora;
	KeyTratadora keyTratadora;
	boolean status;
	
	public CadastroControl(CadastroGUI cadastroGUI) {
		
		this.cadastroGUI = cadastroGUI;
		cadastroGUI.setVisible(true);
		
		controll();
	}
	
	private void controll() {
		// OK
		mouseTratadora = new MouseTratadora();
		cadastroGUI.getjMenuSair().addMouseListener(mouseTratadora);
		//
		
		// APARECER O PANEL
		cadastroGUI.getCliMenuItem().addActionListener(this);
		
	}
	
	private void update(JPanel panel) {
		
		if (cadastroGUI.getPanelPrincipal() != null) {
			cadastroGUI.getPanelPrincipal().setVisible(false);
			cadastroGUI.setPanelPrincipal(null);
			
			cadastroGUI.setPanelPrincipal(panel);
			cadastroGUI.add(cadastroGUI.getPanelPrincipal(), BorderLayout.CENTER);
			cadastroGUI.getPanelPrincipal().setVisible(true);
		}
		
		else {
		
			cadastroGUI.setPanelPrincipal(panel);
			cadastroGUI.add(cadastroGUI.getPanelPrincipal(), BorderLayout.CENTER);
			
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caretUpdate(CaretEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == cadastroGUI.getCliMenuItem()) {
			update(cadastroGUI.getClientePanel());
		}
		
	}
	
	private class MouseTratadora extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == cadastroGUI.getjMenuSair()) {
				cadastroGUI.getPanelPrincipal().setVisible(false);
				cadastroGUI.setPanelPrincipal(null);
				System.exit(0);
			}
		}
	}
	
	private class KeyTratadora extends KeyAdapter{
		
		@Override
		public void keyReleased(KeyEvent e) {

			String cpfFormated = cadastroGUI.getClientePanel().getCpfField().getText().replace(".", "").replace("-", "");
			
			try {
				if (e.getSource() == cadastroGUI.getClientePanel().getCpfField()) {

					if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
						status = false;
						cadastroGUI.getClientePanel().getAdicionarButton().setEnabled(false);
					}
					
					if ((cpfFormated.length() == 11) && Validador.validarCPF(cpfFormated)) {
						if (cadastroGUI.getClientePanel().getNomeField().getText().length()!=0 &&
								!cadastroGUI.getClientePanel().getNomeField().getText().contains("Nome Completo")) {
							status = true;	
							cadastroGUI.getClientePanel().getAdicionarButton().setEnabled(true);
						}
					}
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}		
		}
	}
	
}

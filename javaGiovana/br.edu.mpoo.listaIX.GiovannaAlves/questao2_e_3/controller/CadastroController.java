package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import model.BaseDados;
import model.Cliente;
import model.ClienteException;
import model.CpfException;
import model.Validador;
import questao1.Mensagem;
import view.TelaCadastro;

public class CadastroController implements ActionListener, CaretListener, FocusListener, KeyListener, MouseListener {

	TelaCadastro telaCadastro;
	boolean status;
	
	public CadastroController(TelaCadastro telaCadastro) {
		
		this.telaCadastro = telaCadastro;
		
		control();
		
	}
	
	private void control() {
		telaCadastro.getMenuSair().addMouseListener(this);
		telaCadastro.getMenuCadastrar().addActionListener(this);
		telaCadastro.getMenuClienteItem().addActionListener(this);
		//telaCadastro.getMenuSairItem().addMouseListener(this);
		telaCadastro.getAdicionarButton().addActionListener(this);
		
		telaCadastro.getNomeField().addFocusListener(this);
		telaCadastro.getNomeField().addCaretListener(this);
		
		telaCadastro.getCpfField().addFocusListener(this);
		telaCadastro.getCpfField().addKeyListener(this);
		telaCadastro.getCpfField().addCaretListener(this);
	}

	private void update() {
		telaCadastro.getPainelTitulo().setVisible(true);
		telaCadastro.getPainelCentral().setVisible(true); 
		telaCadastro.getPainelButton().setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == telaCadastro.getMenuClienteItem()) {
			update();
		}

		else if (e.getSource() == telaCadastro.getAdicionarButton()) {
			 String cpfFormated = telaCadastro.getCpfField().getText().replace(".", "").replace("-", "");
			 try {
				if (Validador.validarCPF(cpfFormated)) {
					BaseDados.adicionarCliente(new Cliente(telaCadastro.getNomeField().getText(), cpfFormated));
					System.out.println("Cliente adicionado com sucesso");
				}
			} catch (CpfException e1) {
				e1.printStackTrace();
				Mensagem.exibirMensagem(e1.getMessage());
			} catch (ClienteException e1) {
				e1.printStackTrace();
				Mensagem.exibirMensagem(e1.getMessage());
			}
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == telaCadastro.getNomeField()) {
			if (telaCadastro.getNomeField().getText().equals("Nome Completo")){
				telaCadastro.getNomeField().setText("");
				telaCadastro.getNomeField().setForeground(Color.BLACK);
			}
		}
		
		if (e.getSource() == telaCadastro.getCpfField()) {
			if (status == true) {
				telaCadastro.getAdicionarButton().setEnabled(true);
			}
			else {
				telaCadastro.getAdicionarButton().setEnabled(false);
			}
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		try {
			
			if (e.getSource() == telaCadastro.getNomeField()) {
				if (telaCadastro.getNomeField().getText().equals("")) {
					telaCadastro.getNomeField().setText("Nome Completo");
					telaCadastro.getNomeField().setForeground(Color.LIGHT_GRAY);
					telaCadastro.getAdicionarButton().setEnabled(false);
				}
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}		
	}

	@Override
	public void caretUpdate(CaretEvent e) {
	
		if (telaCadastro.getNomeField().getText().length()!=0 &&
				!telaCadastro.getNomeField().getText().contains("Nome Completo")) {
			if (status == true) {
				telaCadastro.getAdicionarButton().setEnabled(true);
			}
			if (status == false) {
				telaCadastro.getAdicionarButton().setEnabled(false);
			}
		}
		
		else {
			telaCadastro.getAdicionarButton().setEnabled(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {

		String cpfFormated = telaCadastro.getCpfField().getText().replace(".", "").replace("-", "");
		
		try {
			if (e.getSource() == telaCadastro.getCpfField()) {

				if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					status = false;
					telaCadastro.getAdicionarButton().setEnabled(false);
				}
				
				if ((cpfFormated.length() == 11) && Validador.validarCPF(cpfFormated)) {
					if (telaCadastro.getNomeField().getText().length()!=0 &&
							!telaCadastro.getNomeField().getText().contains("Nome Completo")) {
						status = true;	
						telaCadastro.getAdicionarButton().setEnabled(true);
					}
				}
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == telaCadastro.getMenuSair()) {
			int resp;
			resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", null, JOptionPane.YES_NO_OPTION);
			if (resp == 0) {
				System.exit(0);
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {}
}

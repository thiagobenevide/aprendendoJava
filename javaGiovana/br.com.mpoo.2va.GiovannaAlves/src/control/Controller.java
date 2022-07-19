package control;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import model.BaseDados;
import model.Filme;
import model.FilmeException;
import model.Icone;
import model.Sessao;
import view.CadastroPanel;
import view.CineMPOOView;
import view.MensagemView;

public class Controller {

	CineMPOOView cineMPOOView;
	MenuHandler menuHandler;
	KeyHandler keyHandler;
	private boolean statusCampo;
	Icone icone;
	
	public Controller() {
		
		cineMPOOView = new CineMPOOView();
		cineMPOOView.setVisible(true);
		
		//icone = new Icone();
		
		menuHandler = new MenuHandler();
		keyHandler = new KeyHandler();
		
		control();
		
	}
	
	private void addFilme(boolean legendado, boolean dublado) throws ParseException {
		
		try {
			
			int i = Integer.parseInt(cineMPOOView.getCadastroPanel().getAnoField().getText());
			int e = Integer.parseInt(cineMPOOView.getCadastroPanel().getEntradaField().getText());

			Filme filme = new Filme(cineMPOOView.getCadastroPanel().getTituloField().getText(),
					cineMPOOView.getCadastroPanel().getGeneroField().getText(),
					legendado,
					dublado,
					i,
					cineMPOOView.getCadastroPanel().getDescricaoField().getText());
			BaseDados.addFilme(filme);

			
			try {
				String strData = cineMPOOView.getCadastroPanel().getDataField().getText();
				String strHora = cineMPOOView.getCadastroPanel().getHoraField().getText();
				String concatenada = strData +" " + strHora;
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm");
				Calendar c = Calendar.getInstance();
				c.setTime(s.parse(concatenada));
				int str = Integer.parseInt(cineMPOOView.getCadastroPanel().getSalaField().getText());
				new Sessao(str,
						e,
						c,
						BaseDados.isFilme(filme));
				
				new MensagemView("Sessão criada com sucesso!");
				
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (FilmeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new MensagemView(e.getMessage());
		}
	}
	
	public void control() {
		cineMPOOView.getFilmeMenuItem().addActionListener(menuHandler);
		cineMPOOView.getBackupMenuItem().addActionListener(menuHandler);
		
		cineMPOOView.addKeyListener(keyHandler);
		cineMPOOView.getSairJMenu().addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == cineMPOOView.getSairJMenu()) {
					System.exit(0);
				}
			}
		});
		
		cineMPOOView.getCadastroPanel().getAddButton().addActionListener(menuHandler);
		cineMPOOView.getCadastroPanel().getAddButton().addKeyListener(keyHandler);
		
	}
	
	private void update() {
		
		cineMPOOView.add(cineMPOOView.getCadastroPanel(), BorderLayout.CENTER);
		cineMPOOView.getCadastroPanel().setVisible(true);
		
	}
	
	private boolean validarDados() {
		try {
			if (cineMPOOView.getCadastroPanel().getTituloField().getText().length() != 0 &&
					cineMPOOView.getCadastroPanel().getGeneroField().getText().length() != 0 &&
					cineMPOOView.getCadastroPanel().getAnoField().getText().length() != 0 &&
					cineMPOOView.getCadastroPanel().getDescricaoField().getText().length() != 0 &&
					cineMPOOView.getCadastroPanel().getEntradaField().getText().length() != 0 &&
					cineMPOOView.getCadastroPanel().getSalaField().getText().length() != 0 &&
					cineMPOOView.getCadastroPanel().getDataField().getText().length() != 0 &&
					cineMPOOView.getCadastroPanel().getHoraField().getText().length() != 0) {

				if (cineMPOOView.getCadastroPanel().getLegendadoCheckBox().isSelected() ||
						cineMPOOView.getCadastroPanel().getDubladoCheckBox().isSelected()) {
					statusCampo = true;
					return true;
				}
				else {
					statusCampo = false;
					return false;
					}
				}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
private class KeyHandler extends KeyAdapter {

@Override
public void keyReleased(KeyEvent e) {

	if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
		int v;
		v = JOptionPane.showConfirmDialog(null, "Deseja encerrar o sistema?", "Confirmação", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null);
		if (v == 0) {
			System.exit(0);
		}
	}
	
	if (e.getKeyCode() == KeyEvent.VK_ENTER) {

		if (validarDados() == true) {
			
			if (cineMPOOView.getCadastroPanel().getLegendadoCheckBox().isSelected() && cineMPOOView.getCadastroPanel().getDubladoCheckBox().isSelected()) {
				try {
					addFilme(true, true);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
			}
			
			if (cineMPOOView.getCadastroPanel().getDubladoCheckBox().isSelected()) {
				try {
					addFilme(false, true);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
			}
			
			if (cineMPOOView.getCadastroPanel().getLegendadoCheckBox().isSelected() ) {
				try {
					addFilme(false, true);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		if (statusCampo == false) {
			new MensagemView("O preenchimento de todos os campos é obrigatório!");
		}
	}	
}

}

private class MenuHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cineMPOOView.getFilmeMenuItem()) {
			update();
		}
		
		if (e.getSource() == cineMPOOView.getBackupMenuItem()) {
			// faz o backup
		}
		
		if (e.getSource() == cineMPOOView.getCadastroPanel().getAddButton()) {
			validarDados();
			if (statusCampo == true) {
				
				if (cineMPOOView.getCadastroPanel().getLegendadoCheckBox().isSelected() && cineMPOOView.getCadastroPanel().getDubladoCheckBox().isSelected()) {
					try {
						addFilme(true, true);
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				}
				
				if (cineMPOOView.getCadastroPanel().getDubladoCheckBox().isSelected()) {
					try {
						addFilme(false, true);
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				}
				
				if (cineMPOOView.getCadastroPanel().getLegendadoCheckBox().isSelected() ) {
					try {
						addFilme(false, true);
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				}
			}
			
			if (statusCampo == false) {
				new MensagemView("O preenchimento de todos os campos é obrigatório!");
			}
		}	
	}
}



}
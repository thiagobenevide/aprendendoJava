package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.Icone;

public class CineMPOOView extends JFrame {

	JMenuBar menuBar;
	JMenu cinemaJMenu, sairJMenu;
	JMenuItem filmeMenuItem, backupMenuItem;
	CadastroPanel cadastroPanel;
	
	public CineMPOOView() {
		super("CineMPOO");
		
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		menuBar = new JMenuBar();
		
		cinemaJMenu = new JMenu("Cinema");
		sairJMenu = new JMenu("Sair");
		
		filmeMenuItem = new JMenuItem("Filme");
		filmeMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
		
		backupMenuItem = new JMenuItem("Backup");
		backupMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
		
		cinemaJMenu.add(filmeMenuItem);
		cinemaJMenu.add(backupMenuItem);
		
		menuBar.add(cinemaJMenu);
		menuBar.add(sairJMenu);
		
		setJMenuBar(menuBar);
		
		cadastroPanel = new CadastroPanel();
		
		setVisible(true);

	}

	public JMenu getCinemaJMenu() {
		return cinemaJMenu;
	}

	public JMenu getSairJMenu() {
		return sairJMenu;
	}

	public JMenuItem getFilmeMenuItem() {
		return filmeMenuItem;
	}

	public JMenuItem getBackupMenuItem() {
		return backupMenuItem;
	}

	public CadastroPanel getCadastroPanel() {
		return cadastroPanel;
	}
	
	

}

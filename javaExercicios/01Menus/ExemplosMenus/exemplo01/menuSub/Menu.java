package menuSub;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.Separator;

public class Menu extends JFrame{
	JMenuBar menuBar;
	JMenu fileMenu,editMenu;
	JMenuItem novoMenu, abrirItem, salvarItem, sairItem, cortarItem, copiarItem, colarItem, arquivoItem, pastaItem;
	
	public Menu() {
		setTitle("Exemplo de menu");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("Arquivo");
		editMenu = new JMenu("Editar");
		
		novoMenu = new JMenuItem("Novo");
		abrirItem = new JMenuItem("Abrir");
		salvarItem = new JMenuItem("Salvar");
		sairItem = new JMenuItem("Sair");
		cortarItem = new JMenuItem("Cortar");
		copiarItem = new JMenuItem("Copiar");
		colarItem = new JMenuItem("Colar");
		
		arquivoItem = new JMenuItem("Arquivo");
		pastaItem = new JMenuItem("Pasta");
		
		fileMenu.add(novoMenu);
		fileMenu.addSeparator();
		fileMenu.add(abrirItem);
		fileMenu.add(salvarItem);
		fileMenu.addSeparator();
		fileMenu.add(sairItem);		
		editMenu.add(cortarItem);
		
		editMenu.add(copiarItem);
		editMenu.add(colarItem);
		
		novoMenu.add(arquivoItem);
		novoMenu.add(pastaItem);
		
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		add(menuBar, BorderLayout.PAGE_START);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Menu();
	}
}

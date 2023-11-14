package view;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class CadastroGUI extends JFrame{
	
	ProdutoPanel produtoPanel;
	
	public CadastroGUI(){
		super("T�tulo");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setLayout(new FlowLayout());//mudar na maioria das aplica��es 

		produtoPanel = new ProdutoPanel("Adicionar");
		add(produtoPanel);
		
		setVisible(true);
	}

	public ProdutoPanel getProdutoPanel() {
		return produtoPanel;
	}
}
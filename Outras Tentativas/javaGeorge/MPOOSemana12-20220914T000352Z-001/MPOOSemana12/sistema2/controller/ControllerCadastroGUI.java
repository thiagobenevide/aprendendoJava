package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.DuplicatedProductException;
import model.Produto;
import view.CadastroGUI;

public class ControllerCadastroGUI {
	CadastroGUI cadastroGUI;

	ButtonHandler buttonHandler;
	
	public ControllerCadastroGUI(CadastroGUI cadastroGUI) {
		this.cadastroGUI = cadastroGUI;
		buttonHandler = new ButtonHandler();
		
		control();
	}
	
	private void control(){
		cadastroGUI.getProdutoPanel().getButton().addActionListener(buttonHandler);

//Tratamento de Exce��o: Exemplo de comando que requer try-catch		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//			System.out.println("mensagem ao usuario");
//		}
	}
	
	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Produto produto; 
			if (e.getSource()==cadastroGUI.getProdutoPanel().getButton())
				/*Uso de Exce��o:
				 * 
				 * Erro ao converter dados String em Int: Tratar Exception
				 * Situa��o: Na GUI o usu�rio poder� inserir dados n�o num�ricos
				 * 
				 *
				 * Questionamento: Como fazer tratar na View entrada inv�lida evitando consumir um dado indesejado? (Ex.: permitir apenas n�meros)
				 * Pesquisar consume				 
				 */
				try{
					produto =new Produto(Integer.parseInt(cadastroGUI.getProdutoPanel().getCodBarrasField().getText()),
							cadastroGUI.getProdutoPanel().getNomeField().getText());
					if (BaseDados.adicionarProduto(produto))
						JOptionPane.showMessageDialog(null, "Produto adicionado com Sucesso!");
					else
						JOptionPane.showMessageDialog(null, "Erro ao adicionar Produto!");
						//Questionamento: Como saber qual o tipo de erro?		   
				}catch (NumberFormatException exception) {
					exception.printStackTrace();
					//Tratamento para um tipo de falha: usu�rio n�o digita n�meros
					JOptionPane.showMessageDialog(null, "Erro ao adicionar Produto, codBarras apenas num�rico!");
				}
				catch (DuplicatedProductException exception) {
						exception.printStackTrace();
						//Tratamento para um tipo de falha: usu�rio cadastra um produto j� cadastrado
						JOptionPane.showMessageDialog(null,exception.getMessage());
			}
		}
	}
}
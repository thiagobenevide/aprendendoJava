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

//Tratamento de Exceção: Exemplo de comando que requer try-catch		
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
				/*Uso de Exceção:
				 * 
				 * Erro ao converter dados String em Int: Tratar Exception
				 * Situação: Na GUI o usuário poderá inserir dados não numéricos
				 * 
				 *
				 * Questionamento: Como fazer tratar na View entrada inválida evitando consumir um dado indesejado? (Ex.: permitir apenas números)
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
					//Tratamento para um tipo de falha: usuário não digita números
					JOptionPane.showMessageDialog(null, "Erro ao adicionar Produto, codBarras apenas numérico!");
				}
				catch (DuplicatedProductException exception) {
						exception.printStackTrace();
						//Tratamento para um tipo de falha: usuário cadastra um produto já cadastrado
						JOptionPane.showMessageDialog(null,exception.getMessage());
			}
		}
	}
}
package mpooStore.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import mpooStore.app.App;
import mpooStore.model.BaseDados;
import mpooStore.model.CPFException;
import mpooStore.model.Cliente;
import mpooStore.model.ClienteExeption;
import mpooStore.model.CupomDesconto;
import mpooStore.model.GerenciadorCupom;
import mpooStore.view.AberturaView;
import mpooStore.view.GanharCupomView;

public class GanharCupomController implements ActionListener{
	protected GanharCupomView ganharCupomView;
	protected WindowHandler WindowHandler;
	protected AberturaView aberturaView;
	
	protected GanharCupomController(AberturaView telaAbertura){
		ganharCupomView = new GanharCupomView();
		WindowHandler = new WindowHandler();
		aberturaView = telaAbertura;
		controller();
	}
	
	private void controller() {
		ganharCupomView.addWindowListener(WindowHandler);
		ganharCupomView.getConfirmarButton().addActionListener(this);
	}
	
	
	public class WindowHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			ganharCupomView.setVisible(false);
			aberturaView.setVisible(true);
			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ganharCupomView.getConfirmarButton()) {
			String nome = ganharCupomView.getCamposPanel().getNomeField().getText();
			String cpfTemp = ganharCupomView.getCamposPanel().getCpfFormatField().getText().replace("-", "");
			String cpf = cpfTemp.replace(".", ""); 
			String email = ganharCupomView.getCamposPanel().getEmailField().getText();
			
			//Professor não encontrei outra alternativa para utilizar o gerenciador de cupons, fui obrigado a colocar no APP
			System.out.println(App.gerenciadorCupom.isOfertaCupom());
			if(App.gerenciadorCupom.isOfertaCupom()) {
				if(nome.length()>0 && cpf.length()>0 && email.length()>0) {
					try {
						Cliente cliente = new Cliente(nome, cpf, email);
						if(BaseDados.isCliente(cliente)){
							Cliente clienteBase = BaseDados.buscarCliente(cliente);
							clienteBase.setCupomDesconto(cliente.getCupomDesconto());
							JOptionPane.showMessageDialog(null, "Parabéns, você ganhou R$"+clienteBase.getCupomDesconto().getValor(), "MPOO Store", 0, new ImageIcon("mpooStore.img/icone.png"));
						}
						
					} catch (CPFException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ClienteExeption e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Erro, há campos com valores em branco.", "Erro de dados", JOptionPane.ERROR_MESSAGE);
					
				}				
			}else {
				JOptionPane.showMessageDialog(null, "MPOOStore informa: Não será possível resgatar mais cupons!", "Erro de dados", JOptionPane.ERROR_MESSAGE);
				
			}
		}
		
		
		
		
		
		}
		
		
		
	}


package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.AdocaoException;
import model.Animal;
import model.AnimalException;
import model.BaseDados;
import model.CPFException;
import model.Proprietario;
import view.AdocaoView;
import view.IndexView;
import view.MensagemView;

public class AdocaoController implements ActionListener{
	AdocaoView adocaoView;
	private WindowHandler windowHandler;
	private IndexView telaIndexView;
	public AdocaoController(IndexView indexView) {
		adocaoView = new AdocaoView();
		windowHandler = new WindowHandler();
		telaIndexView = indexView;
		controller();
		
		
	}
	
	private void controller() {
		adocaoView.addWindowListener(windowHandler);
		adocaoView.getAdotarButton().addActionListener(this);
	}

	
	private class WindowHandler extends WindowAdapter{
		
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			adocaoView.setVisible(false);
			telaIndexView.setVisible(true);
		}
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cpf = adocaoView.getCampoPanel().getCpfFormatted().getText().replace(".", "").replace("-", "");
		String nome = adocaoView.getCampoPanel().getNomeField().getText();
		String email = adocaoView.getCampoPanel().getEmailField().getText();
		String fone = adocaoView.getCampoPanel().getFoneFormatted().getText().replace("-", "").replace("+", "").replace("+", "");
		boolean cachorroSelect = adocaoView.getCampoPanel().getCachorroRadio().isSelected();
		boolean gatoSelect = adocaoView.getCampoPanel().getGatoRadio().isSelected();
		boolean coelhoSelect = adocaoView.getCampoPanel().getCoelhoRadio().isSelected();
		boolean semPreferenciaSelect = adocaoView.getCampoPanel().getSemPreferenciaRadio().isSelected();

		
		
		if(e.getSource()==adocaoView.getAdotarButton()) {
			try {
				Proprietario propTemp = new Proprietario(nome, cpf, email, fone);
				Proprietario propTemp2 =BaseDados.buscarProprietario("13077735407"); 
				if(propTemp2 != null) {					
					if(cachorroSelect) {
						boolean status =BaseDados.addAdocao(propTemp2, "cachorro");
						System.out.println(status);
						new MensagemView().exibirMensagem("Parabéns em instante você terá o seu cachorro!");
						new MensagemView().exibirMensagem("Parabéns você ganhou um brinde de R$"+propTemp2.getBrinde());
					}else if(gatoSelect) {
						BaseDados.addAdocao(propTemp2, "gato");
						new MensagemView().exibirMensagem("Parabéns em instante você terá o seu gato!");
						new MensagemView().exibirMensagem("Parabéns você ganhou um brinde de R$"+propTemp2.getBrinde());
					}else if(coelhoSelect) {
						BaseDados.addAdocao(propTemp2, "coelho");
						new MensagemView().exibirMensagem("Parabéns em instante você terá o seu coelho!");
						new MensagemView().exibirMensagem("Parabéns você ganhou um brinde de R$"+propTemp2.getBrinde());
					}else if(semPreferenciaSelect) {
						BaseDados.addAdocao(propTemp2, "sempreferncia");
						new MensagemView().exibirMensagem("Parabéns em instante você terá o seu animal!");
						new MensagemView().exibirMensagem("Parabéns você ganhou um brinde de R$"+propTemp2.getBrinde());
					}

				}
				
			} catch (CPFException e1) {
				new MensagemView().exibirMensagemFalhaSistema("Erro CPF inválido");
			} catch (AdocaoException e2) {
				new MensagemView().exibirMensagemFalhaSistema("Erro nao foi possível realizar a adoção");
			} catch (AnimalException e3) {
				new MensagemView().exibirMensagemFalhaSistema("Não há animais desse tipo para adotar");
			} catch (Exception e4) {
				new MensagemView().exibirMensagemFalhaSistema("Erro inesperado" + e4.getMessage());
			}

		}
	}
}

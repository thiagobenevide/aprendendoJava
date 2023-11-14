package model;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import view.Mensagem;

public class MalaDiretaParabens extends Thread{
	@Override
	public void run() {
		while(true){
			try {
				sleep(5000);//A cada 1 hora = 3600000
				//internalisar o acesso a base
								
				for (UsuarioAbstract usuarioCurrent:BaseDados.usuarios){
					if (usuarioCurrent instanceof Cliente)
						if (isAniversario((Cliente)usuarioCurrent)){
							((Cliente)usuarioCurrent).setCupomDesconto(0.1);
							System.out.println("Parabéns " + usuarioCurrent.getNome());
						}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
				//salvar arquivo
				//mandar um sms para o adm
				//salvar em arquivo um texto para outro programa mandar sms
				Mensagem.exibirMensagem(Mensagem.MENSAGEM_BUG);
				System.exit(0);
			} 
		}
	}

	//poderia ter usado uma solução por Calendar
	@SuppressWarnings("deprecated")
	public boolean isAniversario(Cliente cliente){
		if (cliente.getDataNascimento().getDate()==LocalDateTime.now().getDayOfMonth()
			&&
			cliente.getDataNascimento().getMonth()==LocalDateTime.now().getMonthValue()
			)
			return true;
		return false;
	}
	
	
}

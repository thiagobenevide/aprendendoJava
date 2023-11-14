package model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.swing.JOptionPane;

import view.Mensagem;

public class MalaDiretaParabens extends Thread{ 
	@Override
	public void run() {
		try {
			while(true){
			sleep(5000);
			
			for(UsuarioAbstract usuarioCurrent: BaseDados.usuarios)
				if(usuarioCurrent instanceof Cliente)
					if(isAniversario((Cliente)usuarioCurrent)){
						((Cliente)usuarioCurrent).setCupomDescontoAtivo(CampanhaDivulgacao.cupomPromocional);
						System.out.println("Parabéns para " + usuarioCurrent.getNome());
					}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
			Mensagem.exibirMensagem("Ocorreu erro de execução de mala direta!");
			System.exit(0);
		}
		
		for(UsuarioAbstract usuario: BaseDados.usuarios)
			if(usuario instanceof Cliente)
				System.out.println(((Cliente)usuario).getCupomDescontoAtivo());
	}
	
	@SuppressWarnings("deprecation")
	private boolean isAniversario(Cliente cliente){
		//obs.: poderíamos ter usado Calendar
		if (cliente.getDataNascimento().getDate()==LocalDateTime.now().getDayOfMonth()
				&&
			cliente.getDataNascimento().getMonth()==LocalDateTime.now().getMonthValue()
			)
			return true;
		else
			return false;
	}

//	private boolean isAniversario(Cliente cliente){
//		int diaCliente, mesCliente;
//		int diaAtual, mesAtual;
//		
//		mesCliente = cliente.getValidadeCalendar().get(Calendar.MONTH);
//	
//		if (cliente.getDataNascimento().getDate()==LocalDateTime.now().getDayOfMonth()
//				&&
//			cliente.getDataNascimento().getMonth()==LocalDateTime.now().getMonthValue()
//			)
//			return true;
//		else
//			return false;
//	}
}
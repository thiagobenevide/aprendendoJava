package model;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import view.Mensagem;

public class MalaDiretaParabens2{
	//problema que N�O aborda concorr�ncia
	public static void darCupom(){ 
				for (UsuarioAbstract usuarioCurrent:BaseDados.usuarios){
					if (usuarioCurrent instanceof Cliente)
						if (isAniversario((Cliente)usuarioCurrent)){
							((Cliente)usuarioCurrent).setCupomDesconto(
									((Cliente)usuarioCurrent).getCupomDesconto()+0.1
									);
							System.out.println("Parab�ns " + usuarioCurrent.getNome());
						}
				}
	}

	//poderia ter usado uma solu��o por Calendar
	@SuppressWarnings("deprecated")
	public static boolean isAniversario(Cliente cliente){
		if (cliente.getDataNascimento().getDate()==LocalDateTime.now().getDayOfMonth()
			&&
			cliente.getDataNascimento().getMonth()==LocalDateTime.now().getMonthValue()
			)
			return true;
		return false;
	}
}
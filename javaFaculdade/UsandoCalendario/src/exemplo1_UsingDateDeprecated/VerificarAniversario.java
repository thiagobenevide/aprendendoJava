package exemplo1_UsingDateDeprecated;

import java.time.LocalDateTime;
import java.util.Calendar;

public class VerificarAniversario {
	
	//Boa prática de programação is como boolean	
	public static boolean isAniversario_Solucao1(Pessoa pessoa) {
		if (pessoa.getDataNascimento().getDate()==LocalDateTime.now().getDayOfMonth()
				&&
				pessoa.getDataNascimento().getMonth()==LocalDateTime.now().getMonthValue())
			return true;
		else return false;
	}
	
	//Calendar
	public static boolean isAniversario_Solucao2(Pessoa pessoa) {
		int diaPessoa, mesPessoa;
		int diaAtual, mesAtual;
		
		diaPessoa=pessoa.getDataNascimento().getDate();
		mesPessoa=pessoa.getDataNascimento().getMonth();
		
		diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		mesAtual = Calendar.getInstance().get(Calendar.MONTH);
		
		mesAtual++;
		
		if (diaPessoa == diaAtual && mesPessoa == mesAtual)
			return true;
		else
			return false;
		
		
	}
}

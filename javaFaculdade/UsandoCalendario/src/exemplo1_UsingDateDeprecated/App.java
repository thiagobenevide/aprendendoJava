package exemplo1_UsingDateDeprecated;

import java.util.Calendar;
import java.util.Date;
import java.time.LocalDateTime;

public class App {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jose", new Date(1990,12,31));
		Pessoa pessoa2 = new Pessoa("Maria", new Date(1990,12,31));
	
		//Date
		
		if (VerificarAniversario.isAniversario_Solucao1(pessoa))
			System.out.println("Parabéns para você, José!");
		
		if (VerificarAniversario.isAniversario_Solucao1(pessoa2))
			System.out.println("Parabéns para você, Maria!");
	
		//Calendar
		
		if (VerificarAniversario.isAniversario_Solucao2(pessoa))
			System.out.println("Parabéns para você, José!");
		
		if (VerificarAniversario.isAniversario_Solucao2(pessoa2))
			System.out.println("Parabéns para você, Maria!");
	
		
		//Calendar
		//System.out.println(LocalDateTime.now().getDayOfMonth());
		//System.out.println(LocalDateTime.now().getMonthValue());
		
		
		//System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		//System.out.println(Calendar.getInstance().get(Calendar.MONTH));
	}
}

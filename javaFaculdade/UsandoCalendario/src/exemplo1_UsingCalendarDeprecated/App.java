package exemplo1_UsingCalendarDeprecated;

import java.util.Calendar;
import java.util.Date;
import java.time.LocalDateTime;

public class App {
	
	public static void main(String[] args) {
		//Dica para criar instância de calendar
		//
		
		Calendar calendarTemp1 = Calendar.getInstance();
		calendarTemp1.set(1990, Calendar.DECEMBER, 31);
		Calendar calendarTemp2 = Calendar.getInstance();
		calendarTemp2.set(1985, Calendar.JULY, 25);
		Pessoa pessoa = new Pessoa("Jose", calendarTemp1);
		Pessoa pessoa2 = new Pessoa("Maria", calendarTemp2);
	
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

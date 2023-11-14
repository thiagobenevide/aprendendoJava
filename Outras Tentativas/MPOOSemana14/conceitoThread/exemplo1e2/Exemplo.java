package exemplo1e2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Exemplo extends Thread {
	private int tempoEspera;
	
	
	public Exemplo(int tempoEspera) {
		super();
		this.tempoEspera = tempoEspera;
	}

	public void run() {
		try {
			for (;;) {
				Calendar cal =  Calendar.getInstance();
				Date dataAtual = cal.getTime();
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				String dataFormatada = formato.format(dataAtual);
				System.out.println(dataFormatada);
				
				LocalDateTime agora = LocalDateTime.now();
				LocalDateTime horarioExecute = agora.withHour(0).withMinute(0).withSecond(1).plusDays(1);
				System.out.println(horarioExecute);
						
				Thread.sleep(tempoEspera);				
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
			
		}
	}
	
	
	public int getTempoEspera() {
		return tempoEspera;
	}

	public void setTempoEspera(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}
	
	public static void main(String[] args) {
		Exemplo exe = new Exemplo(86400000);
		
		exe.start();
	}
	
}

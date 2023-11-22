package questao6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
	public static void main(String[] args) {
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("ddMMyy");
		String dataCalibrada = formatador.format(data);
		System.out.println(data);
		System.out.println(dataCalibrada);
	}
}

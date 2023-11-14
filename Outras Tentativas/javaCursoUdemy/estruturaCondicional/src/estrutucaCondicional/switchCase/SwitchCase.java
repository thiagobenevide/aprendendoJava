package estrutucaCondicional.switchCase;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int x = entrada.nextInt();
		String dia = null;
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia="terça";
			break;
		case 4:
			dia="quarta";
			break;
		case 5:
			dia="quinta";
			break;
		case 6:
			dia="sexta";
			break;
		case 7:
			dia="sabado";
			break;
		}
		
		System.out.println("Hoje é "+dia);
		entrada.close();
	}
}

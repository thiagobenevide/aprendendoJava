package livroCapitulo2;
import java.util.Scanner;


public class Exemplo5Addition {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int numero1;
			int numero2;
			int soma;
			
			System.out.print("Digite o primeiro número inteiro:");
			numero1 = input.nextInt();
			System.out.print("Digite o segudo número inteiro:");
			numero2 = input.nextInt();
			soma = numero1 + numero2;
			System.out.printf("A soma é igual a %d%n", soma);
		}
		
	}

}

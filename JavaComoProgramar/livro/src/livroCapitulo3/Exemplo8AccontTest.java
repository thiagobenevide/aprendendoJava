package livroCapitulo3;
import java.util.Scanner;


public class Exemplo8AccontTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Exemplo7Accont myAccont = new Exemplo7Accont();
		
		System.out.printf("Nome inicial: %s%n%n", myAccont.getNome());
		
		System.out.println("Por favor, digite o seu nome: ");
		String oNome = input.nextLine();
		myAccont.setNome(oNome);
		System.out.println();
		
		System.out.printf("Nome do objeto minha conta: %n%s%n", myAccont.getNome());
	
		
		
	}

}

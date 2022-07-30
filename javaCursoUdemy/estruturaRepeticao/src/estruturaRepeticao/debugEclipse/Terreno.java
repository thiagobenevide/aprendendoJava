package estruturaRepeticao.debugEclipse;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o custo por metro quadrado do terreno: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura*comprimento;
		double preco = area*metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
		
		sc.close();
	}
}

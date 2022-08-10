package app;

public class Questao8 {
	public static void main (String args[]) {
		int linha = 10, coluna;
		while (linha >= 1) {
			coluna = 1;
			while (coluna <= 10) {
				System.out.print (linha % 2 == 1 ? "<" : ">");
				++coluna;
			}
			--linha;
			System.out.println();
		}
	}
}
package duvida;

import javax.swing.JOptionPane;

public class Duvida {
	String saida="";
	
	public static String metodo(){
		int cont=1;
		while (true){
			if (cont%2==1)
				return saida="é impar";
		}
	}
	
	public static void main(String[] args) {
		System.out.println("oi");
		JOptionPane.showConfirmDialog(null, "texto");
	}
}

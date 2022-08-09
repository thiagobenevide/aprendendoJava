package br.edu.mpoo.listaII.ThiagoBenevide;

import java.util.Scanner;

public class Limpeza {
	private String frase;	

	public void digitarFrase() {
		Scanner frase = new Scanner(System.in);
		
		this.setFrase(frase);
		
		
	}
	
	
	public static void main(String[] args) {
		
	}
	
	public String getFrase() {
		return frase;
	}

	public void setFrase(Scanner frase) {
		this.frase = frase;
	}
	
	
	
	

}

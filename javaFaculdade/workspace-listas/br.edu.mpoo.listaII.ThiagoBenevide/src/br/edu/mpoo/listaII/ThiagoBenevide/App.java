package br.edu.mpoo.listaII.ThiagoBenevide;

public class App {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Jorge");
		
		Fruta f1 = new Fruta("Laranja", true, true);
		System.out.println(c1.removerCaroco(f1));
		System.out.println(c1.removerCasca(f1));
		
		System.out.println(f1.toString());
	}
	
}

package questao14_2;

public class App {
	public static void main(String[] args) {
	
		Robot r1 = new Robot("Jarvis", 0,0);
		
		System.out.println(r1.inicializarRobo());
		r1.andarUmPasso();
		r1.adiciarVariosPassos(10, 20);
		
		System.out.println(r1.toString());
		
	}
}

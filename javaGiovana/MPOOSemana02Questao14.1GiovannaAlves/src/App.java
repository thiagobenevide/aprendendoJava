
public class App {

	public static void main(String[] args) {
		Fruta fruta1  = new Fruta(true, true);
		Fruta fruta3  = new Fruta(false, true);
		Fruta fruta2  = new Fruta(true, false);
		
		System.out.println(" ");
		System.out.println("Fruta 1");
		System.out.println(" ");
		
		Fruta.retirarCaroco(fruta1);
		Fruta.retirarCasca(fruta1);
		Fruta.comerFruta(fruta1);
		fruta1 = null;
		
		System.out.println(" ");
		System.out.println("Fruta 2");
		System.out.println(" ");
	
		Fruta.retirarCaroco(fruta2);
		Fruta.retirarCasca(fruta2);
		Fruta.comerFruta(fruta2);
		
		fruta2 = null;
		
		System.out.println(" ");
		System.out.println("Fruta 3");
		System.out.println(" ");
		
		Fruta.retirarCaroco(fruta3);
		Fruta.retirarCasca(fruta3);
		Fruta.comerFruta(fruta3);
		fruta3 = null;
		
		
		System.gc();
	}
}

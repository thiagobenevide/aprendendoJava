package questao4_1;

public class App {
	
	public static void main(String[] args) {
		SuperClasse sp1 = new SuperClasse("Thiago", 19, "Custódia");
		SubClasse sb1 = new SubClasse("Joaquim", 50, "Londres");
		
		System.out.println(sp1.toString());
		System.out.println(sb1.toString());
		
	}
}

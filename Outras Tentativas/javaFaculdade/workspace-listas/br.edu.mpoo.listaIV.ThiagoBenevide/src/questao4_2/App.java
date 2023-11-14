package questao4_2;

public class App {
	
	public static void main(String[] args) {
		SuperClasse sp1 = new SuperClasse("Thiago", 19, "Custodia");
		SubClasse sb1 = new SubClasse("Joaquim", 50, "Londres");
		
		System.out.println(sp1.toString());
		System.out.println(sb1.toString());
		
		System.out.println(sp1.isCustodia());
		System.out.println(sb1.isCustodia());
		
	}
}

package questao4_3;

public class App {
	
	public static void main(String[] args) {
		SubClasse sb1 = new SubClasse("Thiago", 19, "Custodia");
		SubClasse sb2 = new SubClasse("Joaquim", 50, "Londres");
		
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		
		System.out.println(sb1.isCustodia());
		System.out.println(sb2.isCustodia());
		
	}
}

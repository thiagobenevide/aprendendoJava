package livroCapitulo4;

public class Exemplo11StringCompare {

	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = "goodbye";
		String s3 = "Happy Birthday";
		String s4 = "happy birthday";
		
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);
		
		// Teste para igualdade
		
		if (s1.equals("hello"))
			System.out.println("s1 equals \"hello\"");
		else
			System.out.println("s1 does not equal \"hello\"");
		
		//testar quanto à integridade com ==
		if (s3.equalsIgnoreCase(s4))
			System.out.println("%");
	}

}

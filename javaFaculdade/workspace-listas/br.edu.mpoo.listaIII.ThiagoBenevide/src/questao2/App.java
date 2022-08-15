package questao2;

public class App {
	
	public static void main(String[] args) {

		Conta c1 = new Conta(1223, 50);
		Poupanca p1 = new Poupanca(1223, 50);
		
		c1.credito(70);
		c1.debido(100);
		
		
		p1.credito(90);
		p1.debido(45);
		
		
		System.out.println(c1.toString());
		System.out.println(p1.toString());
	}
		

	
}

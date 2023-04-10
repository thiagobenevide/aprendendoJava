package sincronizacaoMetodo;

public class App {
	static Conta conta = new Conta();
	
	public static void main(String[] args) {
		System.out.println("started");
		new AppDeposito().start();
		new AppGetConta().start();
		new AppGetConta().start();
	}
}

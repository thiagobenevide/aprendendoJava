package sincronizacaoObjeto;

public class App {
	static Conta conta = new Conta();
	
	public static void main(String[] args) {
		new AppDeposito().start();
		new AppGetConta().start();
		new AppGetConta().start();
	}
}

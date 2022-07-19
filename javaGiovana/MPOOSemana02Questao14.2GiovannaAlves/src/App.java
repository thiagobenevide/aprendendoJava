
public class App {

	public static void main(String[] args) {
		
		Robot robo = new Robot("jORGE", "(0,0)", "Central");
		
		BaseDados.createBase();
		BaseDados.adicionarRobo(robo);
		BaseDados.inicializar(robo);
		BaseDados.retornaPosZero(robo);
		BaseDados.configuracao(robo);
		
		robo = null;
		System.gc();
	}
}

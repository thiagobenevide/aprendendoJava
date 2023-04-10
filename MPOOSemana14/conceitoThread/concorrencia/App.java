package concorrencia;

public class App {

	static Valor valor = new Valor();

	public static void main(String[] args) {

		CuriosoVer curioso1Ver = new CuriosoVer();
		CuriosoVer curioso2Ver = new CuriosoVer();
		CuriosoMudar curioso1Mudar = new CuriosoMudar();
		CuriosoMudar curioso2Mudar = new CuriosoMudar();
		//poderíamos ter N curiosos em concorrência para ver/mudar valor.numero

		valor.numero=1;

		curioso1Ver.start();
		curioso2Ver.start();
		curioso1Mudar.start();
		curioso2Mudar.start();
	}
}

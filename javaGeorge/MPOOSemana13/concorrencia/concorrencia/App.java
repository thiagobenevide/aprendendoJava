package concorrencia;

public class App {
	
	static Valor valor = new Valor();
	
public static void main(String[] args) {
	
	CuriosoVer curioso1 = new CuriosoVer();
	CuriosoMudar curioso2a = new CuriosoMudar();
	CuriosoMudar curioso2b = new CuriosoMudar();
	
	valor.numero=1;
	
	curioso1.start();
	curioso2a.start();
	curioso2b.start();
	
//	for (int i=0;i<10;i++){
//		curioso2.mudarValor(Valor.numero=Valor.numero*2);
//		System.out.println(curioso1.verValor());
//	}
}
}

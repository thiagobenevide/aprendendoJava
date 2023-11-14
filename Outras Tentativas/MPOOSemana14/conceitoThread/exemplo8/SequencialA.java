package exemplo8;
import java.lang.Thread;

public class SequencialA extends Object {
	public static void main(String args[]) throws Exception {
		int i;
		Exemplo ex2 = new Exemplo();
		Exemplo TTA = new Exemplo();
		
		Thread thA = new Thread(TTA);
		thA.start();
		
		for (i=0; i<10; i++) {
			ex2.f("normal");
			Thread.sleep(1000);
		}
	}
}
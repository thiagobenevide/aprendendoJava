
public class Partes {

	int atrParte;
	
	//public Parte(Todo todo) {}

	public Partes(int atrParte, Todo todo) {
		//todo.parte.atrParte = atrParte;
		// PARTE NÃO PODE TER THIS
		// PULO DO GATO
		todo.partes.add(new Partes(atrParte));
	}
	
	private Partes(int atrParte) {
		this.atrParte = atrParte;
		// PULO DO GATO
	}
	
	
}

package questao1;

public class Homem extends Animal implements Racional {

	@Override
	public void falar() {
		System.out.println("Falando...");
		
	}

	@Override
	public void andar() {
		System.out.println("Andando..");
		
	}

}

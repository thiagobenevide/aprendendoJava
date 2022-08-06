package sistemaPetShop;

public class App {
	public static void main(String[] args) {
		BaseDados.createBaseDados();
		Cachorro cachorro1 = new Cachorro("Rex", "dobermann", 1,10,"desnutrido");
		Gato gato1 = new Gato("Pixano", "angorá", 1, 3, "saudável");
		Gato gato2 = new Gato("Pixano", "angorá", 1, 3, "saudável");
		BaseDados.addAnimal(cachorro1);
		BaseDados.addAnimal(gato1);
		BaseDados.addAnimal(gato2);
		BaseDados.getDadosBase();
		int quantidade = BaseDados.quantidadeAnimais();
		
	}
}

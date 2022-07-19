package sistemaPetShop;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Animal> animais;
	
	public static void createBaseDados() {
		animais = new ArrayList<Animal>();
		inicializarBase();
	}
	
	private static void inicializarBase() {
		animais.add(new Cachorro(1, "REX", "DOBERMANN", 1, 10, "DESNUTRICAO"));
		animais.add(new Gato(2, "PIXANO", "ANGORÁ", 1, 2, "DESNUTRICAO"));
		animais.add(new Gato(3, "PIXANO", "ANGORÁ", 1, 3, "SAUDAVEL"));
	}
	
	private static Animal buscarAnimal(Animal animal) {
		for (Animal animalCurrent : animais)
			if (animalCurrent.getId() == animal.getId())
				return animalCurrent;
		return null;
	}
	
	private static Animal buscarAnimal(int id) {
		for (Animal animalCurrent : animais) 
			if (animalCurrent.getId() == id)
				return animalCurrent;
		return null;
	}
	
	public static boolean addAnimal(Animal animal) {
		if(buscarAnimal(animal) == null) {
			animais.add(animal);
			return true;
			}
		return false;
	}
	
	public static boolean removerAnimal(Animal animal) {
		if (buscarAnimal(animal) != null) {
			animais.remove(animal);
			System.gc();
			return true;
		}
		return false;
	}
	
	public static boolean isAnimal(Animal animal) {
		if (buscarAnimal(animal) != null) {
			return true;
		}
		return false;
	}
	
	public static boolean atualizarAnimal(Animal animalOld, Animal animalNew) {
		if(isAnimal(animalOld)==true && isAnimal(animalNew) == false) {
			animais.set(animais.indexOf(animalOld), animalNew);
			return true;
		}
		return false;
	}

	public static ArrayList<Animal> getAnimais() {
		return animais;
	}
	
	public static int getTamanhoBase() {
		return animais.size();
	}
	
	public static String getDadosAnimal(int id) {
		return buscarAnimal(id).toString();
	}
	
	public static String getDadosBase() {
		
		ArrayList<String> dados = new ArrayList<>();
		
		for (Animal animalCurrent : animais) {
			dados.add(animalCurrent.toString());
		}
		return dados.toString();
	}
	
}

package sistemaPetShop;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Animal> animais;

	public static void createBaseDados() {
		animais = new ArrayList<Animal>();
		inicializarBase();
	}
	
	private static void inicializarBase() {
		
	}
	
	private static Animal buscarAnimal(Animal animal) {
		int idAnimal = animais.indexOf(animal);
		Animal animalBuscado = animais.get(idAnimal);
		return animalBuscado;
	}
	
	private static Animal buscarAnimal(int id) {
		Animal idAnimalBuscado = animais.get(id);
		return idAnimalBuscado;
	}
	
	public static boolean addAnimal(Animal animal) {
		animais.add(animal);
		return true;
	}
	
	public static boolean removerAnimal(Animal animal) {
		animais.remove(animal);
		return false;
	}
	
	
	public static boolean isAnimal(Animal animal) {
		int verificar = animais.indexOf(animal);
		if (verificar == -1) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean atualizarAnimal(Animal animalOld, Animal animalNew) {
		int indexAnimalOld = animais.indexOf(animalOld);
		animais.set(indexAnimalOld, animalNew);
		return true;
	}
		
	public static ArrayList<Animal> getAnimais() {
		return animais;
	}
	
	public static String getDadosAnimal(String login) {
		
		
		return null;
	}
	
	public static void getDadosBase() {
		for (Animal ani : animais) {
			System.out.println("----------------------------------------");
			System.out.println(ani.getId());
			System.out.println(ani.getNome());
			System.out.println(ani.getRaca());
			System.out.println(ani.getPeso());
			System.out.println(ani.getEstado());
		}
		
	}
	
	public static int quantidadeAnimais() {
		int quantidade = animais.size();
		return quantidade;
	}
	
	
		
}


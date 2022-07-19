package sistemaPetShop;

import java.util.ArrayList;

public class Proprietario extends Pessoa {
	
	public Proprietario(String nome, String cpf, String fone) {
		super(nome, cpf, fone);
		this.animais = new ArrayList<Animal>();
		BaseDados.getProprietarios().add(this);
	}
	
	private static ArrayList<Animal> animais;
	
	private static Animal buscarAnimal(Animal animal) {
		if (animal != null) {
			if (buscarAnimal(animal.getId()) != null)
				return buscarAnimal(animal.getId());
		}
		return null;
	}
	
	private static Animal buscarAnimal(int id) {
		for (Animal animalCurrent : animais) {
			if (animalCurrent.getId() == id) {
				return animalCurrent;
			}
		}
		return null;
	}
	
	public static boolean addAnimal(Animal animal) {
		if (buscarAnimal(animal.getId()) == null) {
			animais.add(animal);
			return true;
		}
		return false;
	}
	
	public static boolean removerAnimal(Animal animal) {
		if (buscarAnimal(animal.getId()) != null) {
			animais.remove(animal);
			return true;
		}
		return false;
	}
	
	public static boolean isAnimal(Animal animal) {
		for (Animal animalCurrent : animais) {
			if (animalCurrent.getId() == animal.getId()) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean atualizarAnimal(Animal animalOld, Animal animalNew) {
		if (isAnimal(animalOld) == true && isAnimal(animalNew) == false) {
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

	@Override
	public String toString() {
		return "Proprietario [getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getFone()=" + getFone()
			 + getAnimais() + "]";
	}

}

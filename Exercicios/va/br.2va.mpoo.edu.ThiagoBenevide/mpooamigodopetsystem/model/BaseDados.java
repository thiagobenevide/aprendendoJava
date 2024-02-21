package model;

import java.util.ArrayList;
import java.util.Collections;

import app.App;

public class BaseDados {
	private static ArrayList<Proprietario> proprietarios;
	private static ArrayList<Animal> animaisDisponiveis;
	
	public static void createBase() throws CPFException{
		proprietarios = new ArrayList<Proprietario>();
		animaisDisponiveis = new ArrayList<Animal>();
		inicializarBase();
	}
	
	private static void inicializarBase() throws CPFException {
		proprietarios.add(new Proprietario("Thiago Benevide", "13077735407", "thiagobenevide@live.com", "87999026780"));
		animaisDisponiveis.add(new Animal("ca001", "cachorro", "Dogao", "Vira-Lata", 1, 10.0));
		animaisDisponiveis.add(new Animal("ca002", "cachorro", "Nino", "Rottweiler", 2, 30.0));
		animaisDisponiveis.add(new Animal("co001", "coelho", "bolota", "Le�o", 1, 1));
		animaisDisponiveis.add(new Animal("co002", "coelho", "fofo", "Angor�", 2, 1.5));
		animaisDisponiveis.add(new Animal("ga001", "gato", "miau", "Siam�s", 4, 1.5));
		animaisDisponiveis.add(new Animal("ga002", "gato", "fifi", "Angor�", 5, 5));
		proprietarios.add(new Proprietario("Godofredo Alves", "35825183027", "godofredo@gmail.com", "81999990000"));

	}
	
	public static Proprietario buscarProprietario (String cpf){
		if (cpf==null)
			return null;
		
		for (Proprietario proprietarioCurrent:proprietarios)
			if (proprietarioCurrent.getCpf().equalsIgnoreCase(cpf))
				return proprietarioCurrent;
		
		return null;
	}
	
	public static boolean addProprietario(Proprietario proprietario){
		if (proprietario==null)
			return false;
	
		if (!proprietarios.contains(buscarProprietario(proprietario.getCpf())))
			return proprietarios.add(proprietario);
		
		return false;
	}

	/** 
	 * <b><i>buscarAnimal</b></i>
	 * 	 
	 * <p>
	 * <style>
	 * .tab1 {
	 *   tab-size: 2;
	 *   }
	 * </style>
	 * <pre class="tab1"> <code>public static Animal buscarAnimal(String tipo)</code> </pre>
	 * 
	 * <p> Este retorna um animal conforme o tipo. O Animal � escolhido aleatoriamente.

	 * @param tipo - 
	 * 	Tipo do Animal: cachorro, gato ou coelho. 
	 */
	public static Animal buscarAnimal(String tipo){ 
		if (tipo == null)
			return null;
		
		Collections.shuffle(animaisDisponiveis); //embaralha a lista. 
		
		for (Animal animalCurrent : animaisDisponiveis){
			if (animalCurrent.getTipo().equalsIgnoreCase(tipo))
				return animalCurrent;
		}
		return null;
	}
	
	public static boolean addAdocao(Proprietario proprietario, String tipoAnimal) throws AnimalException, AdocaoException{
		Proprietario proprietarioTemp = buscarProprietario(proprietario.getCpf()); 
		
		if(proprietarioTemp != null) {
			Animal animalTemp =buscarAnimal(tipoAnimal); 
			if(animalTemp!=null) {
				proprietarioTemp.getAnimais().add(animalTemp);
				proprietarioTemp.setBrinde(App.gerenciadorBrinde.valorBrinde);
				animaisDisponiveis.remove(animalTemp);
				return true;
			}
			throw new AnimalException();
		}
		throw new AdocaoException();
		
		
		
	}
}
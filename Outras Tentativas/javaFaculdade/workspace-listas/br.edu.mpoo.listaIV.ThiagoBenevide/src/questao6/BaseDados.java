package questao6;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Campanha> campanhas;
	
	
	public static void createBase() {
		campanhas = new ArrayList<Campanha>();
	}
	
	
	public static ArrayList<Campanha> getCampanhas() {
		return campanhas;
	}

	public static void setCampanhas(ArrayList<Campanha> campanhas) {
		BaseDados.campanhas = campanhas;
	}
	
	/*
	 * CRUD Created Read Update Delete
	 */

	
	
	
}

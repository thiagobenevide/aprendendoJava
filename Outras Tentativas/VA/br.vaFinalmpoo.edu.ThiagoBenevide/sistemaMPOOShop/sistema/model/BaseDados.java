package sistema.model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Pessoa> pessoas;
	private static ArrayList<Compra> compras;
	private static Brinde brinde;
	
	public static void createBase() {
		pessoas = new ArrayList<Pessoa>();
		compras = new ArrayList<Compra>();
	}
	
	public static void inicializarBase() {
		
	}
	
	public boolean adicionarCompra(Compra compra, String codigoCupom) {
		return false;
	}
	
	public Pessoa buscarCliente(String cpf) throws ClienteException{
		return null;
	}
	
	public static boolean RemoverCupomCliente(String codigoCupom, Cliente cliente) {
		return false;
	}
	
	
	
	
	
	
}

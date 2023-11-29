package questao6;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Compra>compras;
	private static ArrayList<Venda>vendas;
	
	public static void createBase() {
		compras = new ArrayList<Compra>();
		vendas = new ArrayList<Venda>();
		
	}
	
	public static Compra buscarCompra(Compra compra) {
		if(compra!=null)
			for(Compra compraCurrent: compras)
				if(compraCurrent.getId() == compra.getId())
					return compraCurrent;
		
		return null;
		
	}
	
	
	public static Compra buscarCompra(int id) {
	
		for(Compra compraCurrent: compras)
			if(compraCurrent.getId() == id)
				return compraCurrent;
	
		return null;
		
	}
	
	public static boolean adicionarCompra(Compra compra) {
		if(compra!=null)
			if(buscarCompra(compra)==null)
				compras.add(compra);
		
		return false;
	}
	
	public static boolean removerCompra(Compra compra) {
		if(compra!=null) {
			compras.remove(compras.indexOf(buscarCompra(compra)));
			return true;
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
}

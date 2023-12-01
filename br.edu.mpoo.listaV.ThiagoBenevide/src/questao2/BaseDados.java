package questao2;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente>clientes;
	
	
	public static Cliente buscarCliente(Cliente cliente) {
		if(cliente!=null)
			for(Cliente clienteCurrent:clientes)
				if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf()))
					return clienteCurrent;
		
		return null;
	}
	 
	
	
}

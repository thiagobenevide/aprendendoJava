package questao3;

import java.util.ArrayList;

public class BaseDadosEnderecos {
	
	private static ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
	
	public static void inicializarBase() {
		enderecos = new ArrayList<Endereco>();
	}
	
	public static Endereco buscarEndereco(Endereco endereco) {
		for(Endereco enderecoCurrent : enderecos) {
			if(enderecoCurrent.getLogradouro().equals(endereco.getLogradouro())) {
				return enderecoCurrent;
			}
		}
		return null;
	}
	
	public static boolean isEndereco(Endereco endereco) {
		if (buscarEndereco(endereco) != null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarEndereco(Endereco endereco) {
		if (isEndereco(endereco) == false) {
			enderecos.add(endereco);
			return true;
			}
		return false;
	}
	
	public static boolean removerEndereco(Endereco endereco) {
		if(isEndereco(endereco) == true) {
			enderecos.remove(endereco);
			return true;
		}
		return false;
	}
	
	public static boolean atualizarEndereco(Endereco enderecoOld, Endereco enderecoNew) {
		if(enderecoOld != null && enderecoNew != null) {
			if(isEndereco(enderecoNew) == false && isEndereco(enderecoOld) == true) {
				enderecos.set(enderecos.indexOf(enderecoOld), enderecoNew);
				return true;
			}	
			return false;
		}
		return false;
	}
	
	public static void listarEnderecos() {
		for (Endereco enderecoCurrent : enderecos) {
			System.out.println(enderecoCurrent);

		}
	}
}

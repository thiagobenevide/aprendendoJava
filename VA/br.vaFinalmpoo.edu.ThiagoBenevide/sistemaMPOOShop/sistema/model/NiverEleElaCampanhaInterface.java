package sistema.model;

public interface NiverEleElaCampanhaInterface {
	
	public default void pegarCupom(Cliente cliente, String codigoCupom)throws ClienteException, CupomException {
		
	}
	
	public static boolean validarCupom(String codigoCupom) {
		return false;
	}
	
	public static double valorCupom(String codigoCupom) {
		return 0.0;
	}
}

package mpooStore.model;

public interface ValidadorCupomInterface {

	public static boolean validarCupom(String codigoCupom) {
		if(GerenciadorCupom.CODIGO_CUPOM.equals(codigoCupom)) {
			return true;
		}
		return false;
	}
}

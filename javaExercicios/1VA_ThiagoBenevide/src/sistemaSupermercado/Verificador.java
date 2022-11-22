package sistemaSupermercado;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Verificador {
	private static boolean verificarVencimento(Date validadeProduto) {
		return true;
	
	}
	
	public static boolean isVerificarVencimento(Produto produto) {
		if(verificarVencimento(produto.validade)) {
			return true;
		}
		return false;
	}
}

package sistemaSupermercado;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Verificador {
	private static boolean verificarVencimento(Date validadeProduto) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
	}
	
	public static boolean isVerificarVencimento(Produto produto) {
		if(verificarVencimento(produto.validade)) {
			return true;
		}
		return false;
	}
}

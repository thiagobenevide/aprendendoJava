package sistema.view;

import javax.swing.JOptionPane;

public class MensagemView extends JOptionPane{

	public static void clienteValido(String mensagem) {
		showMessageDialog(null, "Cliente Válido!");
	}
	public static void cupomValido(String mensagem) {
		showMessageDialog(null, "Cupom Válido!");
	}
}

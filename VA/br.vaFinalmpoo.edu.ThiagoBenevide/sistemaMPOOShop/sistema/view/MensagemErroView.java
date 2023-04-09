package sistema.view;

import javax.swing.JOptionPane;

public class MensagemErroView extends JOptionPane {

	public static void clienteInvalido(String mensagem) {
		showMessageDialog(null, "Cliente inválido!");
	}
	public static void cupomInvalido(String mensagem) {
		showMessageDialog(null, "Cupom inválido!");
	}
}

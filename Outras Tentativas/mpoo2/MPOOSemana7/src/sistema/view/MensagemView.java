package sistema.view;

import javax.swing.JOptionPane;

import sistema.model.Mensagem;

public class MensagemView extends JOptionPane{
	
	/**
	 * Exibe caixa de diálogo com status de ação Login
	 * @param mensagem
	 *     Mensagem a exibir na caixa de diálogo
	 *     <p>
	 *     <b> Opções <b/>
	 *     <p>
	 *     Mensagem.LOGIN_SUCESSO = "Login efetuado com sucesso!";
	 *     <p>
	 *     Mensagem.LOGIN_ERRO = "Falha ao logar!";
	 * 
	 * @param tipoMensagem
	 *     <p>
	 *     <b> Opções <b/>
	 *     <p>
	 *     0 = JOptionPane.CLOSED_OPTION
	 *     <p>
	 *     1 = JOptionPane.ERROR_MESSAGE
	 * 
	 * 
	 */
	public MensagemView(String mensagem, int tipoMensagem){
		switch (tipoMensagem) {
		case 0:
			showMessageDialog(null, mensagem, "Status", CLOSED_OPTION);	
			break;
		case 1:
			showMessageDialog(null, mensagem, "Status", ERROR_MESSAGE);
			break;
		}
		
	}

}

package questao4;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Sistema {

	public static void entrarSistema(String cpf, String email, String senha) {
		if(BaseDados.validarSenha(cpf))
			if(BaseDados.authenticador(cpf, email, senha))
				JOptionPane.showMessageDialog(null, "Usuário login realizado com sucesso!");
		JOptionPane.showMessageDialog(null, "Usuario não cadastrado!");
		
	}
	
}

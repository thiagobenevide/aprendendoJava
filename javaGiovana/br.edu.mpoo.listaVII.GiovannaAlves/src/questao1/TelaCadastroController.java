package questao1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroController implements ActionListener {

	TelaCadastrar telaCadastrar;
	
	public TelaCadastroController(TelaCadastrar telaCadastrar) {
		
		this.telaCadastrar = telaCadastrar;
		this.telaCadastrar.setVisible(true);
		control();
	}

	private void control() {
		telaCadastrar.getClienteRadioButton().addActionListener(this);
		telaCadastrar.getFuncioRadioButton().addActionListener(this);
		telaCadastrar.getAdicionarButton().addActionListener(this);
	}
	
	private void updateFuncionario() {
		telaCadastrar.getMatriculaLabel().setVisible(true);
		telaCadastrar.getMatriculaField().setVisible(true);
		telaCadastrar.getPropragandaCheckBox().setVisible(false);
	}
	
	private void updateCliente() {
		telaCadastrar.getMatriculaLabel().setVisible(false);
		telaCadastrar.getMatriculaField().setVisible(false);
		telaCadastrar.getPropragandaCheckBox().setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == telaCadastrar.getClienteRadioButton()) {
			updateCliente();
		}
		
		if (e.getSource() == telaCadastrar.getFuncioRadioButton()) {
			updateFuncionario();
		}
		
		if (e.getSource() == telaCadastrar.getAdicionarButton()) {
			
			try {
				if (telaCadastrar.getClienteRadioButton().isSelected()){
					if (telaCadastrar.getPropragandaCheckBox().isSelected()) {
						
						BaseDados.adicionarUsuario(new Cliente(telaCadastrar.getNomeField().getText(), telaCadastrar.getCpfField().getText(), 
						telaCadastrar.getFoneField().getText(), telaCadastrar.getEmailField().getText(), true));
						
						System.out.println("Check selected");
					}
					
					else {

						BaseDados.adicionarUsuario(new Cliente(telaCadastrar.getNomeField().getText(), telaCadastrar.getCpfField().getText(), 
						telaCadastrar.getFoneField().getText(), telaCadastrar.getEmailField().getText(), false));
						
						System.out.println("Check not selected");
					}
					
				}
				
				if (telaCadastrar.getFuncioRadioButton().isSelected()) {
					BaseDados.adicionarUsuario(new Funcionario(telaCadastrar.getNomeField().getText(), telaCadastrar.getCpfField().getText(),
					telaCadastrar.getFoneField().getText(), telaCadastrar.getEmailField().getText(), telaCadastrar.getMatriculaField().getText()));
					
					System.out.println("Funcionário");
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	}
	
}

package sistema_bancario;

import java.util.ArrayList;

public class Cliente extends Usuario{
	private ArrayList<Conta>contas;

	public Cliente(String cpf, String nome, String telefone, String email) {
		super(cpf, nome, telefone, email);
		this.contas = new ArrayList<Conta>();
		
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
	
	
	
	
	

	
	
	
}

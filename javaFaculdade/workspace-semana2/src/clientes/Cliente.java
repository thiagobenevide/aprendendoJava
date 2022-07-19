package clientes;
/*
 *A organização  de uma classe em java é dada pela sequinte forma
 *Classe
 *Atributos
 *Construtores
 *Métodos
 *Get e Set
 **/


public class Cliente {
	public String nome;
	public 
	
	private Telefone telefone;
	private Endereco endereco;
	private String email;
	private boolean aceitaReceberPromocao;
	private String sexo;
	
	
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAceitaReceberPromocao() {
		return aceitaReceberPromocao;
	}
	public void setAceitaReceberPromocao(boolean aceitaReceberPromocao) {
		this.aceitaReceberPromocao = aceitaReceberPromocao;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", email=" + email
				+ ", aceitaReceberPromocao=" + aceitaReceberPromocao + ", sexo=" + sexo + "]";
	}
	
	
}

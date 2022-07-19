package arrays2;

import java.util.ArrayList;

public class Cliente {

	private String cpf;
	private String telefone;
	private String nome;
	private String email;
	private ArrayList<Endereco> enderecos;
	private String sexo;
	
	public Cliente(String cpf, String telefone, String nome, String email, String sexo) {
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.enderecos = new ArrayList<>();
		this.sexo = sexo;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
	public String getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", telefone=" + telefone + ", nome=" + nome + ", email=" + email + ", enderecos="
				+ enderecos + ", sexo=" + sexo + "]";
	}
	
}

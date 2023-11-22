package questao5;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private ArrayList<Telefone>telefones;
	private Endereco endereco;
	
	
	public Usuario(String nome, String cpf, String email, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.telefones = new ArrayList<Telefone>();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}


	public void setTelefones(ArrayList<Telefone> telefones) {
		this.telefones = telefones;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getCpf() {
		return cpf;
	}
	
	
	
	
	
	
}

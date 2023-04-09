package model;

import java.util.Date;

public abstract class UsuarioAbstract {
	private String Nome;
	private  String Senha;
	private String cpf; 
	Date dataNascimento;
	
	public UsuarioAbstract(String nome, String senha, String cpf, Date dataNascimento) {
		Nome = nome;
		Senha = senha;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}

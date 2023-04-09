package model;

import java.util.Date;

public class UsuarioAbstract {
	private  String nome;
	private  String senha;
	private String cpf;
	private Date dataNascimento;

	public UsuarioAbstract(String nome, String senha, String cpf,
			Date dataNascimento) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
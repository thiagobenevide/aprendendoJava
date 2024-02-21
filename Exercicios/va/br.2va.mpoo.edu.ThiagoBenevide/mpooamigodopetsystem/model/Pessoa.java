package model;

public class Pessoa implements ValidadorCPFInteface{
	private String nome;
	private String cpf;
	private String email;
	private String fone;
	
	public Pessoa(String nome, String cpf, String email, String fone) throws CPFException{
		super();
		this.nome = nome;
		if(validarCPF(cpf)) {
			this.cpf = cpf;
		}else {
			throw new CPFException();//Lançando exception 
		}
		this.cpf = 
		this.email = email;
		this.fone = fone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	
	
}

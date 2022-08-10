package entidades;

import java.util.Date;

public abstract class Pessoa {
	
	public String nome;
	protected Telefone telefone; 
	private Endereco endereco;
	private Email email;
	private String sexo;
	private String cpf;
	private Date dataNascimento;//poderiamos ter usado Calendar
	private double voucher;

	public Pessoa(String nome, Telefone telefone, Endereco endereco,
			Email email, String sexo, String cpf, Date dataNascimento,
			double voucher) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.sexo = sexo;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.voucher = voucher;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

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



	public Email getEmail() {
		return email;
	}



	public void setEmail(Email email) {
		this.email = email;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public double getVoucher() {
		return voucher;
	}

	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone
				+ ", endereco=" + endereco + ", email=" + email + ", sexo="
				+ sexo + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ ", voucher=" + voucher + "]";
	}

	public static void metodo(){
		System.out.println("oi");
	} 
}


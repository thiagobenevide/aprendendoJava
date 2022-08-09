package sistema;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Telefone telefone;
	private Endereco endereco;
	private String sexo;
	private String cpf;
	private Date dataNascimento;
	private double voucher;
	
	
	public Pessoa(String nome, 
				Telefone telefone, 
				Endereco endereco, 
				String sexo, 
				String cpf, 
				Date dataNascimento,
				double voucher) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.sexo = sexo;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.voucher = voucher;
	}
	
	
	public String getNome() {
		return nome;
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
	
}

package model;

import java.util.Date;

public class PacienteModel extends Model{
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String telefone;
	private String dadosConsulta;
	private EnderecoModel enderecoModel;
	private FichaAtendimentoModel fichaAtendimentoModel;
	
	public PacienteModel(String nome, Date dataNascimento, String cpf, String telefone, String dadosConsulta,
			EnderecoModel enderecoModel, FichaAtendimentoModel fichaAtendimentoModel) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dadosConsulta = dadosConsulta;
		this.enderecoModel = enderecoModel;
		this.fichaAtendimentoModel = fichaAtendimentoModel;
	}

	public void consultar(String texto) {
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDadosConsulta() {
		return dadosConsulta;
	}

	public void setDadosConsulta(String dadosConsulta) {
		this.dadosConsulta = dadosConsulta;
	}

	public EnderecoModel getEnderecoModel() {
		return enderecoModel;
	}

	public void setEnderecoModel(EnderecoModel enderecoModel) {
		this.enderecoModel = enderecoModel;
	}

	public FichaAtendimentoModel getFichaAtendimentoModel() {
		return fichaAtendimentoModel;
	}

	public void setFichaAtendimentoModel(FichaAtendimentoModel fichaAtendimentoModel) {
		this.fichaAtendimentoModel = fichaAtendimentoModel;
	}
	
	
	
	
}

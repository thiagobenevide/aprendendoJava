package sistema.model;

public abstract class PessoaJuridica extends Pessoa{
	private String nomeFantasia;
	private String cnpj;
	private int franquia;
	private int numero;
	
	public PessoaJuridica(String nome, String nomeFantasia, String cnpj, int franquia, int numero) {
		super(nome);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.franquia = franquia;
		this.numero = numero;
	}
	

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getFranquia() {
		return franquia;
	}

	public void setFranquia(int franquia) {
		this.franquia = franquia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}

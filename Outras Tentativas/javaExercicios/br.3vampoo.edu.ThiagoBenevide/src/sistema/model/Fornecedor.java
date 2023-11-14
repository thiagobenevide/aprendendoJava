package sistema.model;

public class Fornecedor {
	private String cnpj;
	private String nomeFantasia;
	
	
	public Fornecedor(String cnpj, String nomeFantasia) {
		super();
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getNomeFantasia() {
		return nomeFantasia;
	}	
	
	
}

package sistema;

public class Endereco {
	private String logradouroString;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	
	
	public Endereco(String logradouroString, int numero, String bairro, String cidade, String cep) {
		this.logradouroString = logradouroString;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	
	
	public String getLogradouroString() {
		return logradouroString;
	}
	public void setLogradouroString(String logradouroString) {
		this.logradouroString = logradouroString;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}

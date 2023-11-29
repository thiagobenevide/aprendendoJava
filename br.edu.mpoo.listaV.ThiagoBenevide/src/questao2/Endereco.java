package questao2;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	
	private Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	


	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep, Cliente cliente) {
		if(logradouro!=null && logradouro.length()>0
				&& numero > 0 && bairro!=null && bairro.length()>0
				&& cidade!=null && cidade.length()>0
				&& estado!=null && estado.length()>0
				&& cep!=null && cep.length()>0
				&& cliente!=null 
				)
				cliente.getEnderecos().add(new Endereco(logradouro, numero, bairro, cidade, estado, cep));
	}




	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	
}

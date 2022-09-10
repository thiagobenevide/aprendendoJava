package questao3;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep, Cliente cliente) {
		super();
		if (isEndereco(logradouro, numero, bairro,cidade,estado,cep,cliente) == true) {
			cliente.getEnderecos().add(new Endereco(logradouro, numero, bairro,cidade,estado,cep));
		}
		
	}
	
	private static boolean isEndereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep, Cliente cliente) {
		for(Endereco enderecoCurrent : cliente.getEnderecos()) {
			if(enderecoCurrent.getLogradouro().equalsIgnoreCase(logradouro) && enderecoCurrent.getNumero()==numero 
					&& enderecoCurrent.getBairro().equalsIgnoreCase(bairro) && enderecoCurrent.getCidade().equalsIgnoreCase(cidade)
					&& enderecoCurrent.getEstado().equalsIgnoreCase(estado) && enderecoCurrent.getCep().equalsIgnoreCase(cep)
					) {
				return false;
				
			}
		}
		return true;
	}
	

	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
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

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + ", cep=" + cep + "]";
	}
	
	
}

package questao2;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep, Cliente cliente) {
		super();
		if (isEndereco(logradouro, numero, bairro,cidade,estado,cep,cliente)) {
			cliente.getEnderecos().add(new Endereco(logradouro, numero, bairro,cidade,estado,cep,cliente));
		}
		
	}
	
	private static boolean isEndereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep, Cliente cliente) {
		for(Endereco enderecoCurrent : cliente.getEnderecos()) {
			if(enderecoCurrent.getLogradouro().equalsIgnoreCase(logradouro) && enderecoCurrent.getNumero()==numero && enderecoCurrent.getBairro().equalsIgnoreCase(bairro) 
				&& enderecoCurrent.getCidade().equalsIgnoreCase(cidade)	&& enderecoCurrent.getEstado().equalsIgnoreCase(estado) && enderecoCurrent.getCep().equalsIgnoreCase(cep)
					) {
				return true;
				
			}
		}
		return false;
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

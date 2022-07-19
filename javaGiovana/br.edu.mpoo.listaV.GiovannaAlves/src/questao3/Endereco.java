package questao3;

public class Endereco {

	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco (String logradouro, int numero, String bairro, String cidade, String estado, String cep, Cliente cliente) {
		if (isEndereco(logradouro, numero, bairro, cidade, estado, cep, cliente) == true) {
			cliente.getEndereco().add(new Endereco(logradouro, numero, bairro, cidade, estado, cep));
			if (BaseDadosEnderecos.isEndereco(new Endereco(logradouro, numero, bairro, cidade, estado, cep))== false){
				BaseDadosEnderecos.adicionarEndereco(new Endereco(logradouro, numero, bairro, cidade, estado, cep));
			}
		}
	}
	
	private boolean isEndereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep, Cliente cliente) {
		for (Endereco enderecoCurrent : cliente.getEndereco()) {
			if (enderecoCurrent.getLogradouro().equals(logradouro) && enderecoCurrent.getNumero() == numero
					&& enderecoCurrent.getBairro().equals(bairro) && enderecoCurrent.getCidade().equals(cidade)
					&& enderecoCurrent.getEstado().equals(estado) && enderecoCurrent.getCep().equals(cep)) {
					return false;
			}
		}
		return true;
	}
	
	private Endereco (String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		
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

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + ", cep=" + cep + "]";
	}

}

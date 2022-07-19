package arrays3;

public class Endereco {

	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco(Cliente cliente) {}

	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep, Cliente cliente) {
		cliente.getEndereco().logradouro = logradouro;
		cliente.getEndereco().numero = numero;
		cliente.getEndereco().bairro = bairro;
		cliente.getEndereco().cidade = cidade;
		cliente.getEndereco().estado = estado;
		cliente.getEndereco().cep = cep;
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

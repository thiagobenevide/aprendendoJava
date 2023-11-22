package questao6;

public class Funcionario {
	private String nome;
	private String cpf;
	private String matricula;
	
	
	
	public Funcionario(String nome, String cpf, String matricula) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
	}
	
	


	public double darDesconto(Produto produto) {
		
	}
	
	
	public void refistrarCompra(Produto produto, Boolean isDesconto) {
		
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	
	
	
}

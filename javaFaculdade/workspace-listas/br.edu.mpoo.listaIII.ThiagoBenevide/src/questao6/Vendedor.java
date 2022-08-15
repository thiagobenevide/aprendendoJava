package questao6;

public class Vendedor {

	private int matricula;
	private String funcao;
	private long rg;
	private String senha;
	
	
	
	public Vendedor(int matricula, String funcao, long rg, String senha) {
		super();
		this.matricula = matricula;
		this.funcao = funcao;
		this.rg = rg;
		this.senha = senha;
	}
	
	
	
	public Compra realizarVenda(Cliente cliente, Descricao descricao) {
		Compra compraFinal = new Compra(cliente, descricao);
		return compraFinal;
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}

package questao6_1;

public class Funcionario extends Gerente {

	private String matricula;
	private int rg;
	private String nome;
	private String funcao;
	private String senha;
	
	public Funcionario(String matricula, int rG, String nome, String funcao, String senha) {
		this.matricula = matricula;
		rg = rG;
		this.nome = nome;
		this.funcao = funcao;
		this.senha = senha;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}

package questao2;

public class Vendedor extends Funcionario{
	private double totalComissao;
	
	public Vendedor(String cpf, String login) {
		super(cpf, login);
		// TODO Auto-generated constructor stub
	}




	@Override
	public void calcularSalario() {
		setSalario(getSalariobase()+totalComissao);
	}


	public double getTotalComissao() {
		return totalComissao;
	}


	public void setTotalComissao(double totalComissao) {
		this.totalComissao = totalComissao;
	}


	
	
	@Override
	public String toString() {
		return "Vendedor [totalComissao=" + totalComissao + ", toString()=" + super.toString() + "]";
	}


	
	
	

}

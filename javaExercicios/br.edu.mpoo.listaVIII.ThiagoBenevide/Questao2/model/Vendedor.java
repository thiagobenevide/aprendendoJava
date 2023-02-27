package model;

public class Vendedor extends Funcionario {
	private double totalComissao;
	private double salario = 1600;
	public Vendedor(String cpf, String login) {
		super(cpf, login);
		
		// TODO Auto-generated constructor stub
	}


	public double getTotalComissao() {
		return totalComissao;
	}

	public void setTotalComissao(double totalComissao) {
		this.totalComissao = totalComissao;
	}
	
	public double getSalario() {
		return salario;
	}


	@Override
	public String toString() {
		return "Vendedor [getTotalComissao()=" + getTotalComissao() + ", getSalario()=" + getSalario() + ","
				+ super.toString() + "]";
	}


	




	
	
}

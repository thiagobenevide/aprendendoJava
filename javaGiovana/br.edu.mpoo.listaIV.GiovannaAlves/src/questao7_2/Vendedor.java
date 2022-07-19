package questao7_2;

public class Vendedor extends Funcionario{
	private double totalComissao;

	public Vendedor(String cpf, String login) {
		super(cpf, login);
	}
	
	@Override
	public void calcularSalario() {
		super.calcularSalario();
		this.setSalario(this.getSalarioBase() + this.getTotalVendas());
	}

	public double getTotalVendas() {
		return totalComissao;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalComissao = totalVendas;
	}

	@Override
	public String toString() {
		return "Vendedor [totalVendas=" + totalComissao + ", Cpf=" + getCpf() + ", Login=" + getLogin() + ", Salario=" + getSalario() + "]";
	}


	
}
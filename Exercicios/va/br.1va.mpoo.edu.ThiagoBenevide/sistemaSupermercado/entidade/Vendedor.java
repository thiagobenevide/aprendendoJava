package entidade;

public class Vendedor extends Funcionario{
	public final double COMISSAO = 0.05;
	private double totalComissao;
	private String codVendedor;
	
	public Vendedor(String nome, String cpf) {
		super(nome, cpf);
		calcularSalario();
		// TODO Auto-generated constructor stub
	}
	public Vendedor(String nome, String cpf, String codVendedor) {
		super(nome, cpf);
		this.codVendedor = codVendedor;
		calcularSalario();
	}
	@Override
	public void calcularSalario() {
		setSalario(SALARIO_MINIMO + totalComissao);
	}
	
	public double getTotalComissao() {
		return totalComissao;
	}
	public void setTotalComissao(double totalComissao) {
		this.totalComissao = totalComissao;
	}
	public String getCodVendedor() {
		return codVendedor;
	}
	public void setCodVendedor(String codVendedor) {
		this.codVendedor = codVendedor;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
	
}

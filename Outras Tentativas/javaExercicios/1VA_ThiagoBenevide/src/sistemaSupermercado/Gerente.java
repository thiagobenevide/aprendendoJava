package sistemaSupermercado;

public class Gerente extends Funcionario{
	
	private static final double SALARIO = 3200.5;
	
	private Gerente(String nome, String cpf) {
		super(nome,cpf);
	}
	

	public Gerente(Supermercado supermercado, String nome, String cpf) {
		super(supermercado, nome, cpf);
		supermercado.setGerente(new Gerente(nome,cpf));
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		
	}

	public double getSalario() {
		return SALARIO;
	}
	
	
	
}

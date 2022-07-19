package questao3;

public class Horista extends Empregado {

	private double precoHora;
	private double horasTrabalhadas;
	
	public Horista(String nome, String cpf, double precoHora, double horasTrabalhadas) {
		super(nome, cpf);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public double calcularPagamento() {
		setSalario(precoHora*horasTrabalhadas);
		return getSalario();
	}
	@Override
	public String toString() {
		return "Horista [precoHora=" + precoHora + ", horasTrabalhadas=" + horasTrabalhadas + ", toString()="
				+ super.toString() + "]";
	}
	
}

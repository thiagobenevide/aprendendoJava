package sistemaPetShop;

import java.util.Date;

public class Atendimento {

	private int numero;
	private Date dataAtendimento;
	private Animal cliente;
	private Veterinario veterinario;
	private double valorConsulta;
	private String receitaAnimal;
	
	public Atendimento(int numero, Date dataAtendimento, Animal cliente, Veterinario veterinario, double valorConsulta,
			String receitaAnimal) {
		this.numero = numero;
		this.dataAtendimento = dataAtendimento;
		this.cliente = cliente;
		this.veterinario = veterinario;
		this.valorConsulta = valorConsulta;
		this.receitaAnimal = receitaAnimal;
	}
	
	public void realizarAtendimento(Animal animal, Veterinario veterinario) {
		if (animal.getEstado().equalsIgnoreCase("desnutricao")) {
			System.out.println(veterinario.receitarAnimal(animal));
		}
		else {
			System.out.println("Esse animal está saudavel");
		}
	}

	public int getNumero() {
		return numero;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public Animal getCliente() {
		return cliente;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public String getReceitaAnimal() {
		return receitaAnimal;
	}

	@Override
	public String toString() {
		return "Atendimento [numero=" + numero + ", dataAtendimento=" + dataAtendimento + ", cliente=" + cliente
				+ ", valorConsulta=" + valorConsulta + ", receitaAnimal=" + receitaAnimal + "]";
	}
	
}

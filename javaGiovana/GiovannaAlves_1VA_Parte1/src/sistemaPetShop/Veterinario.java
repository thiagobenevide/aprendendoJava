package sistemaPetShop;

public class Veterinario extends Pessoa {

	private int crmv;
	
	public Veterinario(String nome, String cpf, String fone, int crmv) {
		super(nome, cpf, fone);
		this.crmv = crmv;
		BaseDados.getVeterinarios().add(this);
	}

	public String receitarAnimal(Animal animal) {
		return animal.informacaoAlimentacao();
	}
	
	public int getCrmv() {
		return crmv;
	}



	@Override
	public String toString() {
		return "Veterinario [crmv=" + crmv + "]";
	}
	
	
}

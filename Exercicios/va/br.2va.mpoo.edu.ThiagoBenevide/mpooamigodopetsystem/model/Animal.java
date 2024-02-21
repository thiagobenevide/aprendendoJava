package model;

public class Animal implements AlimentacaoIPetInterface{
	private String id;
	private String tipo;
	private String nome;
	private String raca;
	private int idade;
	private double peso;
	
	public Animal(String id, String tipo, String nome, String raca, int idade, double peso) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	
	@Override
	public String informacaoAlimentacao() {
		String info="Alimentacao do seu Pet (peso:" + this.peso + "):  \t";
		int opcao=0;
		if ((int)this.getPeso()>=1 && (int)this.getPeso()<3)
			opcao=1;
		else if ((int)this.getPeso()>=3 && (int)this.getPeso()<5)
			opcao=2;
		else if ((int)this.getPeso()>=5 && (int)this.getPeso()<8)
			opcao=3;
		else if ((int)this.getPeso()>=8 && (int)this.getPeso()<10)
			opcao=4;
		else if ((int)this.getPeso()>=10 && (int)this.getPeso()<15)
			opcao=5;
		else if ((int)this.getPeso()>=15 && (int)this.getPeso()<25)
			opcao=6;
		else if ((int)this.getPeso()>=25 && (int)this.getPeso()<45)
			opcao=7;
		else if ((int)this.getPeso()>=45 && (int)this.getPeso()<70)
			opcao=8;
			
		switch (opcao) {
		case 1:
			info+="35h - 70g de ra��o/dia";
			break;
		case 2:
			info+="70h - 100g de ra��o/dia";
			break;
		case 3:
			info+="100g - 140g de ra��o/dia";
			break;
		case 4:
			info+="140g - 160g de ra��o/dia";
			break;
		case 5:
			info+="160g - 210g de ra��o/dia";
			break;
		case 6:
			info+="210g - 300g de ra��o/dia";
			break;
		case 7:
			info+="300g - 450g de ra��o/dia";
			break;
		case 8:
			info+="450g - 600g de ra��o/dia";
			break;
		}
		return info;
	}

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getId() {
		return id;
	}

	
	
	
	
}

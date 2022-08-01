package aula08;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
		
	}
	
	public void apresentar() {
		System.out.println("Lutador: "+this.getNome());
		System.out.println("Origem: "+ this.getNacionalidade());
		System.out.println(this.getIdade()+" anos");
		System.out.println(this.getAltura()+" metros de altura");
		System.out.println("Ganhou: "+this.getVitorias()+" vezes");
		System.out.println("Perdeu: "+this.getDerrotas()+" vezes");
		System.out.println("Empatou: "+this.getEmpates()+" vezes");
	}
	
	public void status() {
		System.out.println(this.getNome());
		System.out.println("Peso: "+this.getCategoria());
		System.out.println("Vitórias: "+this.getVitorias());
		System.out.println("Derrotas: "+this.getDerrotas());
		System.out.println("Empates: "+this.getEmpates());
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	
	//Gets and Sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso(){
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		if(this.getPeso()<52.2) {
			this.categoria = "Inválido";
		}else if(this.getPeso()<=70.3) {
			this.categoria = "Leve";
		}else if(this.getPeso()<83.9) {
			this.categoria = "Médio";
		}else if(this.getPeso()<=120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}

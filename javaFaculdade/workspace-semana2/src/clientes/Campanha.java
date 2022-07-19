package clientes;

public class Campanha {
	private String nome;
	private int ano;
	private int numero;
	
	public Campanha(String nome, int ano, int numero) {
		this.nome = nome;
		this.ano = ano;
		this.numero = numero;
	}
	
	public Produto indicarProduto(Cliente cliente) {
		if(cliente.getSexo().equalsIgnoreCase("masculino")) {
			
		}
		if(cliente.getSexo().equalsIgnoreCase("feminino")) {
			
		}
		else {
			JOptionPane.showMenssgeDialog(null,Mensagem.exibirMensagem());
			return null;
		}
	}
}

package entidades;

public class AnivesarioCliente entends Campanha {
	
	
	public AniversarioCliente(String nome, int ano, int numero) {
		super(nome, ano, numero);
	}
	
	
	@Override
	
	public Produto indicarProduto(Cliente cliente) {
	//Dia se tiver definino a data do tipo date
		
		if (cliente.getDataNascimento().getDate()==LocalDateTime.now().getDayOfMonth()
				&&
				cliente.getDataNascimento().getMonth=LocalDateTime.now().getMonthValue()) {
			
			if (cliente.isAceitaReceberPromocao())
				if (cliente.getSexo().equalsIgnoreClass("masculino")) {
					//Precismos recuperar em uma base
					return new Produto("Creme Barbear", 50.00, 50.00-cliente.getVoucher(),"CD003")
				}
		}
		
	}
	
	public void definirVoucher() {
		//Como ela saberá quem são os clientes
		//O conteito de base de dados
		//Analisando Herança: Onde vamos usar o conceito de herança?
		//Vamos precisar tratar cliente como pessoa
	}
}

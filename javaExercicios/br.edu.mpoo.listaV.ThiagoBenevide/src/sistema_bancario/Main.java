package sistema_bancario;

public class Main {

	public static void main(String[] args) {
		BaseDados.createBase();
		
		Cliente c1 = new Cliente("13077735407", "Thiago", "+5587999026780", "thiagobenevide@live.com");
		new Conta(c1, 1598, 336, 200, "thiago");
		
		
		BaseDados.adicionarCliente(c1);
		
		Banco b1 = new Banco("Nubank");
		
		System.out.println(b1.depositar(500, c1.getContas().get(0)));
		System.out.println(c1.getContas().get(0).getSaldo());
		
		
		
	}

}

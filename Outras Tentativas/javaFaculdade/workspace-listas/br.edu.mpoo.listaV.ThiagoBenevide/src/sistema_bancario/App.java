package sistema_bancario;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDados.createBase();
		
		Cliente c1 = new Cliente("13077735407","Thiago Benevide", "87999026780", "thiagobenevide@live.com");
		new Conta(01,5445,50,"159287", c1);
		new Conta(02,0255,100,"558844", c1);
		
		BaseDados.adicionarCliente(c1);
		
		Banco.depositar(1000, c1.getContas().get(0));
		System.out.println(c1.getContas().get(0).getSaldo());
		
	}

}

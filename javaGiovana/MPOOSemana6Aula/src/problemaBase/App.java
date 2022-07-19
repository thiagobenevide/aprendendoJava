package problemaBase;

public class App {

	public static void main(String[] args) {
		
		
		GerenteInterface gerente = new GerenteClass();
		CaixaInterface caixa = new CaixaClass();
		
		gerente.darDesconto();
		
		caixa.vender();
		
		System.out.println(gerente instanceof FuncionarioAbstract);
	}

}

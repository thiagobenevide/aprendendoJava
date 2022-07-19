package questao3;

public class App {

	public static void main(String[] args) {
		
		Horista horista = new Horista("Giovanna", "000.000.000-00", 40, 160);
		Comissionado comissionado = new Comissionado("David", "111.111.111-11", 60000, 0.05);
		
		horista.calcularPagamento();
		comissionado.calcularPagamento();
		
		System.out.println(horista);
		System.out.println(comissionado);
	}

}

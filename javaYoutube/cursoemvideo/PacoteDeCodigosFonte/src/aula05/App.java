package aula05;

public class App {
	
	public static void main(String[] Args) {
		ContaBanco cliente1 = new ContaBanco(001, "cp", "Thiago Benevide");
		cliente1.abrirConta(cliente1.getTipo());
		cliente1.depositar(500);
		cliente1.pagarMensal();
		System.out.println(cliente1.toString());
		cliente1.depositar(900);
		double saque1 = cliente1.sacar(1500);
		System.out.println(cliente1.toString());
		System.out.println("Você sacou R$"+saque1);
		double saque2 = cliente1.sacar(1000);
		System.out.println("Você sacou R$"+saque2);
		System.out.println(cliente1.toString());
	}
}

package questao6_1;

public class App {
	public static void main(String[] args) {
		Campanha campanhaDivulgacao = new Divulgacao();
		Campanha campanhaVerao = new Verao();
		
		BaseDados.Base();
		
		BaseDados.campanhas.add(campanhaDivulgacao);
		BaseDados.campanhas.add(campanhaVerao);
		
		System.out.println(BaseDados.campanhas.get(0));
		System.out.println(BaseDados.campanhas.get(1));
	}
}
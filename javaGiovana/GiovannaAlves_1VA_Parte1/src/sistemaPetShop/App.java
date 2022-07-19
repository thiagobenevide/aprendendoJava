package sistemaPetShop;

public class App {

	public static void main(String[] args) {
		BaseDados.createBaseDados();
		
		System.out.println(BaseDados.getProprietarios());
		System.out.println(Proprietario.getDadosBase());
		
		Atendimento atendimento = new Atendimento(1, null, Proprietario.getAnimais().get(0), BaseDados.getVeterinarios().get(0), 10, "desnutricao");
		
		atendimento.realizarAtendimento(Proprietario.getAnimais().get(0), BaseDados.getVeterinarios().get(0));
	}

}

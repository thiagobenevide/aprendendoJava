package questao1;

public class App {
	public static void main(String[] args) {	
		BaseDados.createBase();
		
		try {
			BaseDados.adicionarCliente(new Cliente("Lucas","10824050436"));
		} catch (ClienteException e) {
			// TODO Auto-generated catch block
			Mensagem.exibirMensagem(e.getMessage());;
		} catch (CPFException e) {
			// TODO Auto-generated catch block
			Mensagem.exibirMensagem(e.getMessage());
		}
		
		
		try {
			BaseDados.adicionarCliente(new Cliente("José", "11124539788"));
		} catch (ClienteException e) {
			// TODO Auto-generated catch block
			Mensagem.exibirMensagem(e.getMessage());;
		} catch (CPFException e) {
			// TODO Auto-generated catch block
			Mensagem.exibirMensagem(e.getMessage());;
		}
		
		
		
		
	}
	
	
	
}

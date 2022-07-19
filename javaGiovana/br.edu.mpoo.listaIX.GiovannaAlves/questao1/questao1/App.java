package questao1;

public class App {

	public static void main(String[] args) {
		
		BaseDados.createBase();
		
		try {
			BaseDados.adicionarCliente(new Cliente("Giovanna","08102349476"));
		} catch (ClienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Mensagem.exibirMensagem(e.getMessage());
		} catch (CPFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Mensagem.exibirMensagem(e.getMessage());
		}
		try {
			BaseDados.adicionarCliente(new Cliente("Zé","11124539788"));
		} catch (ClienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Mensagem.exibirMensagem(e.getMessage());
		} catch (CPFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Mensagem.exibirMensagem(e.getMessage());
		}
		
		Cliente cliente;
		cliente = null;
		try {
			BaseDados.adicionarCliente(cliente);
		} catch (ClienteException | CPFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Mensagem.exibirMensagem(e.getMessage());
		}
	}
}

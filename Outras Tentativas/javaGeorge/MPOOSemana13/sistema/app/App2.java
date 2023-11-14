package app;

import view.Mensagem;
import model.BaseDados;
import model.MalaDiretaParabens2;

public class App2 extends Thread{
//	MalaDiretaParabens2 malaDiretaParabens2 = new MalaDiretaParabens2();
	public void run(){
		try {
			BaseDados.createBase();
			/* Problem�tica:
			 * Se main tivesse outro "new App2().start();"
			 * O que aconteceria com cupom de desconto de um cliente?  
			 *	  Dado: MalaDiretaParabens2 - linhas 14 a 17
			 *
			 * Poss�vel solu��o: 
			 *   - Como arantir que apenas 1 inst�ncia aconte�a?
			 *	 (Design Pattern: Singleton)
			 */
			while (true){
				MalaDiretaParabens2.darCupom();
				sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			/*Possibilidades de tratamento de Exce��o:
			 * - salvar arquivo
			 * - mandar um sms para o adm
			 * - salvar em arquivo um texto para outro programa mandar sms
			 */
			Mensagem.exibirMensagem(Mensagem.MENSAGEM_BUG);
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new App2().start();
	}
}
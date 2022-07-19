package questao5_2;

public class UsandoExcecao_2 {

	public static void main(String[] args) {
		
		 try{
		 levantarExcecao();
		 }
		 catch (Exception exception){
		 System.err.println("Exce��o capturada e tratada no main");
		 }
		 naoLevantarExececao();
		 }
		public static void levantarExcecao() throws Exception{
			 try{
			 System.out.println("M�todo levantarExcecao:");
			 throw new Exception();
			 }
			 catch (Exception exception){
			 System.err.println("Exce��o capturada no pr�prio m�todo levantarExcecao");
			 throw exception;
			
			 // No m�todo levantarExcecao, como tem uma exce��o dentro do finally (que ser� sempre executado, independente de qualquer coisa), essa 
			 // exce��o vai substituir a do catch, ent�o, a exce��o que est� sendo executada � a do finally, dessa forma, iria gerar um erro de programa��o.
			 
			 }
			 finally{
				 System.out.println("Sempre executado");
				 throw new Exception();
			 }
		}
		
		public static void naoLevantarExececao(){
		 try {
		 System.out.println("M�todo que n�o levanta exce��o");
		 }
		 catch (Exception exception){
		 System.err.println(exception);
		 }
		 System.out.println("Fim do m�todo n�oLevantarExce��o");
	}
}

package questao5_3;

public class UsandoExcecao_3 {

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
			 }
			
			// A diferen�a � que na quest�o anterior, a exce��o do finally est� substituindo a do catch, j� nessa atual, a exce��o do cacth anterior ao finally 
			// � capturada e tratada. 
			 
			finally{
				System.out.println("Sempre executado");
			 
				try{
					throw new Exception();
				 }
				 
				 catch (Exception exception){
					 System.err.println("Exce��o capturada");
				 }
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

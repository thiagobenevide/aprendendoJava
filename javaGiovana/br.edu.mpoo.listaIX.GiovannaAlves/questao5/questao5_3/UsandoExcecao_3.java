package questao5_3;

public class UsandoExcecao_3 {

	public static void main(String[] args) {
		
		 try{
		 levantarExcecao();
		 }
		 catch (Exception exception){
		 System.err.println("Exceção capturada e tratada no main");
		 }
		 naoLevantarExececao();
		 }
		public static void levantarExcecao() throws Exception{
			 
			try{
				 System.out.println("Método levantarExcecao:");
				 throw new Exception();
			 }
			
			catch (Exception exception){
				 System.err.println("Exceção capturada no próprio método levantarExcecao");
				 throw exception;
			 }
			
			// A diferença é que na questão anterior, a exceção do finally está substituindo a do catch, já nessa atual, a exceção do cacth anterior ao finally 
			// é capturada e tratada. 
			 
			finally{
				System.out.println("Sempre executado");
			 
				try{
					throw new Exception();
				 }
				 
				 catch (Exception exception){
					 System.err.println("Exceção capturada");
				 }
			 }
		}
		
		public static void naoLevantarExececao(){
		 
		 try {
			 System.out.println("Método que não levanta exceção");
		 }
		 
		 catch (Exception exception){
			 System.err.println(exception);
		 }
		 System.out.println("Fim do método nãoLevantarExceção");
	}
}

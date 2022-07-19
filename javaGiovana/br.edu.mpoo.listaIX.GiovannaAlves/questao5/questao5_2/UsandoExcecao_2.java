package questao5_2;

public class UsandoExcecao_2 {

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
			
			 // No método levantarExcecao, como tem uma exceção dentro do finally (que será sempre executado, independente de qualquer coisa), essa 
			 // exceção vai substituir a do catch, então, a exceção que está sendo executada é a do finally, dessa forma, iria gerar um erro de programação.
			 
			 }
			 finally{
				 System.out.println("Sempre executado");
				 throw new Exception();
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

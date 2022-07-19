package questao5_1;

public class UsandoExcecao {

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
			 throw exception; // AQUI ESTÁ ACONTECENDO O RELANÇAMENTO DA EXCEÇÃO, O CATCH ESTÁ RELANÇANDO A "EXCEPTION" PARA QUE O MAIN FAÇA O TRATAMENTO DA MESMA.
			 
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

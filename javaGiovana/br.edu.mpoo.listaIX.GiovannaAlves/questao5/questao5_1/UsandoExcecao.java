package questao5_1;

public class UsandoExcecao {

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
			 throw exception; // AQUI EST� ACONTECENDO O RELAN�AMENTO DA EXCE��O, O CATCH EST� RELAN�ANDO A "EXCEPTION" PARA QUE O MAIN FA�A O TRATAMENTO DA MESMA.
			 
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

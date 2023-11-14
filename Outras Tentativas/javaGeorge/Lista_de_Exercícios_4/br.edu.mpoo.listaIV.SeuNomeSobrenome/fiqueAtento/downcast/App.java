package downcast;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
//Exemplo de herança simples:
		SubClasse subClasse = new SubClasse();
		System.out.println(subClasse.getAtr_SuperClasse());
		System.out.println(subClasse.getAtr_SubClasse());

/*
* Questionamento: e se subClasse fosse do tipo SuperClasse? como acessar o atr_SubClasse?
* Solução: Usar downcast.
*/
		SuperClasse subClasse2 = new SubClasse();
		System.out.println(subClasse2.getAtr_SuperClasse());
		System.out.println(((SubClasse)subClasse2).getAtr_SubClasse());//solução
	}
}
package exemplo1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		//Usando ArrayList
		
		ArrayList<SuperClasse> superClasses = new ArrayList<SuperClasse>();
		superClasses.add(new SuperClasse());
		superClasses.add(new Subclasse());
		
		//Usando foreach e instanceof
		
		int cont = 0;
		
		for(SuperClasse superClasseCurrent: superClasses) {
			System.out.println("Element: [" + cont + "]");
			if(superClasseCurrent instanceof SuperClasse) {
				System.out.println(superClasseCurrent.getAtr_SuperClasse());
			}
			if(superClasseCurrent instanceof Subclasse) {
				System.out.println(((Subclasse)superClasseCurrent).getAtr_SubClasse());
			}
			cont++;
		}
		
		//Usando vinculação dinâmica com toString();
		
		cont = 0;
		
		for(SuperClasse superClasseCurrent: superClasses) {
			System.out.println("Element: [" + cont + "]");
			System.out.println(superClasseCurrent.toString());
			cont++;
		}
		
	}
	
}

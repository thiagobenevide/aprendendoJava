
public interface Interface {
	
	// PODE CONTER CONSTANTES E COMPORTAMENTOS (ABSTRATOS OU CONCRETOS/STATICOS)
	
	final int CONSTANTE=1;
	
	// abstract é opcional 
	
	public abstract void metodoAbstract();
	
	public default void metodoDefault() {
		//precisa ter corpo!
	}
	
	

}

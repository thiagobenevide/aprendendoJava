package entidades;

public class Email {
	private String email;

	public Email(String email) { //throws EmailError{
		if (validarEmail(email))
			this.email = email;
		//else{cenas dos pr�ximos cap�tulos} 
	}
	
	private boolean validarEmail(String email){
		//Questionamento: Pesquisar logica de valida��o de email?
		return true;
	}
	
//	public static boolean validarEmail(String email){
//		//Questionamento: Pesquisar logica de valida��o de email?
//		return true;
//	}
}
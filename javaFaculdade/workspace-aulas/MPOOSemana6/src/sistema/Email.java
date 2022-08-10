package sistema;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	private String email;
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
	
	public Email(String email) {
		if (isValidarEmail(email)) {
			this.email = email;			
		}
	}
	
	private static boolean isValidarEmail(String email) {
		//Qual é a lógica para validação de email em java
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

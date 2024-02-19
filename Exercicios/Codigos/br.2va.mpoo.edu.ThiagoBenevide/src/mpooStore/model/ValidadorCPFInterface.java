package mpooStore.model;

import java.util.InputMismatchException;

public interface ValidadorCPFInterface {
	public final String CPF_INVALIDO = "CPF informado é inválido";
	
	public abstract boolean isCPF(String CPF);	
}

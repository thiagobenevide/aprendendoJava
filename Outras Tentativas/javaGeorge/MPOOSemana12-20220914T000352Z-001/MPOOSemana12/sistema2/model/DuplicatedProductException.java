package model;

//Defini��o de Exce��o para cadastro de produto existente

public class DuplicatedProductException extends Exception{
	public DuplicatedProductException(String mensagem){
		super(mensagem);
	}
}

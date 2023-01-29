package model;

import java.util.InputMismatchException;

public class Validador {
	private static final String CPF_INVALIDO = "CPF Inválido!";
	public static boolean validarCPF(String cpf)throws CPFException {
		if(cpf.equals("00000000000")|| cpf.equals("11111111111")||cpf.equals("22222222222")||cpf.equals("33333333333")||cpf.equals("44444444444")||
		cpf.equals("55555555555")||cpf.equals("66666666666")||cpf.equals("77777777777")||cpf.equals("88888888888")||cpf.equals("99999999999")||(cpf.length()!=11)) 
		throw new CPFException(CPF_INVALIDO);
		
		char dig10, dig11;
		int soma, i, resultado, num, peso;
		/*Validar o digito 10*/
		try {
			soma = 0;
			peso = 10;
			
			for(i=0; i<9;i++) {
				num = (int)(cpf.charAt(i)-48);
				soma = soma + (num*peso);
				peso = peso-1;
			}
			resultado = 11 - (soma%11);
			if((resultado==10)|| (resultado==11)) {
				dig10 = '0';
			}else {
				dig10 = (char)(resultado+48);
			}
		/*Validar o digito 11*/
			soma = 0;
			peso = 11;
			for(i=0;i<10;i++) {
				num = (int)(cpf.charAt(i)-48);
				soma = soma + (num*peso);
				peso = peso - 1;
			}
			resultado = 11 - (soma%11);
			if((resultado==10)||(resultado==11)) {
				dig11 = '0';
			}else {
				dig11 = (char)(resultado+48);
			}
			
			if((dig10==cpf.charAt(9)&&(dig11==cpf.charAt(10)))) {
				return true;
			}else {
				throw new CPFException(CPF_INVALIDO);
			}
			
		}catch(InputMismatchException erro) {
			return false;
		}
		/**/
		
		
		
	}
	
	
	
	
}

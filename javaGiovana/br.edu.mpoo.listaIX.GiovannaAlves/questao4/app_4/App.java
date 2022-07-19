package app_4;

import model_4.Banco;
import model_4.BaseDados;
import model_4.Cliente;
import model_4.Conta;
import model_4.ContaException;
import model_4.NullUsuarioExpection;
import model_4.OperacaoException;
import model_4.Usuario;

public class App {

	public static void main(String[] args) {
	
		
		Cliente cliente1 = new Cliente("111.111.111-11", "José");
		Cliente cliente2 = new Cliente("222.222.222-22", "Maria");
		
		new Conta(1, 1, 0.0, "123", cliente1);
		
		new Conta(2, 2, 100.0, "jose123", cliente1);
		
		new Conta(1, 3, 1000.0, "Maria222", cliente2);	

		
		try {		

			BaseDados.addUsuario(cliente1);
			BaseDados.addUsuario(cliente2);
			
			
			Cliente userTemp2 = (Cliente) BaseDados.buscarUsuario((Usuario)cliente2);
			Cliente userTemp1 = (Cliente) BaseDados.buscarUsuario((Usuario)cliente1);

			
			Banco.transferir(100, userTemp2.getContas().get(0), userTemp1.getContas().get(0));
		
		} catch (ContaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperacaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullUsuarioExpection e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			// UMA EXCEÇÃO É LEVANTADA AO TENTAR DEPOSITAR EM UMA CONTA QUE NÃO EXISTE
			Banco.depositar(10, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Banco.sacar(100, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			//UMA EXCEÇÃO É LEVANTADA AO TENTAR VALIDAR CONTA ORIGEM E DESTINO INVÁLIDAS
			
			Banco.validarContaDestino(null);
			Banco.validarContaOrigem(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			// UMA EXCEÇÃO É LEVANTADA AO TENTAR EFETUAR UMA TRANSFERENCIA DE VALOR MAIOR DO QUE O SALDO DA CONTA
			Cliente userTemp2 = (Cliente) BaseDados.buscarUsuario((Usuario)cliente2);
			Cliente userTemp1 = (Cliente) BaseDados.buscarUsuario((Usuario)cliente1);
			Banco.transferir(200, userTemp1.getContas().get(0), userTemp2.getContas().get(0));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			// UMA EXCEÇÃO É LEVANTADA AO TENTAR SABER SE O CLIENTE EXISTE NA BASE, PORÉM, O CLIENTE NÃO EXISTE NA BASE
			BaseDados.existeUsuario(new Cliente(null, null));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			// UMA EXCEÇÃO É LEVANTADA AO TENTAR REMOVER UM USUÁRIO QUE NÃO ESTÁ NA BASE DE DADOS
			BaseDados.removerUsuario(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			//UMA EXCEÇÃO É LEVANTADA AO TENTAR ADICIONAR UM USUÁRIO QUE JÁ EXISTE NA BASE
			BaseDados.addUsuario(cliente1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

package questao4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BaseDados {
	private static ArrayList<Pessoa>pessoas;
	
	public static void createBase() {
		pessoas = new ArrayList<Pessoa>();
		inicializeBase();
	}
	
	private static void inicializeBase() {
		adicionarPessoa(new Cliente("José Santos", "941.860.760-30", "(81) 99999-0000", "josesantos@gmail.com"));
		adicionarPessoa(new Cliente("Maria Silva", "575.373.110-4830", "(81) 99999-0001", "mariasilva@gmail.com"));
		adicionarPessoa(new Cliente("João Mamão", "080.075.880.35", "(81) 99999-0002", "jmamao@gmail.com"));
		
		adicionarPessoa(new Funcionario("Severino de Jesus", "064.749.190-78", "81 99999-1111", "sevjesus@gmail.com", 1500.00, "func001"));
		adicionarPessoa(new Funcionario("Maria Silva", "575.373.110-4830", "81 99999-0001", "mariasilva@gmail.com", 1500.00, "func002"));
		adicionarPessoa(new Funcionario("José Santos", "941.860.760-30", "81 99999-0000", "josesantos@gmail.com", 1500.00, "func001"));
	}
	
	public static boolean adicionarPessoa(Pessoa pessoa) {
		if(ValidadorCPF.validador(pessoa.getCpf()))
			pessoas.add(pessoa);
		return false;
	}
	
	private static Pessoa buscarPessoa(String cpf) {
		if(ValidadorCPF.validador(cpf))
			for(Pessoa pessoaCurrent: pessoas)
				if(pessoaCurrent.getCpf().equals(cpf))
					return pessoaCurrent;
		return null;
	}
	
	
	public static boolean validarSenha(String cpf) {
		Pessoa pessoa = buscarPessoa(cpf);
		if(pessoa==null)
			return false;
		if(pessoa.getSenha()==null)
			buscarPessoa(cpf).setSenha("123456");
			JOptionPane.showMessageDialog(null, "Senha padrão definida para 123456!");
		return true;
	}
	
	public static boolean authenticador(String cpf, String email, String senha) {
		if(buscarPessoa(cpf).getEmail().equals(email) && buscarPessoa(cpf).getSenha().equals(senha))
			return true;
		return false;
	}
	
	
	
	

	
	
	
}

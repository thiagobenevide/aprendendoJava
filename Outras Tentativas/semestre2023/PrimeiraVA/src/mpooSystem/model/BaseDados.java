package mpooSystem.model;

import java.util.ArrayList;

import mpooSystem.view.MensagemView;

public class BaseDados {
	private static ArrayList<Pessoa>pessoas;
	
	public static void createBase() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	private static void inicializarBase() {
		Pessoa pessoa = new Usuario("Thiago", "13077735407","masculino", "thiagobenevide", "123456");
	}
	
	private static Pessoa buscarPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			if(ValidadorCPF.isCPF(pessoa.getCpf())) {
				for(Pessoa pessoaCurrent : pessoas) {
					if(pessoaCurrent.getCpf().equalsIgnoreCase(pessoa.getCpf())){
						return pessoaCurrent;
					}
				}				
			}else {
				MensagemView.exibirMensagem(Mensagem.CPF_INVALIDO);
			}
			
		}
		return null;
	}
	
	public static boolean isPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			return pessoas.contains(buscarPessoa(pessoa));
		}else {
			MensagemView.exibirMensagem(Mensagem.USUARIO_LOGIN_ERROR);
			return false;
		}
		
	}
	
	public static boolean isUsuario(String login, String senha) {
		for(Pessoa pessoaCurrent: pessoas) {
			if(((Usuario)pessoaCurrent).getLogin().equalsIgnoreCase(login) && ((Usuario)pessoaCurrent).getSenha().equalsIgnoreCase(senha)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean adicionarPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			if(ValidadorCPF.isCPF(pessoa.getCpf())) {
				if(!isPessoa(pessoa)) {
					pessoas.add(pessoa);
					MensagemView.exibirMensagem(Mensagem.USUARIO_SUCESS);
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean isUsuario(Usuario usuario) {
		if(usuario!=null) {
			if(ValidadorCPF.isCPF(usuario.getCpf())) {
				return isPessoa(((Pessoa)usuario));
			}
		}
		return false;
	}
	
	
	public static boolean removerPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			if(ValidadorCPF.isCPF(pessoa.getCpf())) {
				if(isPessoa(pessoa)) {
					pessoas.remove(pessoas.indexOf(buscarPessoa(pessoa)));
					MensagemView.exibirMensagem(Mensagem.REMOVE_USER);
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean isAdmin(String chaveAcesso) {
		for(Pessoa pessoaCurrent : pessoas) {
			if(((Administrador)pessoaCurrent).getChaveAcesso().equalsIgnoreCase(chaveAcesso) ) {
				return true;
			}
		}
		return false;
	}
	
	public static ArrayList listPessoas() {
		ArrayList array = new ArrayList<String>();
		
		for(Pessoa pessoaCurrent : pessoas) {
			array.add(pessoaCurrent.getNome());
		}
		
		return array;
	}	
	

	public static ArrayList listUsuarios() {
		ArrayList array = new ArrayList<String>();
		
		for(Pessoa pessoaCurrent : pessoas) {
			array.add(((Usuario)pessoaCurrent).getNome());
		}
		
		return array;
	}	
	
}

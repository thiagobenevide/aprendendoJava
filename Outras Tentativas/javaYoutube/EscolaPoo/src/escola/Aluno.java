package escola;

import java.util.Date;

public class Aluno extends Pessoa {
	private Date dataNascimento;
	
	public Aluno(String nome, int matricula, Date dataNascimento) {
		super(nome, matricula);
		this.dataNascimento = dataNascimento;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public static void realizarAvaliacao() {
		
	}
}

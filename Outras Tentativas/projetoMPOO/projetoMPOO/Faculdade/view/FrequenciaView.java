package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.BaseDados;
import model.Diciplina;

public class FrequenciaView extends JFrame{
	private String[] colunas = {"ID", "MATRICULA", "NOME DO ALUNO", "PRESENTE", "FALTOU"};
	private String[] alunosDiciplina;
	JButton salvarButton;
	
	public FrequenciaView(String login, String senha, Diciplina diciplina, String[] alunosDiciplina) {
		setSize(200,200);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		this.alunosDiciplina = alunosDiciplina;
		
		
		
	}
	
	
}

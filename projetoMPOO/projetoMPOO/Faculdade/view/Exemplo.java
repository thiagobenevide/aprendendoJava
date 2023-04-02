package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Exemplo extends JFrame {
	
	public Exemplo() {
		
	
	  // Define o modelo da tabela
    String[] colunas = {"Nome", "Idade", "Cidade"};
    Object[][] dados = {
        {"Ana", 25, "São Paulo"},
        {"Bruno", 30, "Rio de Janeiro"},
        {"Carla", 20, "Belo Horizonte"},
        {"Daniel", 35, "Porto Alegre"}
    };
    JTable tabela = new JTable(dados, colunas);

    // Adiciona a tabela em um JScrollPane
    JScrollPane scrollPane = new JScrollPane(tabela);

    // Adiciona o JScrollPane ao JFrame
    add(scrollPane);

    // Define as propriedades do JFrame
    setTitle("Exemplo de tabela em JFrame");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setLocationRelativeTo(null); // Centraliza a janela
	}
	
	public static void main(String[] args) {
        // Cria a janela e a torna visível
        Exemplo janela = new Exemplo();
        janela.setVisible(true);
    }
}

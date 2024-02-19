package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.ParseException;
import java.util.Observable;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class RecepcionistaView extends View{
	 JLabel logradouroLabel, numeroEnderecoLabel, cepLabel, bairroLabel, estadoLabel, cidadeLabel, nomeLabel, dataNascimentoLabel, cpfLabel, telefoneLabel, dadosConsultaLabel, numeroLabel, horaLabel;
	 JTextField logradouroField, numeroEnderecoField, bairroField, estadoField, cidadeField, nomeField, dadosConsultaField, numeroField, horaField;
	 JFormattedTextField cpfFormatField, cepFormatField, dataNascimentoFormatField, telefoneFormatField;
	 JPanel panelEndereco, panelCadastroPaciente;
	 JButton cadastrarPaciente, abrirTelaEspera;
	 
	 
	 public RecepcionistaView(){
		 setSize(300,500);
		 setLocationRelativeTo(null);
		 setLayout(new FlowLayout());
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 

		 //Panel Cadastro
		 panelCadastroPaciente = new JPanel();
		 panelCadastroPaciente.setLayout(new BoxLayout(panelCadastroPaciente, BoxLayout.Y_AXIS));
		 panelCadastroPaciente.setVisible(true);
		 
		 
		 //Label Cadastro
		 nomeLabel = new JLabel("Nome: ");
		 dataNascimentoLabel = new JLabel("Data Nascimento: ");
		 cpfLabel = new JLabel("Cpf: "); 
		 telefoneLabel =  new JLabel("Telefone: "); 
		 dadosConsultaLabel = new  JLabel("Dados Consulta: "); 
		 numeroLabel = new JLabel("Numero: "); 
		 horaLabel = new JLabel("Hora: ");;
		 
		 //Field Cadastro
		 nomeField = new JTextField(15);
		 try {
				dataNascimentoFormatField = new JFormattedTextField(new MaskFormatter("##-##-####"));
				dataNascimentoFormatField.setColumns(15);
			 } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		 try {
				cpfFormatField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
				cpfFormatField.setColumns(15);
			 } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		 try {
				telefoneFormatField = new JFormattedTextField(new MaskFormatter("(##) 9####-####"));
				telefoneFormatField.setColumns(15);
			 } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		 dadosConsultaField = new JTextField(15);
	
		 
		 panelCadastroPaciente.add(nomeLabel);
		 panelCadastroPaciente.add(nomeField);
		 panelCadastroPaciente.add(dataNascimentoLabel);
		 panelCadastroPaciente.add(dataNascimentoFormatField);
		 panelCadastroPaciente.add(cpfLabel);
		 panelCadastroPaciente.add(cpfFormatField);
		 panelCadastroPaciente.add(telefoneLabel);
		 panelCadastroPaciente.add(telefoneFormatField);
		 panelCadastroPaciente.add(dadosConsultaLabel);
		 panelCadastroPaciente.add(dadosConsultaField);
		 
		 add(panelCadastroPaciente);

		 
		 
		 //Panel Endereco
		 panelEndereco = new JPanel();
		 panelEndereco.setLayout(new BoxLayout(panelEndereco, BoxLayout.Y_AXIS));
		 panelEndereco.setVisible(true);
		 
		 
		 //Endereço Label
		 logradouroLabel = new JLabel("Logradouro: ");
		 numeroEnderecoLabel = new JLabel("Endereço: ");
		 cepLabel = new JLabel("Cep: ");
		 bairroLabel = new JLabel("Bairro: ");
		 estadoLabel = new JLabel("Estado: ");
		 cidadeLabel = new JLabel("Cidade: ");
		 
		 //Endereço Field
		 logradouroField = new JTextField(15);
		 numeroEnderecoField = new JTextField(15);
		 try {
			cepFormatField = new JFormattedTextField(new MaskFormatter("#####-###"));
			cepFormatField.setColumns(15);
		 } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 bairroField = new JTextField(15);
		 estadoField = new JTextField(15);
		 cidadeField = new JTextField(15);
	 
		 panelEndereco.add(logradouroLabel);
		 panelEndereco.add(logradouroField);
		 panelEndereco.add(numeroEnderecoLabel);
		 panelEndereco.add(numeroEnderecoField);
		 panelEndereco.add(cepLabel);
		 panelEndereco.add(cepFormatField);
		 panelEndereco.add(bairroLabel);
		 panelEndereco.add(bairroField);
		 panelEndereco.add(estadoLabel);
		 panelEndereco.add(estadoField);
		 panelEndereco.add(cidadeLabel);
		 panelEndereco.add(cidadeField);
		 
		 add(panelEndereco);
		 		 
		 
		 setVisible(true);
		 
	 }
	 
	 
	 
	 

	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}

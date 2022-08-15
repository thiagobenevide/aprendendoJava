package questao6;

public class Gerente extends Vendedor {

	public Gerente(int matricula, String funcao, long rg, String senha) {
		super(matricula, funcao, rg, senha);
		// TODO Auto-generated constructor stub
	}
	
	public void descontoValorTotalCompra(double desconto, Compra compra) {
		if(compra.getTotal()> desconto) {
			compra.setTotal(compra.getTotal()-desconto); 
		}
	}
}

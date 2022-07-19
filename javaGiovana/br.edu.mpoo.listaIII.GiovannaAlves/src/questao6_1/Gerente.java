package questao6_1;

public class Gerente{

	private float desconto;

	public boolean desconto(Compra compra, Funcionario funcionario, float desconto) {
		if (funcionario != null && funcionario.getFuncao().equalsIgnoreCase("gerente")){
			compra.setTotal(-desconto);
			return true;
		}
		else {
			return false;
		}
	}
	
	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}	
}

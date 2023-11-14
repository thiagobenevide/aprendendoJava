package conceitoHeranca;

public abstract class B extends A {

	double atr; //sobreposição de tipo - não recomendável
	int atr3;
	
	
	public void metodo(){System.out.println("fazer outra coisa algo");}

//	public B(int atr) {
//		super(atr);
//		// TODO Auto-generated constructor stub
//	}
	
	public B(int atr, int atr2) {
		super(atr, atr2);
		// TODO Auto-generated constructor stub
	}
	
	public B(int atr, int atr2, int atr3) {
		super(atr, atr2);
		this.atr3 = atr3;
	}

	//boa prática de programação: Se super tem vários construtores então sub também deveria tê-los
	
	
	@Override //sobreposição ou sobrescrita de método
//	private void metodoConcreto(){}//erro de sintaxe, apenas aumentar a visibilidade
	public void metodoConcreto(){}//apenas aumentar de visibilidade

	//se herda metodo abstrato e a classe é concreta, então a classe é obrigada a sobrescrever o método herdado
//	@Override
//	public void metodoAbstrato() {
//		// TODO Auto-generated method stub
//	}
}

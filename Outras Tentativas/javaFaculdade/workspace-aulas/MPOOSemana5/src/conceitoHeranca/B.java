package conceitoHeranca;

public abstract class B extends A {

	double atr; //sobreposi��o de tipo - n�o recomend�vel
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

	//boa pr�tica de programa��o: Se super tem v�rios construtores ent�o sub tamb�m deveria t�-los
	
	
	@Override //sobreposi��o ou sobrescrita de m�todo
//	private void metodoConcreto(){}//erro de sintaxe, apenas aumentar a visibilidade
	public void metodoConcreto(){}//apenas aumentar de visibilidade

	//se herda metodo abstrato e a classe � concreta, ent�o a classe � obrigada a sobrescrever o m�todo herdado
//	@Override
//	public void metodoAbstrato() {
//		// TODO Auto-generated method stub
//	}
}

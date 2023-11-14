package conceitoHeranca;

public abstract class A {
	int atr;
	int atr2;
	
	
	public static void metodo(){System.out.println("faz algo");}
	
	protected void metodoConcreto(){//corpo
	}
	
	public abstract void metodoAbstrato();//não tem corpo
	public abstract void metodoAbstrato2();//não tem corpo

	//se não tiver construtor, herdeiros também não precisam declarar construtores
	//se houver ao menos 1 construtor não default, herdeiros precisa ter ao menos 1 construtor não default
	
	
//	public A() {}
	
	public A(int atr) {
		this.atr = atr;
	}

	public A(int atr, int atr2) {
		this.atr = atr;
		this.atr2 = atr2;
	}
	
	
	
	
//mas se houver vários construtores e 1 for default, desobriga a obrigatoriedade de definir construtor 
	
	
	
}

package downcast;

public class SubClasse extends SuperClasse{
	private int atr_SubClasse;

	public int getAtr_SubClasse() { 	return atr_SubClasse;}

	public void setAtr_SubClasse(int atr_SubClasse) {
		this.atr_SubClasse = atr_SubClasse;
	}
	
	public void exibir(){ //exemplo de sobreescrita
		System.out.println("exibiuSub");
	}

}

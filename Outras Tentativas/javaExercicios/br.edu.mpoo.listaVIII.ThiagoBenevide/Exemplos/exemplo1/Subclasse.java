package exemplo1;

public class Subclasse extends SuperClasse {

	private int atr_SubClasse;

	public int getAtr_SubClasse() {
		return atr_SubClasse;
	}

	public void setAtr_SubClasse(int atr_SubClasse) {
		this.atr_SubClasse = atr_SubClasse;
	}

	@Override
	public String toString() {
		return "Subclasse [atr_SubClasse=" + atr_SubClasse + "]";
	}
	
	
	
	
}

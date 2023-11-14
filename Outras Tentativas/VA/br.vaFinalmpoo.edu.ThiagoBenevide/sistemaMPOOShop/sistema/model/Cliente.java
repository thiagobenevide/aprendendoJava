package sistema.model;

import java.util.ArrayList;

public class Cliente {
	private ArrayList<CupomDesconto> cupons;

	public Cliente() {
		super();
		this.cupons = new CupomDesconto(this);
	}
	
	
	
}

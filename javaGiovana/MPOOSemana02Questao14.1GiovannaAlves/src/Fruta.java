
public class Fruta {
		
	private Boolean caroco;
	private Boolean casca;
	
	public Fruta(Boolean caroco, Boolean casca) {
		this.caroco = caroco;
		this.casca = casca;
	}
	
	public static Fruta retirarCaroco(Fruta fruta) {
		if (fruta.caroco == true) {
			fruta.caroco = false;
			System.out.println("Caroço retirado!");
			return fruta;}
		else {
			System.out.println("Essa fruta não tem caroço!");
			return fruta;
			}
		}

	public static Fruta retirarCasca(Fruta fruta) {
		if (fruta.casca == true) {
			fruta.casca = false;
			System.out.println("Casca retirada!");
			return fruta;}
		else {
			System.out.println("Essa fruta não tem casca!");
			return fruta;
			}
		}
	
	
	public static void comerFruta(Fruta fruta) {
		if (fruta.casca == true && fruta.caroco == true) {
			fruta.casca = false;
			fruta.caroco = false;
			fruta = null;
			}
		else if(fruta.casca== false && fruta.caroco == true) {
			fruta.casca = false;
			fruta = null;
		}
		else if(fruta.casca == true && fruta.caroco == false) {
			fruta.caroco = false;
			fruta = null;
		}
		else {
			fruta = null;
		}
		System.out.println("Comi a fruta!");
		System.gc();
	}
	
	public Boolean getCaroco() {
		return caroco;
	}

	public void setCaroco(Boolean caroco) {
		this.caroco = caroco;
	}

	public Boolean getCasca() {
		return casca;
	}

	public void setCasca(Boolean casca) {
		this.casca = casca;
	}

}
package questao14_2;

public class Robot {
	private String nome;
	private boolean ligado;
	private int posicaoX;
	private int posicaoY;
	private String direcao;
	
	public Robot(String nome, int posicaoX, int posicaoY) {
		super();
		this.nome = nome;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}
	
	public boolean inicializarRobo() {
		if (!this.isLigado()) {
			if (this.getPosicaoX()==0 && this.getPosicaoY()==0 ) {
				this.setDirecao("Norte");
				this.setLigado(true);
				return true;
			}
			this.setLigado(true);
			return true;
		}
		return false;
	}
	
	public boolean andarUmPasso() {
		this.setPosicaoX(this.getPosicaoX()+1);
		this.setPosicaoY(this.getPosicaoY()+1);
		return true;
	}
	
	public boolean adiciarVariosPassos(int qPassosX, int qPassosY) {
		this.setPosicaoX(this.getPosicaoX()+qPassosX);
		this.setPosicaoY(this.getPosicaoY()+qPassosY);
		return true;
		
	}
	
	public boolean retornarPosZero() {
		this.setPosicaoX(0);
		this.setPosicaoY(0);
		return true;
	}
	
	public boolean desligarRobo() {
		if(this.isLigado()) {
			this.setLigado(false);
			return true;
		}
		return false;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Robot [nome=" + nome + ", ligado=" + ligado + ", posicaoX=" + posicaoX + ", posicaoY=" + posicaoY
				+ ", direcao=" + direcao + "]";
	}

	public int getPosicaoX() {
		return posicaoX;
	}
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	public int getPosicaoY() {
		return posicaoY;
	}
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	public String getDirecao() {
		return direcao;
	}
	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	
}

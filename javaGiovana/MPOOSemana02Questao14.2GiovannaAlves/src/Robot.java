
public class Robot {
		
	private String nome;
	private String posicao;
	private String direcao;
	private int passos;
	private boolean status;
	
	public Robot(String nome, String posicao, String direcao) {
		this.nome = nome;
		this.posicao = posicao;
		this.direcao = direcao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public int getPassos() {
		return passos;
	}

	public void setPassos(int passos) {
		this.passos += passos;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
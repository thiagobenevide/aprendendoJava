package aula08;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador lutador1, Lutador lutador2) {
			if(lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
				this.setAprovada(true);
				this.setDesafiado(lutador2);
				this.setDesafiante(lutador1);
			}else {
				this.setAprovada(false);
				this.setDesafiado(lutador2);
				this.setDesafiante(lutador1);
			}
		}
	
	public void lutar() {
		if (this.isAprovada()) {
			this.getDesafiado().apresentar();
			this.getDesafiante().apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch (vencedor){
				case 0:
					System.out.println("Empatou! ");
					this.getDesafiado().empatarLuta();
					this.getDesafiante().empatarLuta();
					break;
				case 1:
					System.out.println(this.getDesafiado().getNome()+" Ganhou!");
					this.getDesafiado().ganharLuta();
					this.getDesafiante().perderLuta();
					break;
				case 2:
					System.out.println(this.getDesafiante().getNome()+"Ganhou!");
					this.getDesafiado().perderLuta();
					this.getDesafiante().ganharLuta();
					break;
					
			}
		}
	}
	
	
	
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
}

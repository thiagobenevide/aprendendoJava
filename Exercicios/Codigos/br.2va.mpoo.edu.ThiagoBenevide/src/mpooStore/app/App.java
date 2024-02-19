package mpooStore.app;

import mpooStore.controller.AberturaController;
import mpooStore.controller.GanharCupomController;
import mpooStore.model.BaseDados;
import mpooStore.model.GeradorCupom;
import mpooStore.model.GerenciadorCupom;
import mpooStore.model.TempoOferta;

public class App {
	public static GerenciadorCupom gerenciadorCupom;
	
	public static void main(String[] args) {
		BaseDados.createBase();
		GeradorCupom gC = new GeradorCupom();
		gC.start();
		TempoOferta tO = new TempoOferta();
		tO.start();		
		gerenciadorCupom = new GerenciadorCupom();
		gerenciadorCupom.setValorCupomAtual(gC.getValorAtualizado());
		new AberturaController();
		
	}

}

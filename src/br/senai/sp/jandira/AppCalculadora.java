package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameCalculadora;
import br.senai.sp.jandira.model.RecolhedorDeDados;

public class AppCalculadora {

	public static void main(String[] args) {
		

		RecolhedorDeDados cliente = new RecolhedorDeDados();
		
		cliente.multiplicador = 8;
		cliente.minimoMultiplicador = 5;
		cliente.maximoMultiplicador = 10;
		
		FrameCalculadora tela = new FrameCalculadora();
	
		tela.titulo = "Calculadora";
		tela.altura = 700;
		tela.largura = 500;
		
		tela.criarTela();
		
	
		
		
			
		}
	
	
	
	
}

		
	



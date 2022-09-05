package br.senai.sp.jandira;

import br.senai.sp.jandira.model.RecolhedorDeDados;

public class Calculadora {

	public static void main(String[] args) {
		

		RecolhedorDeDados cliente = new RecolhedorDeDados();
		
		cliente.multiplicador = 8;
		cliente.minimoMultiplicador = 5;
		cliente.maximoMultiplicador = 10;
		
		cliente.getResultadoMultiplicador();
		
	}

}

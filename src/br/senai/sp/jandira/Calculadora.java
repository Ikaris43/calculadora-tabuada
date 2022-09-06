package br.senai.sp.jandira;

import br.senai.sp.jandira.model.RecolhedorDeDados;

public class Calculadora {

	public static void main(String[] args) {
		

		RecolhedorDeDados cliente = new RecolhedorDeDados();
		
		cliente.multiplicador = 8;
		cliente.minimoMultiplicador = 5;
		cliente.maximoMultiplicador = 10;
		
		String[] resultado = cliente.getTabuada();
		
		int i = 0;
		while (i < resultado.length) {
			System.out.println(resultado[i]);
			i++;
			
		}
		}

		
	}



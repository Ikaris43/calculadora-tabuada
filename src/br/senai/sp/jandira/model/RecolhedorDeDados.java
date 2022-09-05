package br.senai.sp.jandira.model;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RecolhedorDeDados {

	public double multiplicador;
	public double minimoMultiplicador;
	public double maximoMultiplicador;
	public double[] tabela = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public double result;
	public double i = 0;
	
		public void getResultadoMultiplicador() {
			while (i < maximoMultiplicador) {
				result = multiplicador * minimoMultiplicador;
				System.out.printf("%s X %s = %s", multiplicador, minimoMultiplicador, result);
				System.out.println("");
				minimoMultiplicador++;
				i++;
				
			} 
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
}

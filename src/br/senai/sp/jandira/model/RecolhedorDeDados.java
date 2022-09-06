package br.senai.sp.jandira.model;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RecolhedorDeDados {

	public int multiplicador;
	public int minimoMultiplicador;
	public int maximoMultiplicador;
	public int result;
	public int i = 0;
	


		public void getRecolhedorDeDados() {
			while (i < maximoMultiplicador) {
				result = multiplicador * minimoMultiplicador;
				minimoMultiplicador++;
				i++;
				
			} 
		}
		
		
		public String[] getTabuada() {
				int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
				String[] tabuada = new String[tamanho];
				
				 while (minimoMultiplicador <= maximoMultiplicador) {
					 
					 result = multiplicador * minimoMultiplicador;
						
						
						String resultado = multiplicador + " X  " + minimoMultiplicador + " = " + result;
						tabuada[i] = resultado;
						
						minimoMultiplicador++;
						i++;
						
				} return tabuada;
				 
				
			}
			
			
		}
	
	
	
	
	
	
	
	
	
	


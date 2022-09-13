package br.senai.sp.jandira.model;

public class RecolhedorDeDados {

	public int multiplicador;
	public int minimoMultiplicador;
	public int maximoMultiplicador;
	public int result;
	public int i = 0;
	


		
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
	
	
	
	
	
	
	
	
	
	


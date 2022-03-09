package view;

import controller.ThreadMatriz;

public class Principal3 {

	public static void main(String[] args) {
		int matriz[][] = new int [3][5];
		
		for(int i = 0; i < 3; i++) { 
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = (int)(Math.random() * 30) + 1;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			new ThreadMatriz(i+1, matriz[i]).start();
		}
 
	}

}
package labs.matrizes;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		Random rad = new Random();

		int[][] M = new int[10][10];
		int maior5 = 0, menor5 = 0;
		int maior7 = 0, menor7 = 0;

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = rad.nextInt(10);
				System.out.print(M[i][j] + "\t ");

				if (M[i].length - 1 == j) {
					System.out.println();
				}
				// Maior e Menor da Linha 5
				if (j == 0 && i == 4) {
					maior5 = M[i][j];
					menor5 = M[i][j];
				}
				if (i == 4) {
					if (M[i][j] > maior5) {
						maior5 = M[i][j];
					}
					if (M[i][j] < menor5)
						menor5 = M[i][j];
				}
				// Maior e Menor Coluna 7
				if (i == 0 && j == 6) {
					maior7 = M[i][j];
					menor7 = M[i][j]; 
				}
				if (j == 6) {
					if (M[i][j] > maior7) {
						maior7 = M[i][j];
					}
					if (M[i][j] < menor7)
						menor7 = M[i][j];
				}
			}
		}
		System.out.println("\n5ª linha: \nMaior: " + maior5 + "\nMenor: " + menor5);
		System.out.println("\n7ª coluna:\nMaior: " + maior7 + "\nMenor: " + menor7);
	}

}

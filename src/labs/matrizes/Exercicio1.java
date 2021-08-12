package labs.matrizes;

import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		Random rad = new Random();

		int[][] M = new int[4][4];
		int maior = 0;
		String posM = "";

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = rad.nextInt(9);
				System.out.print(M[i][j] + " ");
				if (M[i].length - 1 == j) {
					System.out.println();
				}

				if (j == 0 && i == 0) {
					maior = M[i][j];
					posM = "[" + i + "] [" + j + "]";
				}
				if (maior < M[i][j]) {
					maior = M[i][j];
					posM = "[" + i + "] [" + j + "]";

				}
			}
		}

		System.out.println("\nMaior número: " + maior + "\nPosição: " + posM);

	}

}

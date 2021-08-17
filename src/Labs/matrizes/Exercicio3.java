package Labs.matrizes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] M = new int[3][3];
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print("Valor: ");
				M[i][j] = scan.nextInt();

				if (M[i][j] % 2 == 0 && M[i][j] != 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Pares: " + pares + "\nImpares: " + impares);
		scan.close();
	}

}

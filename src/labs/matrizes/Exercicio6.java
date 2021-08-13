package labs.matrizes;

import java.util.Scanner;

public class Exercicio6 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// JOGO DA VELHA

		char[][] jogoVelha = new char[3][3];

		char jogador1 = 'X';
		char jogador2 = 'O';
		byte jogadas = 0;
		byte linha = 0;
		byte coluna = 0;
		boolean fimDeJogo = false;

		while (!fimDeJogo) {

			// Verifica quem será o jogador autorizado para jogar.
			if (jogadas % 2 == 0) {
				System.out.println("Jogador Nº 1 Joga [X]");
				System.out.print("Linha: ");
				linha = scan.nextByte();
				linha = lance(linha);

				System.out.print("Coluna: ");
				coluna = scan.nextByte();
				coluna = lance(coluna);

				jogoVelha[linha][coluna] = jogador1;

			} else {
				System.out.println("Jogador Nº 2 Joga [O]");
				System.out.print("Linha: ");
				linha = scan.nextByte();
				linha = lance(linha);

				System.out.print("Coluna: ");
				coluna = scan.nextByte();
				coluna = lance(coluna);

				jogoVelha[linha][coluna] = jogador2;

			}

			tabela(jogoVelha);

			// Verificar quem venceu
			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')
					|| (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')
					|| (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')
					|| (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')
					|| (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')
					|| (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')
					|| (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')
					|| (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) {
				System.out.println("Jogador 1 - Venceu!");
				fimDeJogo = true;
			} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')
					|| (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')
					|| (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')
					|| (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')
					|| (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')
					|| (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O')
					|| (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')
					|| (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')) {
				System.out.println("Jogador 2 - Venceu!");
				fimDeJogo = true;
			} else if (jogadas == 9) {
				System.out.println("Empate");
				fimDeJogo = true;
			}

			// Contador Fim de Jogo
			jogadas++;
			if (jogadas == 9) {
				fimDeJogo = true;
			}
		}

		System.out.println("FIM");
		scan.close();
	}

	// Função Verificar se numero digitado é válido entre [0 a 2]
	// Retorna: numero correto.
	private static byte lance(byte lc) {
		boolean flag = false;
		while (!false) {
			if (lc < 0 || lc > 2) {
				System.out.println("Favor Repetir UMA Nova Jogada!");
				lc = scan.nextByte();
			} else {
				return lc;
			}
			flag = true;
		}
	}

	
	//Mostra na Tela a situação atual do tabuleiro.
	private static void tabela(char[][] jVelha) {
		System.out.println();
		for (int i = 0; i < jVelha.length; i++) {
			for (int j = 0; j < jVelha[i].length; j++) {
				System.out.print(jVelha[i][j] + "\t| ");
			}
			System.out.println();
		}
	}
}

package Labs.poo;

import java.util.Scanner;

public class JogoDaVelha {

	char[][] jogoVelha = new char[3][3];

	char jogador1 = 'X';
	char jogador2 = 'O';
	byte jogadas = 0;
	byte linha = 0;
	byte coluna = 0;
	Scanner scan = new Scanner(System.in);

	// Verifica quem será o jogador autorizado para jogar.
	// Recebe um contator do tipo byte
	// Retorna: um char. valor X ou O para a matriz.
	char verificarVezJogador(byte jogadas) {
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
		return jogoVelha[linha][coluna];
	}

	// Função Verificar se numero digitado é válido entre [0 a 2]
	// Retorna: numero correto.
	byte lance(byte lc) {
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

	// Mostra na Tela a situação atual do tabuleiro.
	void tabela(char[][] jogoVelha) {
		System.out.println();
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				System.out.print(jogoVelha[i][j] + "\t| ");
			}
			System.out.println();
		}
	}

	// Verificar quem venceu
	boolean verificarQueVenceu(char[][] jogoVelha, boolean fimDeJogo) {
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
		return fimDeJogo;
	}
}

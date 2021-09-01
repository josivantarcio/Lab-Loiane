package Labs.poo.Exercicios2;

public class ProgramaJogoVelha {

	public static void main(String[] args) {
		// Exercicio 04 - Aula 25

		JogoDaVelha jgVelha = new JogoDaVelha();
		boolean fimDeJogo = false;
		
		while (!fimDeJogo) {
			jgVelha.tabela(jgVelha.jogoVelha);
			jgVelha.verificarVezJogador(jgVelha.jogadas);
			fimDeJogo = jgVelha.verificarQueVenceu(jgVelha.jogoVelha, fimDeJogo);

			// Contador Fim de Jogo
			jgVelha.jogadas++;
			if (jgVelha.jogadas == 9) {
				fimDeJogo = true;
			}
		}
		System.out.println("FIM");

	}

}

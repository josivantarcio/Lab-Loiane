package labs.matrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];
		byte opcao;
		boolean flag = false;
		int dia = 0;
		int hora = 0;

		while (!flag) {
			System.out.println();
			System.out.println(" === Digite 1 para add compromisso\n === Digite 2 para verificar "
					+ "compromisso.\n === Digite 3 para sair.\n === Digite 4 para Agenda Completa.");

			opcao = scan.nextByte();

			switch (opcao) {
			case 1: // Adicionar Compromisso
				boolean diaValido = false;

				while (!diaValido) {
					System.out.print(">> Digite o Dia da Semana: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					}
				}

				boolean horaValida = false;

				while (!horaValida) {
					System.out.print(">> Digite a Hora: ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					}
				}
				System.out.println(">> Digite o Compromisso: ");
				compromissos[dia][hora] = scan.next();

				break;

			case 2: // Verificar Compromisso

				diaValido = false;

				while (!diaValido) {
					System.out.print("Digite o Dia da Semana: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					}
				}

				horaValida = false;

				while (!horaValida) {
					System.out.print("Digite a Hora: ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					}
				}
				if (compromissos[dia][hora] == null) {
					System.out.println("Não Existe Compromisso nesse DIA e HORA !!!!");
				} else {
					System.out.print("Compromisso: " + compromissos[dia][hora]);
				}

				break;
			case 3:
				flag = true;
				break;
			case 4:
				System.out.println(" COMPROMISSOS AGENDADOS ");
				for (int i = 0; i < compromissos.length; i++) {
					for (int j = 0; j < compromissos[i].length - 1; j++) {
						if (compromissos[i][j] != null) {
							System.out.print("Dia: " + i + " - Hora: " + j + " = ");
							System.out.println(compromissos[i][j].toUpperCase());
						}
					}
				}
				break;
			default:
				System.out.println("\n*** Opção Invalida! Tente Novamente ***");

			}
			
		}
		System.out.println("FIM");
		scan.close();
	}

}

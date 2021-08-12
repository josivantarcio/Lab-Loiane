package labs.matrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];
		byte opcao;
		boolean flag = false;
		byte dia = 0;
		byte hora = 0;

		while (!flag) {
			System.out.println();
			System.out.println(" === Digite 1 para add compromisso\n === Digite 2 para verificar "
					+ "compromisso.\n === Digite 4 para Agenda Completa\n === Digite 3 para sair.");

			opcao = scan.nextByte();

			switch (opcao) {
			case 1: // Adicionar Compromisso
				boolean diaValido = false;

				while (!diaValido) {
					System.out.print(">> Digite o Dia da Semana: ");
					dia = scan.nextByte();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					}
				}

				boolean horaValida = false;

				while (!horaValida) {
					System.out.print(">> Digite a Hora: ");
					hora = scan.nextByte();
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					}
				}
				System.out.println(">> Digite o Compromisso: "); 
				compromissos[dia][hora] = scan.next();

				System.out.println(" COMPROMISSOS AGENDADOS ");
				for (int i = 0; i < compromissos.length; i++) {
					for (int j = 0; j < compromissos[i].length; j++) {
						if (compromissos[i][j] != null) {
							System.out.print("Dia: " + (dia) + " - Hora: " + hora + " = ");
							System.out.println(compromissos[i][j].toUpperCase());
						}
					}
				}
				break;
			case 2: // Verificar Compromisso

				diaValido = false;

				while (!diaValido) {
					System.out.print("Digite o Dia da Semana: ");
					dia = scan.nextByte();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					}
				}

				horaValida = false;

				while (!horaValida) {
					System.out.print("Digite a Hora: ");
					hora = scan.nextByte();
					if (hora >= 0 && hora <= 23.59) {
						horaValida = true;
					}
				}
				if (compromissos[--dia][hora] == null) {
					System.out.println("Não Existe Compromisso nesse DIA e HORA !!!!");
				} else {
					System.out.print("Compromisso: " + compromissos[--dia][hora]);
				}

				break;
			case 3:
				flag = false;
				break;
			case 4:
				System.out.println(" COMPROMISSOS AGENDADOS ");
				for (int i = 0; i < compromissos.length; i++) {
					for (int j = 0; j < compromissos[i].length; j++) {
						if (compromissos[i][j] != null) {
							System.out.print("Dia: " + (dia) + " - Hora: " + hora + " = ");
							System.out.println(compromissos[i][j].toUpperCase());
						}
					}
				}
				break;
			default:
				System.out.println("\n*** Opção Invalida! Tente Novamente ***");

			}
			System.out.println("\nDeseja Sair? [0-SAIR // 1-CONTINUAR]");
			byte num = scan.nextByte();
			if (num == 0) {
				flag = true;
			}
		}
		System.out.println("FIM");
	}

}

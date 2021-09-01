package Labs.matrizes;

import java.util.Scanner;

public class Exercicio4 { 
	private static int dia = 0;
	private static int hora = 0;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		String[][] compromissos = new String[31][24];
		byte opcao;
		boolean flag = false;
		

		while (!flag) {
			System.out.println();
			System.out.println(" === Digite 1 para add compromisso\n "
					+ "=== Digite 2 para verificar compromisso.\n "
					+ "=== Digite 3 para sair.\n"
					+ "=== Digite 4 para Agenda Completa.");

			opcao = scan.nextByte();

			switch (opcao) {
			case 1: // Adicionar Compromisso
				boolean diaValido = false;
				boolean horaValida = false;
				
				dia = verificaDia(diaValido);
				hora = verificaHora(horaValida);

				System.out.println(">> Digite o Compromisso: ");
				compromissos[dia][hora] = scan.next();

				break;

			case 2: // Verificar Compromisso
 
				diaValido = false;
				horaValida = false;

				dia = verificaDia(diaValido);
				hora = verificaHora(horaValida);
								
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
					for (int j = 0; j < compromissos[i].length; j++) {
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
	
	private static int verificaDia(boolean bol) {
		
		while (!bol) {
			System.out.print(">> Digite o Dia do Mês: ");
			dia = scan.nextInt();
			if (dia > 0 && dia <= 31) {
				bol = true;
			}
		}
		return dia;
		
	}
	
	private static int verificaHora(boolean bol) {
		while (!bol) {
			System.out.print(">> Digite a Hora: ");
			hora = scan.nextInt();
			if (hora > 0 && hora <= 24) {
				bol = true;
			}
		}
		return hora;
	}

}

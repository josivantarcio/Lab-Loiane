package Labs.matrizes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio5 { 
	private static int mes = 0;
	private static int dia = 0;
	private static int hora = 0;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		String[][][] compromissos = new String[12][31][24];
		byte opcao;
		boolean flag = false;
		

		while (!flag) {
			System.out.println();
			System.out.println(" === Digite 1 para add compromisso\n "
					+ "=== Digite 2 para verificar compromisso.\n "
					+ "=== Digite 3 para sair.\n "
					+ "=== Digite 4 para Agenda Completa.");

			opcao = scan.nextByte();

			switch (opcao) {
			case 1: // Adicionar Compromisso
				boolean mesValido = false;
				boolean diaValido = false;
				boolean horaValida = false;
				
				mes = verificaMes(mesValido);
				dia = verificaDia(diaValido);
				hora = verificaHora(horaValida);

				compromissos[mes][dia][hora] = JOptionPane.showInputDialog("Digite o Compromisso! ");
				break;

			case 2: // Verificar Compromisso
 
				mesValido = false;
				diaValido = false;
				horaValida = false;

				mes = verificaMes(mesValido);
				dia = verificaDia(diaValido);
				hora = verificaHora(horaValida);
								
				if (compromissos[mes][dia][hora] == null) {
					System.out.println("Não Existe Compromisso nesse MES e DIA e HORA !!!!");
				} else {
					System.out.print("Compromisso: " + compromissos[mes][dia][hora]);
				}
				break;
				
			case 3:
				flag = true;
				break;
				
			case 4:
				System.out.println(" COMPROMISSOS AGENDADOS ");
				for (int i = 0; i < compromissos.length; i++) {
					for (int j = 0; j < compromissos[i].length; j++) {
						for(int k = 0; k < compromissos[i][j].length; k++) {
							if (compromissos[i][j][k] != null) {
								System.out.print("Mês: " + i +" - Dia: " + j + " - Hora: " + k + " = ");
								System.out.println(compromissos[i][j][k].toUpperCase()); 
							}
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
	
	private static int verificaMes(boolean bol) {
		
		while (!bol) {
			System.out.print(">> Digite o Mês: ");
			mes = scan.nextInt();
						
			if (mes >=1 && mes <=12) {
				bol = true;
			}
		}
		return mes;
	}
	
	private static int verificaDia(boolean bol) {
		
		while (!bol) {
			System.out.print(">> Digite o Dia do Mês "+dia+": ");
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

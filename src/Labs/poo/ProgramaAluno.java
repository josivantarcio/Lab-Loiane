package Labs.poo;

import java.util.Scanner;

public class ProgramaAluno {

	public static void main(String[] args) {
		//Exercicio 3 - Aula 25
		Aluno aluno = new Aluno();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome do Aluno: ");
		aluno.nome = scan.next();
		
		System.out.print("Matricula: ");
		aluno.matricula = scan.next();
		
		System.out.print("Curso: ");
		aluno.curso =  scan.next();
				 
		for(int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.print("Digite a Disciplina nº"+(i+1)+": ");
			aluno.disciplinas[i] = scan.next();
			
		} 
		
		for(int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Digite a Nota da Disciplina "+aluno.disciplinas[i]+": ");
			aluno.notas[i] = scan.nextDouble();
		}
		aluno.analisar();
		
		System.out.println("FIM");
		scan.close();

	}

}

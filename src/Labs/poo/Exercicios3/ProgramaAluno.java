package Labs.poo.Exercicios3;

import java.util.Scanner;

public class ProgramaAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = scan.next();

		System.out.print("Matricula: ");
		String matricula = scan.next();

		System.out.print("Curso: ");
		String curso = scan.next();

		Aluno aluno = new Aluno(nome, matricula, curso);
		

		aluno.cadastrarDisciplinasNotas();
		aluno.mostrarDadosAluno();


	}
}

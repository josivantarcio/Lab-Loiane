package Labs.poo.Exercicios5;

import java.util.Scanner;

public class TesteCurso {
	public static void main(String[] args) {
		Curso curso = new Curso();
		Professor professor = new Professor();
		Scanner scan = new Scanner(System.in);

		System.out.println("Nome do Curso");
		curso.setCurso(scan.nextLine());

		System.out.println("Horario do Curso de " + curso.getCurso());
		curso.setHorario(scan.nextLine());

		System.out.println("Nome do Professor: ");
		professor.setNome(scan.nextLine());

		System.out.println("Departamento do Professor: ");
		professor.setDepartamento(scan.nextLine());

		System.out.println("Email do Professor: ");
		professor.setEmail(scan.nextLine());

		curso.setProfessor(professor);

		
		Aluno[] alunos = new Aluno[2];
		for (int i = 0; i < alunos.length; i++) {
			scan.nextLine();
			System.out.println("Digite o nome do aluno #" + (i + 1));
			String nome = scan.nextLine();

			System.out.println("Matricula de " + nome);
			String Matricula = scan.nextLine();
			

			Double[] notas = new Double[4];
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Digite a nota #" + (1 + j));
				notas[j] = scan.nextDouble();
			}
			Aluno aluno = new Aluno();
			aluno.setNome(nome);
			aluno.setMatricula(Matricula);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
			curso.setAlunos(alunos);
			
		}
		
		
		System.out.println(curso.toString());
		scan.close();
	}
}

package Labs.poo.Exercicios3;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private String matricula;
	private String cursoMatriculado;
	private String[] disciplina = new String[3];
	private double[][] notas = new double[disciplina.length][4];
	private String situacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCursoMatriculado() {
		return cursoMatriculado;
	}

	public void setCursoMatriculado(String cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}

	public String[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String[] disciplina) {
		this.disciplina = disciplina;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Aluno(String nome, String matricula, String cursoMatriculado) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setCursoMatriculado(cursoMatriculado);
	}

	public void cadastrarDisciplinasNotas() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < getDisciplina().length; i++) {
			System.out.print("Disciplina " + (1 + i) + ": ");
			getDisciplina()[i] = scan.next();
			for (int j = 0; j < getNotas()[i].length; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				getNotas()[i][j] = scan.nextDouble();
			}
		}
		this.alunoAprovado();
		scan.close();
	}

	public void alunoAprovado() {
		int aprovado = 0;
		for (int i = 0; i < getDisciplina().length; i++) {
			double media = 0;
			double soma = 0;
			for (int j = 0; j < getNotas()[i].length; j++) {
				soma += getNotas()[i][j];
			}
			System.out.print(getDisciplina()[i] + " ");
			media = soma / getNotas()[i].length;
			if (media >= 7) {
				System.out.println("\tAprovado");
				aprovado++;
			} else {
				System.out.println("\tReprovado");
			}
			System.out.println("Média:...\t" + media);
		}
		if (aprovado == getDisciplina().length) {
			setSituacao("Aluno Aprovado!");
		} else if (aprovado < getDisciplina().length && aprovado > 1) {
			setSituacao("Aluno Recuperacao!");
		} else {
			setSituacao("Aluno Reprovado!");
		}
	}

	public void mostrarDadosAluno() {
		System.out.println("===== RELATÓRIO DO ALUNO =====");
		System.out.println("NOME:\t\t" + getNome().toUpperCase());
		System.out.println("MATRICULA:\t" + getMatricula());
		System.out.println("CURSANDO:\t" + getCursoMatriculado());
		System.out.println("DISCIPLINAS Matriculadas:");
		for (int i = 0; i < getDisciplina().length; i++) {
			System.out.println("\n" + getDisciplina()[i]);
			for (int j = 0; j < getNotas()[i].length; j++) {
				System.out.print(getNotas()[i][j] + " ");
			}
		}
		System.out.println("\nDISCIPLINAR:\t" + getSituacao());
	}
}

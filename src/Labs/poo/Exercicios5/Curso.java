package Labs.poo.Exercicios5;

import java.util.Arrays;

public class Curso {
	private String curso;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;

	
	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	public Aluno[] getAlunos() {
		return alunos;
	}


	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}


	@Override
	public String toString() {
		return "Curso [curso=" + curso + ", horario=" + horario + ", professor=" + professor + ", aluno="
				+ Arrays.toString(alunos) + "]";
	}
	
	
	
}

package Labs.poo.Exercicios5;

import java.util.Arrays;

public class Aluno {

	private String nome;
	private String matricula;
	private Double[] notas;

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

	public Double[] getNotas() {
		return notas;
	}

	public void setNotas(Double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		double soma = 0;
		for (int i = 0; i < this.getNotas().length; i++) {
			soma += this.getNotas()[i];
		}
		return soma / this.getNotas().length;
	}

	@Override
	public String toString() {
		String situacao;
		if (this.calcularMedia() > 7) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notas=" + Arrays.toString(notas) + ", Situação="
				+ situacao + "]"; 
	} 

}

package Labs.poo.Exercicios3;

public class Aluno {
	private String nome;
	private String matricula;
	private String cursoMatriculado;
	private double[] notas = new double[4];
	private String[][] disciplina = new String[3][notas.length];

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

	public String[][] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String[][] disciplina) {
		this.disciplina = disciplina;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public Aluno(String nome, String matricula, String cursoMatriculado) {
		this.nome = nome;
		this.matricula = matricula;
		this.cursoMatriculado = cursoMatriculado;
	}

	

	public void alunoAprovado() {
		double media = 0;
		double soma = 0;
		for (int i = 0; i < this.getDisciplina().length; i++) {
			for (int j = 0; j < this.getNotas().length; j++) {
				soma += this.getNotas()[j];
			}
			System.out.print(this.getDisciplina()[i]+" ");
			media = soma / this.notas.length;
			if (media >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
	}
}

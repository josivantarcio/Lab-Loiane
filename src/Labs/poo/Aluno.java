package Labs.poo;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[] notas = new double[3];
	
	
	void analisar() {
		int d=0;
		for(int i = 0; i < disciplinas.length;i++) {
			if(notas[i] >= 7) {
				System.out.println("APROVADO em  "+ disciplinas[i]);
				d++;
			}else {
				System.out.println("Reprovado na disciplina: "+ disciplinas[i]);
			}
			
		}
		System.out.println();
		System.out.println("===============================");
		if(d >= disciplinas.length) {
			System.out.println("ALUNO: "+nome);
			System.out.println("Matricula: "+matricula);
			System.out.println("Foi Aprovado no Curso de "+curso);
		}else {
			System.out.println("ALUNO: "+nome);
			System.out.println("Matricula: "+matricula);
			System.out.println("Foi Reprovado no Curso de "+curso);
		}

	}
}

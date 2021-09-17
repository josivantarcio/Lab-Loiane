package Labs.poo.Exercicios6;

import java.util.Scanner;

public class TesteReceita {
	public static void main(String[] args) {
		ContribuinteCnpj pj = new ContribuinteCnpj();
		ContribuinteCpf pf = new ContribuinteCpf();
		Scanner scan = new Scanner(System.in);
	
		pj.setNome("Pessoa02");
		pj.setCnpj("25.456.854/0001-55");
		pj.setRenda(3000);
		pj.calcularDeducao();
		
		pf.setNome("Pessoa01");
		pf.setCpf("958557458-65");
		pf.setRenda(3700);
		pf.calcularDeducao();
		
		
		
		
		System.out.println(pf);
		System.out.println(pj);
	}
}

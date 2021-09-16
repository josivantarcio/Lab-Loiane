package Labs.poo.Exercicios6;

import java.util.Scanner;

public class TesteReceita {
	public static void main(String[] args) {
		ContribuinteCnpj pj = new ContribuinteCnpj();
		ContribuinteCpf pf = new ContribuinteCpf();
		Scanner scan = new Scanner(System.in);
	
		pj.setNome("industrias xxxx");
		pj.setCnpj("25.456.854/0001-55");
		pj.setRendaCnpj(2000);
		
		pf.setNome("amadeu");
		pf.setCpf("95877458-65");
		pf.setRendaCpf(3100);
		
		
		System.out.println(pf);
		System.out.println(pj);
	}
}

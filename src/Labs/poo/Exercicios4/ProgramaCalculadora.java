package Labs.poo.Exercicios4;

import java.util.Scanner;

public class ProgramaCalculadora {
	public static void main(String[] args) {
		System.out.println("Valor 1");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		System.out.println("Valor 2");
		int n2 = scan.nextInt();
		
		int i = Calculadora.somar(n1, n2);
		System.out.println(i);
		
		System.out.println(Calculadora.subtrair(n1, n2));
		System.out.println(Calculadora.multiplicar(n1, n2));
		System.out.println(Calculadora.dividir(n1, n2));
		System.out.println(Calculadora.potencia(n1, n2));
	}
}

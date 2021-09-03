package Labs.poo.Exercicios4;

public class Contador {
	private static int cont;

	public static void incrementar() {
		cont++;
	}

	public static void zerar() {
		cont = 0;
	}

	public static void imprimir() {
		System.out.println("O valor é: " + cont);
	}
}

package Labs.poo.Exercicios4;

public class RecusivoFibo {
	public static int fibo(int num) {
		if (num < 2) {
			return 1;
		}

		return fibo(num - 1) + fibo(num - 2);
	}
}

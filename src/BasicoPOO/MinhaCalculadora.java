package BasicoPOO;

public class MinhaCalculadora {
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}

	public double soma(double num1, double num2) {
		return num1 + num2;
	}

	public int soma(int[] num) {
		int soma = 0;
		for (int i = 0; i < num.length; i++) {
			soma += num[i];
		}
		return soma;
	}
	
	

}

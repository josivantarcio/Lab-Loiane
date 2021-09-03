package Labs.poo.Exercicios4;

public class Recursivo {

	public static int fatorial(int num){
		if(num == 0) {
			return 1;
		}
		return num * fatorial(num-1);
	}
}

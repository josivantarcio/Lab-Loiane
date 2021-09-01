package BasicoPOO;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		double km = 10;

		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca + " " + van.modelo);
		van.exibirAutonomia();
		double autonomia = van.obterAutonomia();
		System.out.println(autonomia);
		System.out.println("Van com autonomia em " + km + " de: " + van.calcularCombustivel(km));

		Carro fusca = new Carro();
		fusca.marca = "VW";
		fusca.modelo = "1996";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;

		System.out.println(fusca.marca + " " + fusca.modelo);
		fusca.exibirAutonomia();
		System.out.println(fusca.obterAutonomia());
		double autonomiaFusca = fusca.calcularCombustivel(km);
		System.out.println("Fusca com autonomia em " + km + " de: " + autonomiaFusca);

	}

}

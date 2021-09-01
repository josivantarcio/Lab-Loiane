package BasicoPOO;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; // Capacidade de Passageiros
	double capCombustivel; // Capacidade de combustível
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A Autonomia do carro é " + capCombustivel * consumoCombustivel + "Km");
	}
	 
	double obterAutonomia() {
		System.out.println("O metodo autonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		 
		double qtdFuel = km / consumoCombustivel;
		return qtdFuel;
	}
}

package BasicoPOO.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; // Capacidade de Passageiros
	double capCombustivel; // Capacidade de combustível
	double consumoCombustivel;

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Construtor com 3 paramentros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Construtor com 2 paramentros");
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {
	}

	void exibirAutonomia() {
		System.out.println("A Autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + "Km");
	}

	double obterAutonomia() {
		System.out.println("O metodo autonomia foi chamado");
		return this.capCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdFuel = km / this.consumoCombustivel;
		return qtdFuel; 
	}
}

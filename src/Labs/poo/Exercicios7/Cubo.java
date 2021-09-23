package Labs.poo.Exercicios7;

public class Cubo extends Figura3D{
	private int aresta;

	public int getAresta() {
		return aresta;
	}

	public void setAresta(int aresta) {
		this.aresta = aresta;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(aresta, 3);
	}

	@Override
	public double calcularArea() {
		return 6 * Math.pow(aresta, 2);
	}
	
	
}

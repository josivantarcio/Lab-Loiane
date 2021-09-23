package Labs.poo.Exercicios7;

public class Cilindro extends Figura3D{
	private double altura;
	private double raio;
	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		return Math.PI * Math.pow(raio, 2) * altura;
	}

	@Override
	public double calcularArea() {
		double areaBase = Math.PI * Math.pow(raio, 2);
		double areaLateral = 2 * Math.PI * raio * altura;
		
		return 2 * areaBase  + areaLateral;		
	}
	
	
}

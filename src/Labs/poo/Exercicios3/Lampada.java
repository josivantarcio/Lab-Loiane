package Labs.poo.Exercicios3;

public class Lampada {
	private boolean ligada;
		
	//construtores
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}
	
	//getter and setter
	public boolean getLigada() {
		return ligada;
	} 

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	//metodos
	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void MostrarLampada() {
		if (ligada) {
			System.out.println("Lampada " + ligada);
		} else {
			System.out.println("Lampada Desligada");
		}
	}

	public void Mudar() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}

}

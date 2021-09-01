package Labs.poo.Exercicios2;

//Exercicio 01 - aula 27 
public class Lampada {
	boolean ligada;
	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}
	
	void MostrarLampada() {
		if(ligada) {
			System.out.println("Lampada "+ligada);
		}else {
			System.out.println("Lampada Desligada");
		}
	}
	 
	void Mudar() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}
	
}
   
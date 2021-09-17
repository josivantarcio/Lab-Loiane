package Labs.poo.Exercicios6;

public class TesteZoo {
	public static void main(String[] args) {

		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(1.50);
		camelo.setCor("amarelo");
		camelo.setAmbiente("terra");
		camelo.setVelocidade(2);

		Peixe tubarao = new Peixe();
		tubarao.setNome("tubarao");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);

		Mamifero urso = new Mamifero();
		urso.setNome("urso-do-canada");
		urso.setComprimento(1.80);
		urso.setCor("vermelho");
		urso.setVelocidade(0.5);

		Animal[] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;

		System.out.println(" -- ZOO --");
		for (Animal animal : animais) {
			System.out.println(animal);
			System.out.println("----------------------------------");
		}

	}
}

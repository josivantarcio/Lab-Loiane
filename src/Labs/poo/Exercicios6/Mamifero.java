package Labs.poo.Exercicios6;

public class Mamifero extends Animal{
	
	private String alimento;
	
	public Mamifero() {
		this.setCor("Castanho");
		this.alimento = "mel";
		this.setAmbiente("terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + alimento;
		return s;
	}

	
	
}

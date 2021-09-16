package Labs.poo.Exercicios6;

public class Pessoa {
	private String nome;

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "[nome=" + nome;
	}
	
	
}

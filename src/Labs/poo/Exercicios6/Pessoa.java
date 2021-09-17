package Labs.poo.Exercicios6;

public abstract class Pessoa {
	private String nome;
	private double renda;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public abstract void calcularDeducao();
	
	@Override
	public String toString() {
		return "Nome=" + nome + ", Renda=" + renda;
	}
}

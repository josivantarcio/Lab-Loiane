package Labs.poo.Exercicios5;

import java.util.Arrays;

public class Agenda {
	private String nome;
	private Contato[] contatos;

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public Agenda() {
	}
	
	public Agenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Agenda [nome=" + nome + ", contatos=" + Arrays.toString(contatos) + "]";
	}
	
	
}

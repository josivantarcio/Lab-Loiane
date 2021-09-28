package Labs.poo.Exercicios8;

public class ContatoNaoExisteException extends Exception{
	private String nome;
	
	public ContatoNaoExisteException(String nomeContato) {
		nome = nomeContato;
	}
	
	public String getMessage() {
		return "Não existe Cadastro com esse nome: " + nome;
	}
}

package Labs.poo.Exercicios8;

public class Contato {
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	private static int identificador = 0;
	
	public Contato() {
		this.identificador++;
		this.id = identificador;
		
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + " NOME:" + nome + " TELEFONE: " + telefone + " EMAIL: " + email;
	}
	
	
	
}
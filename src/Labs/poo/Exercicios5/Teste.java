package Labs.poo.Exercicios5;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o nome da Agenda: ");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		Contato[] contatos = new Contato[3];
		for(int i = 0; i < contatos.length; i++) {
			Contato c = new Contato();
			
			System.out.print("Nome: ");
			c.setNome(scan.nextLine());
			
			System.out.print("Telefone: ");
			c.setTelefone(scan.nextLine());
			
			System.out.print("Email: ");
			c.setEmail(scan.nextLine());
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
		
		for (Contato contato : contatos) {
			System.out.println(contato);
		}

	}

}

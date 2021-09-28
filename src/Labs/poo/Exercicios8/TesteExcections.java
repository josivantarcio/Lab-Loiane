package Labs.poo.Exercicios8;

import java.util.Scanner;

public class TesteExcections {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();

		int opcao = 1;

		while (opcao != 3) {

			opcao = obterOpcaoMenu(scan);

			if (opcao == 1) { // consultar contato
				consultarContato(scan, agenda);
			} else if (opcao == 2) { // Adicionar contato
				adicionarContato("Digite os dados", scan, agenda);
			}
		}
		System.out.println("FIM");
		scan.close();
	}

	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomePessoa = leInformacaoString("Digite o nome do Contado", scan);
		try {
			if (agenda.consultaContatoPorNome(nomePessoa) >= 0) {
				System.out.println("Contato existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
			
		}
	}

	public static void adicionarContato(String msg, Scanner scan, Agenda agenda) {

		try {
			System.out.println("Criando contato! Entrar com as informacoes! ");
			String nome = leInformacaoString("Nome: ", scan);
			String telefone = leInformacaoString("Telefone: ", scan);
			String email = leInformacaoString("Email: ", scan);

			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);
			contato.setEmail(email);

			System.out.println("Cadastrar Contato...");
			System.out.println(contato);

			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());

			System.out.println("Contatos da Agenda");
			System.out.println(agenda);
		}

	}

	public static String leInformacaoString(String msg, Scanner scan) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 3;

		while (!entradaValida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Consultar Contato: ");
			System.out.println("2 - Adicionar Contato: ");
			System.out.println("3 - Sair: ");

			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;

				} else {
					throw new Exception("Entrada Invalida");
				}

			} catch (Exception e) {
				System.out.println("Entrada invalida! Digite novamente:\n");
			}

		}
		return opcao;

	}

}

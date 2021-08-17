package Labs.poo;

import java.util.Date;

public class Master {

	public static void main(String[] args) {
		
		//Exercicio01
//		Exercicio01_lampada lampada = new Exercicio01_lampada();
//				
//		lampada.marca = "LG";
//		lampada.modelo = "A60";
//		lampada.cor = "azul";
//		lampada.garantia = 12;
//		lampada.potencia = 28;
//		lampada.preco = 26.20;
//		lampada.tipoLuz = "branca";
//		
//		lampada.tipos = new String[2];
//		lampada.tipos[0] = "Abajur" ;
//		lampada.tipos[1] = "Lampeoes";
//		
//
//		
//		//Exercicio02
//		Exercicio02_livro livro = new Exercicio02_livro();
//		livro.nome = "OS Segredos da Mente Milionária";
//		livro.autor = "T. Harv Eker";
//		livro.editora = "Sextante";
//		livro.isbn = "85-7542-239-1";
//		livro.quantPaginas = 175;
//		
//
//		//Exercicio04
//		Exercicio04_livroDeBiblioteca livroBible = new Exercicio04_livroDeBiblioteca();
//		
//		livroBible.nomeLivro = "Pequeno Principe";
//		livroBible.autor = "desconhecido";
//		livroBible.anoLancamento = 1985;
//		livroBible.editora = "FabulasEFabulas";
//		livroBible.isbn = "125-1544-9-2326";
//		livroBible.nomeEmprestado = "Jupira Bilinha";
//		livroBible.emprestado = true;
//		livroBible.dtEmprestimo = new Date();
		
		Lampada lampada = new Lampada(); 
		
		lampada.ligar();
		lampada.MostrarLampada();
		lampada.desligar();
		lampada.MostrarLampada();
		
		lampada.Mudar();
		lampada.MostrarLampada();
		
		
	}

} 

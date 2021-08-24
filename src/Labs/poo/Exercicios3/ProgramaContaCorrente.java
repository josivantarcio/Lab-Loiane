package Labs.poo.Exercicios3;

import java.util.Scanner;

public class ProgramaContaCorrente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Numero da Conta: ");
		String numConta = scan.next();

		System.out.print("Limite da Conta: ");
		double limiteConta = scan.nextDouble();

		ContaCorrente conta = new ContaCorrente(numConta, limiteConta);
		conta.consultarSaldo();
		
		System.out.print("Colocar Saldo: ");
		double addSaldo = scan.nextDouble();
		conta.depositar(addSaldo);
		conta.consultarSaldo();
		
		System.out.print("Sacar valor: ");
		double sacarValor = scan.nextDouble();
		conta.sacar(sacarValor);
		conta.consultarSaldo();
		
		

		scan.close();
		System.out.println("FIM"); 
	}

}

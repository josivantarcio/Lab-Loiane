package Labs.poo.Exercicios2;

public class ContaCorrente {
	String numConta;
	boolean contaEspecial = false;
	double saldo;
	double limiteEspecial;

	double sacar(double valorSaque) {
		double valor = 0;
		if (contaEspecial) {
			if (saldo + limiteEspecial > valorSaque) {
				valor = (saldo + limiteEspecial - valorSaque);
			} else {
				System.out.println("!!!! Mesmo com Cheque especial, Saldo Indisponível para o momento");
			}
		} else {
			if (saldo > valorSaque) {
				valor = (saldo + limiteEspecial - valorSaque);
			} else {
				System.out.println("!!!!!  Saldo Indisponível para o momento");
			}
		}
		saldo = valor;
		return saldo;
	}

	double depositar(double valorDepositar) {
		return saldo += valorDepositar;
	}

	void consultarSaldo() {
		System.out.println("======= CONTA CORRENTE =======");
		System.out.println("Conta: " + numConta);
		System.out.println("Saldo: R$............." + saldo);
		System.out.println("Cheque Especial: R$..." + limiteEspecial);
	}

	void usarChequeEspecial() {
		contaEspecial = true;
		saldo -= limiteEspecial;
		System.out.println("Cliente usando o Cheque Especial");
		
	}

}

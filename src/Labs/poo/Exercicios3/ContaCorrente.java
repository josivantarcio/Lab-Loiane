package Labs.poo.Exercicios3;

public class ContaCorrente {
	private String numConta;
	private double saldo = 0;
	private boolean statusEspecial;
	private double limite;

	// getters e setters
	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isStatusEspecial() {
		return statusEspecial;
	}

	public void setStatusEspecial(boolean statusEspecial) {
		this.statusEspecial = statusEspecial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// construtores
	public ContaCorrente(String numConta, boolean statusEspecial, double limite) {
		this(numConta, limite);
		this.statusEspecial = statusEspecial;
		this.limite = limite;
	}

	public ContaCorrente(String numConta, double limite) {
		this.numConta = numConta;
		this.limite = limite;
	}

	// metodos
	public void sacar(double sacar) {

		if (this.saldo > 0) {
			if (this.isStatusEspecial()) {
				this.saldo += this.limite;
				this.saldo -= sacar;
				System.out.println("saque realizado com sucesso");
			} else {
				this.saldo -= sacar;
				System.out.println("saque realizado com sucesso");
			}
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo Insuficiente");
		}

	}

	public void depositar(double deposito) {
		this.saldo += deposito;
		System.out.println("Deposito realizado com Sucesso");
	}

	public void consultarSaldo() {
		System.out.println("SALDO DA CONTA");
		System.out.println("Conta:...." + this.getNumConta());
		System.out.println("Saldo:...." + this.getSaldo());
		System.out.println("Limite:..." + this.getLimite());
		double total = this.getLimite() + this.getSaldo();
		if (getLimite() < 0) {
			this.usarLimiteEspecial(getSaldo());
		}
		System.out.println("Total:...." + total);
	}

	public void usarLimiteEspecial(double usarLimite) {
		if (usarLimite < this.limite) {
			System.out.println("Cliente usando Cheque Especial");
		}
	}
}

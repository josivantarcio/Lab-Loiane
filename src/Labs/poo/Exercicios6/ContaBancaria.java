package Labs.poo.Exercicios6;

public abstract class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valorSacar) {
		double valorSaque = 0;
		if ((this.saldo - valorSacar) >= 0) {
			valorSaque = this.getSaldo() - valorSacar;
			this.setSaldo(valorSaque);
			return true;
		}else {
			return false;
		}
	}
	
	public void depositar(double valorDepositar) {
		this.saldo += valorDepositar;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	

}

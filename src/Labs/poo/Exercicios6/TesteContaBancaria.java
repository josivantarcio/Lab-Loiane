package Labs.poo.Exercicios6;

public class TesteContaBancaria {
	public static void main(String[] args) {
		ContaBancaria cb = new ContaPoupanca();
		cb.setNomeCliente("Amarildo");
		cb.setNumConta(12544);
		cb.setSaldo(0);
		cb.depositar(100);
		System.out.println(cb);
		realizarSaque(cb, 50);
		realizarSaque(cb, 70);
		System.out.println(cb);
		
	}
	
	public static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque Realizado com Sucesso\nNovo Saldo " + conta.getSaldo());
		}else {
			System.out.println("Impossível realizar transação. Saldo Insuficiente");
		}
	}
}

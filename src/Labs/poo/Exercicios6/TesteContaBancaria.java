package Labs.poo.Exercicios6;

public class TesteContaBancaria {
	public static void main(String[] args) {
		ContaPoupanca cb = new ContaPoupanca();
		cb.setNomeCliente("Amarildo");
		cb.setNumConta(12544);
		cb.setSaldo(0);
		cb.depositar(100);
		cb.setDiaRendimento(15);
		
		System.out.println(cb);
		cb.calcularNovoSaldo(0.10);
		realizarSaque(cb, 85);
		System.out.println(cb);
		
		ContaEspecial ce = new ContaEspecial();
		ce.setLimite(100);
		ce.sacar(300);
		
	}
	
	public static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque Realizado com Sucesso\nNovo Saldo " + conta.getSaldo());
		}else {
			System.out.println("Impossível realizar transação. Saldo Insuficiente");
		}
	}
}

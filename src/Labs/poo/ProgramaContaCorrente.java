package Labs.poo;

public class ProgramaContaCorrente {

	public static void main(String[] args) {
		
	ContaCorrente conta = new ContaCorrente();
	
	conta.numConta = "15114-9";
	
	conta.limiteEspecial = 2000;
	conta.usarChequeEspecial();
	conta.depositar(1000);
	conta.sacar(10);
	conta.sacar(20);

	conta.consultarSaldo();	
		
	}

} 

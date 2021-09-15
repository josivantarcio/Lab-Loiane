package Labs.poo.Exercicios6;

public class ContaEspecial extends ContaBancaria{
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
		
	@Override
	public boolean sacar(double valorSacar) {
		double valorSaque = 0;
		if ((super.getSaldo() - valorSacar) >= 0) {
			valorSaque = super.getSaldo() - valorSacar;
			super.setSaldo(valorSaque);
			return true;
		}else {
			return false;
		}
	}
}
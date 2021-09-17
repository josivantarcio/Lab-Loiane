package Labs.poo.Exercicios6;

public class ContribuinteCpf extends Pessoa {
	private String cpf;
	private double deducao;

	public double getDeducao() {
		return deducao;
	}

	public void setDeducao(double deducao) {
		this.deducao = deducao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + " Cpf=" + cpf + ", Deducao=" + deducao;
	}

	@Override
	public void calcularDeducao() {
		double valor = super.getRenda();
		if (super.getRenda() > 0 && super.getRenda() <= 1400) {
			this.setDeducao(0);
		} else if (super.getRenda() > 1400 && super.getRenda() <= 2100) {
			this.setDeducao(valor * 0.10 - 100);
		} else if (super.getRenda() > 2100 && super.getRenda() <= 2800) {
			this.setDeducao(valor * 0.15 - 270);
		} else if (super.getRenda() > 2800 && super.getRenda() <= 3600) {
			this.setDeducao(valor * 0.25 - 500);
		} else {
			this.setDeducao(valor * 0.30 - 700);
		}

	}

}

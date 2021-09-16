package Labs.poo.Exercicios6;

public class ContribuinteCnpj extends Pessoa{
	private String cnpj;
	private double rendaCnpj;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getRendaCnpj() {
		return rendaCnpj;
	}

	public void setRendaCnpj(double rendaCnpj) {
		this.rendaCnpj = rendaCnpj * 0.10;
	}

	@Override
	public String toString() {
		return super.toString() + " cnpj=" + cnpj + ", rendaCnpj=" + rendaCnpj + "]";
	}

}

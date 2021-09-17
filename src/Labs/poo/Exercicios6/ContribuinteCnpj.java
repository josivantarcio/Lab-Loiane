package Labs.poo.Exercicios6;

public class ContribuinteCnpj extends Pessoa{
	private String cnpj;
	private double imposto;

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	

	@Override
	public String toString() {
		return super.toString() +" CNPJ="+ cnpj + ", Imposto=" + imposto;
	}

	@Override
	public void calcularDeducao() {
		this.setImposto(super.getRenda() * 0.1);
		
	}

}

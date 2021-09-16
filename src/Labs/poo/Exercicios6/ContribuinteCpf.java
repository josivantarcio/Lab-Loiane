package Labs.poo.Exercicios6;

public class ContribuinteCpf extends Pessoa{
	private String cpf;
	private double rendaCpf;
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
	public double getRendaCpf() {
		return rendaCpf;
	}
	public void setRendaCpf(double rendaCpf) {
		this.rendaCpf = rendaCpf;
		this.calcularDeducao();
	}

	public void calcularDeducao() {
		
		if(this.rendaCpf > 0 && this.rendaCpf <= 1400) {
			this.setDeducao(0);
		}else if(this.rendaCpf > 1400 && this.rendaCpf <= 2100 ) {
			this.setDeducao(100);
		}else if(this.rendaCpf > 2100 && this.rendaCpf <= 2800 ) {
			this.setDeducao(270);
		}else if(this.rendaCpf > 2800 && this.rendaCpf <= 3600 ) {
			this.setDeducao(500);
		}else {
			this.setDeducao(700);
		}
		
	}
	@Override
	public String toString() {
		return super.toString() +" Cpf=" + cpf + ", rendaCpf=" + rendaCpf + ", deducao=" + deducao + "]";
	}
	
	
}

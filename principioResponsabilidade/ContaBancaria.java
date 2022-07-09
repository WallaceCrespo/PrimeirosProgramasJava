package principioResponsabilidade;

public class ContaBancaria {

	private String descricao;

	private double saldo = 8000;

	public void soma100Reais() {
		saldo += 100;

	}

	public void diminui100Reais() {
		saldo -= 100;
	}

	public void sacarDinheiro(Double saque) {
		saldo -= saque;
	}
	
	public void depositoDinheiro (Double deposito) {
		saldo +=deposito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [Descricao =" + descricao + ", saldo=" + saldo + "]";
	}
	
	
	

}

package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	private String tempoRegistro;
	private int tempoDirecao;
	private String titulacao;

	public String getTempoRegistro() {
		return tempoRegistro;
	}

	public void setTempoRegistro(String tempoRegistro) {
		this.tempoRegistro = tempoRegistro;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [tempoRegistro=" + tempoRegistro + ", tempoDirecao=" + tempoDirecao + ", titulacao=" + titulacao
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	@Override
	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}

	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return false;
	}

}

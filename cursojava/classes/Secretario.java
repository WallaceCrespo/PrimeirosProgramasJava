package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelcargo;
	private String experiencia;


	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelcargo() {
		return nivelcargo;
	}

	public void setNivelcargo(String nivelcargo) {
		this.nivelcargo = nivelcargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}



	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelcargo=" + nivelcargo + ", experiencia=" + experiencia
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

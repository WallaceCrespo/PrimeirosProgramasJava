package cursojava.interfaces;

public interface PermitirAcesso {
	
	public boolean autenticar();

	boolean autenticar(String login, String senha);
}

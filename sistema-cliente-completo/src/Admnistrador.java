
public class Admnistrador extends Funcionario implements Autenticavel{

	AutenticacaoUtil autenticador;
	
	public Admnistrador () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);	
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
}
}

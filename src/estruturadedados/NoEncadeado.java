package estruturadedados;

public class NoEncadeado {
	private String dados;
	private NoEncadeado prox;
	private NoEncadeado ante;


	public NoEncadeado() {
		// TODO Auto-generated constructor stub
	}

	public NoEncadeado(String dados) {
		super();
		this.dados = dados;
	}

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}

	public NoEncadeado getProx() {
		return prox;
	}

	public void setProx(NoEncadeado prox) {
		this.prox = prox;
	}

	public NoEncadeado getAnte() {
		return ante;
	}

	public void setAnte(NoEncadeado ante) {
		this.ante = ante;
	}

}

package estruturadedados;

public class NoEncadeado {
	private String dados;
	private NoEncadeado proximoNo;
	private NoEncadeado anteriorNo;

//	public NoEncadeado() {
//	}

	public NoEncadeado(String dados) {
		super();
		this.dados = dados;
	}

	public NoEncadeado getAnteriorNo() {
		return anteriorNo;
	}

	public void setAnteriorNo(NoEncadeado anteriorNo) {
		this.anteriorNo = anteriorNo;
	}

	public String getDados() {
		return dados;
	}
	public void setDados(String dados) {
		this.dados = dados;
	}
	public NoEncadeado getProximoNo() {
		return proximoNo;
	}
	public void setProximoNo(NoEncadeado proximoNo) {
		this.proximoNo = proximoNo;
	}



}

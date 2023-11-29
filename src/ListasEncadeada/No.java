package ListasEncadeada;

public class No {
	private String dados;
	private No proximoNo;
	
	public No() {
		// TODO Auto-generated constructor stub
	}
	
	
	public No(String dados) {
		super();
		this.dados = dados;
	}

	public String getDados() {
		return dados;
	}
	public void setDados(String dados) {
		this.dados = dados;
	}
	public No getProximoNo() {
		return proximoNo;
	}
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

	
	
}

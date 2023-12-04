package estruturadedados;

public class PilhaEncadeada {
	int tamanho = 0;
	NoEncadeado top;
	NoEncadeado temp;
	
	public void push(String elemento) {
		NoEncadeado novoNo = new NoEncadeado(elemento);

		if(tamanho ==  0) {
			top = novoNo;
		}else {
			novoNo.setProximoNo(top);
			top = novoNo;
		}
		tamanho++;
	}
	
	public String pop() {
		String temp = top.getDados();
		top = top.getProximoNo();
		tamanho --;
		return temp;
	}
	
	
	public boolean isEmpty() {
		if (tamanho == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {
		return tamanho;
	}
	
	public void showLista() {
		temp = top;
		for (int i = 0; i < tamanho;i++) {
			System.out.println(temp.getDados());
			temp = top.getProximoNo();
			top = temp;
		}
	}
	
	
}



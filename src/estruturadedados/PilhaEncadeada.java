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
			novoNo.setProx(top);
			top = novoNo;
		}
		tamanho++;
	}
	
	public String top() {
		return top.getDados();
	}

	public String pop() {
		if (tamanho == 0) {
			return "Não existem mais elementos";
		}else{
			String temp = top.getDados();
			top = top.getProx();
			tamanho --;
			return temp;
		}
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

	public void showPilha() {
		temp = top;
		for (int i = 0; i < tamanho;i++) {
			System.out.println(temp.getDados());
			temp = top.getProx();
			top = temp;
		}
	}


}



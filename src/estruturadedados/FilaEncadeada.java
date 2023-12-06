package estruturadedados;

public class FilaEncadeada {

	int tamanho = 0;
	NoEncadeado primeiro;
	NoEncadeado ultimo;
	NoEncadeado temp;

	public void enqueue(String elemento) {
		NoEncadeado novoNo = new NoEncadeado(elemento);

		if(tamanho ==  0) {
			primeiro = novoNo;
			ultimo = primeiro;
		}else {
			ultimo.setProx(novoNo);
			ultimo = novoNo;
		}
		tamanho++;
	}

	public String dequeue() {
		if (tamanho <= 0) {
			return "Não existem mais elementos";
		}else {
			String tempDado = primeiro.getDados();
			primeiro = primeiro.getProx();
			tamanho --;
			return tempDado; 
		}
	}


	public String front() {
		return primeiro.getDados();
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

	public void showFila() {
		NoEncadeado tempShowFila = primeiro;
		for (int i = 0 ; i < tamanho ; i++) {
			System.out.println(tempShowFila.getDados());
			tempShowFila = tempShowFila.getProx();

		}
	}
}





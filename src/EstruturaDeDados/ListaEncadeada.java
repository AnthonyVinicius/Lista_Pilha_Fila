package EstruturaDeDados;

public class ListaEncadeada {
	int tamanho = 1;
	NoEncadeado no;

	public void add(String elemento, int index) {
		NoEncadeado novoNo = new NoEncadeado(elemento);

		if(tamanho ==  0) {
			no = novoNo;
		}else {
			no.setProximoNo(novoNo);
			no.setAnteriorNo(no);
			no = novoNo;
		}
		tamanho++;
	}



}




package estruturadedados;

public class Pilha {
	private int tamanho;
	private String[] vetor = new String[5];

	public void push(String elemento) {
		this.vetor[tamanho++] = elemento;
	}

	public String top() {
		if(vetor[0] == null) {
			return "Lista Vazia";
		}else {
			return vetor[tamanho-1];
		}
	}

	public void showPilha() {

		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]!= null) {

				System.out.println(vetor[i]);
			}
		}
	}
	public boolean isEmpty() {
		if (vetor[0] == null) {
			return true;
		}
		else {
			return false;
		}
	}

	public String pop(){
		if (tamanho <= 0) {
			return "Não existem mais elementos";
		}else{
			String temp = vetor[tamanho-1]; 
			vetor[tamanho-1] = null;
			tamanho--;
			return temp;
		}
	}


	public int size() {
		return tamanho;
	}
}

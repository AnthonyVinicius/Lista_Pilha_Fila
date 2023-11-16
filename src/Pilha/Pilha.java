package Pilha;

public class Pilha {
	private int tamanho;
	private String[] vetor = new String[5];

	public void push(String elemento) {
		this.vetor[tamanho++] = elemento;
	}

	public void top() {
		if(vetor[0] == null) {
			System.out.println("Lista Vazia");
		}else {
			System.out.println(vetor[tamanho-1]);
		}
	}

	public void PilhaCompleta() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	public void isEmpty() {
		if (vetor[0] == null) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

	public void pop(){
		System.out.println(vetor[tamanho-1]); 
		vetor[tamanho-1] = null;
		tamanho--;
	}

	public void size() {
		System.out.println(tamanho);
		//		Retorna o tamanho da lista
	}
}

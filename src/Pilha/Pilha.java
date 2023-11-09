package Pilha;

public class Pilha {
	public int tamanho;
	
	public void Pilha() {
		tamanho ++;
	}
	
	public String top() {
		return null;
//	Retornar o elemento no topo mas não o remove
	}
	
	public boolean isEmpty() {
		return true;
//		Retorna se a lista está vazia ou nãos
	}
	
	public void push(String elemento) {
		this.vetor[tamanho++] = elemento;
// Adiciona o elemento no final da pilha
	}

	public String pop(){
		return null;

	}
	
	public int size() {
		return tamanho;
//		Retorna o tamanho da lista
	}
}

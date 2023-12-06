package estruturadedados;

import java.util.Scanner;

public class Lista {
	int tamanho = 0;
	Scanner input = new Scanner(System.in);
	String[] lista = new String[3];

	public void add(int posicao, String valor){
		if( posicao < 0 || posicao >= lista.length  ) {
			System.out.println("A Posição " + posicao + 1 +" é invalida");
			return;
		}else if (tamanho >= lista.length) {
			System.out.println("Lista Cheia");
			return;
		}
		if(lista[posicao - 1] != null){
			for(int i = tamanho; i > posicao - 1; i--){
				lista[i] = lista[i- 1]; 
			}
		}
		lista[posicao - 1] = valor;
		tamanho++;
	}

	public void remove(int posicao) {
		System.out.println("Removendo " + lista[posicao] +" presente na posicao " + (posicao + 1));
		lista[posicao] = null; 	
		for(int i = posicao; i < lista.length - 1; i++){
			lista[i] = lista[i + 1];
		}
		tamanho--;
	}

	public String listaGet(int posicao) {
		return "Valor presente na posição " + (posicao + 1)  + ": " + lista[posicao];
	}

	public  void listaSet(int posicao, String elemento) {
		lista[posicao] = elemento;
	}

	public int size() {
		return tamanho;
	}

	public void showLista() {
		if (tamanho == 0) {
			System.out.println("Lista Vazia");
		}else {
			System.out.println("Lista Completa:");
			for(int i = 0; i< lista.length;i++) {
				if (lista[i] != null) {
//					System.out.println(lista[i]+" index " + i );
					System.out.println(lista[i]+" posição " + (i + 1));
				}
			}
			System.out.println("__________________________________");
		}
	}

}



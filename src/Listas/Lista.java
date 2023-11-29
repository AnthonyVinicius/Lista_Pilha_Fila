package Listas;

import java.util.Scanner;

public class Lista {
	Scanner input = new Scanner(System.in);
	String[] lista = new String[5];

	public void add(int posicao, String valor){
		if(posicao > lista.length || posicao < 0) {
			System.out.println("Posição Invalida");
			return;
		}
		if(lista[posicao] != null){
			for(int i = lista.length - 1; i > posicao; i--){
				lista[i] = lista[i- 1]; 
			}
		}
		lista[posicao] = valor;
	}

	public void remove(int posicao) {
		System.out.println("Removendo " + lista[posicao] +" presente na posicao " + posicao );
		lista[posicao] = null; 
		for(int i = posicao; i < lista.length - 1; i++){
			lista[i] = lista[i + 1];
		}
	}

	public void listaGet(int posicao) {
		System.out.println("Valor presente na posição " + posicao + ": " + lista[posicao]);
	}

	public void showLista() {
		System.out.println("Lista Completa:");
		for(int i = 0; i< lista.length;i++) {
			if (lista[i] != null) {
				System.out.println(lista[i]);
			}
			System.out.println(lista[i]);
		}
	}

}

//Implementações pendentes:
//Add() item em uma posição invalida.
//Remove() item inexistente.
//Get() item inexistente
//add() valor invalido para lista


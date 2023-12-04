package main;

import estruturadedados.Fila;
import estruturadedados.FilaEncadeada;
import estruturadedados.Lista;
import estruturadedados.ListaDuplamenteEncadeada;
import estruturadedados.Pilha;
import estruturadedados.PilhaEncadeada;

public class App {
	public static void main(String[] args) {

		Lista lista = new Lista();

		lista.add(1, "Gabriel");
		lista.add(4, "João");
		lista.add(2, "Julio");
		lista.add(3, "Joel");
		lista.add(5, "Jananina");
//		lista.add(3, "Julio");
//		lista.add(7, "Julio");
		lista.showLista();
		lista.remove(2);
//		System.out.println(lista.listaGet(2));
		lista.showLista();
	
/*
		ListaDuplamenteEncadeada listaDuplamenteEncadeada = new ListaDuplamenteEncadeada();

		listaDuplamenteEncadeada.add("João",1);
		listaDuplamenteEncadeada.add("Thiago",2);
		listaDuplamenteEncadeada.add("Marcos",3);
		listaDuplamenteEncadeada.add("Maria",4);
		listaDuplamenteEncadeada.remove(4);
		System.out.println("Tamanho da lista " + listaDuplamenteEncadeada.size());
		System.out.println("Elemento: " + listaDuplamenteEncadeada.getElemento(3));
		listaDuplamenteEncadeada.showList();
*\
/*
		Fila fila = new Fila();
		fila.enqueue("Joao");
		fila.enqueue("Isaura");
		fila.enqueue("Thiago");
		fila.front();
		System.out.println(fila.isEmpty());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
				fila.filaCompleta();
*/				
		/*		
		FilaEncadeada filaEncadeada = new FilaEncadeada();
		filaEncadeada.isEmpty();
		filaEncadeada.enqueue("Gabriel");
		filaEncadeada.enqueue("Vini");
		filaEncadeada.enqueue("Anthony");
		filaEncadeada.enqueue("Carlos");
		filaEncadeada.showFila();
		System.out.println(filaEncadeada.front());
		System.out.println(filaEncadeada.dequeue());
		System.out.println(filaEncadeada.dequeue());
		System.out.println(filaEncadeada.isEmpty());
		System.out.println(filaEncadeada.size());
*/
/*		
		Pilha pilha = new Pilha();
		pilha.push("Marcos");
		pilha.push("Joao");
		pilha.push("Carlos");
		pilha.pop();
		pilha.pop();
		pilha.size();
		pilha.isEmpty();
		pilha.top();
		System.out.println("_____________________");
		pilha.PilhaCompleta();
*/
/*
		PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
		
		System.out.println(pilhaEncadeada.isEmpty());
		pilhaEncadeada.push("Alex");
		pilhaEncadeada.push("Marcos");
		pilhaEncadeada.push("João");
		pilhaEncadeada.push("Carlos");
		System.out.println(pilhaEncadeada.pop());
		System.out.println(pilhaEncadeada.isEmpty());
		System.out.println(pilhaEncadeada.size());
		pilhaEncadeada.showLista();
*/
	}

}

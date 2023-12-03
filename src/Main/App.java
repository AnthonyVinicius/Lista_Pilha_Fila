package Main;

import EstruturaDeDados.Fila;
import EstruturaDeDados.FilaEncadeada;
import EstruturaDeDados.Lista;
import EstruturaDeDados.ListaEncadeada;
import EstruturaDeDados.Pilha;
import EstruturaDeDados.PilhaEncadeada;

public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*
		Lista lista = new Lista();

		lista.add(0, "Gabriel");
		lista.add(1, "João");
		lista.add(2, "Julio");
		lista.add(7, "Julio");
		lista.remove(2);
		System.out.println(lista.listaGet(2));
		lista.showLista();
*/		

		ListaEncadeada listaEncadeada = new ListaEncadeada();

		listaEncadeada.add("João",1);
		listaEncadeada.add("Thiago",2);
		listaEncadeada.add("Marcos",3);
		listaEncadeada.add("Maria",4);
		listaEncadeada.remove(4);
		System.out.println("Tamanho da lista " + listaEncadeada.size());
		System.out.println("Elemento: " + listaEncadeada.getElemento(3));
		listaEncadeada.showList();

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

package Fila;

public class App {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		fila.enqueue("Joao");
		fila.enqueue("Isaura");
		fila.enqueue("Thiago");
		fila.front();
		fila.isEmpty();
		fila.dequeue();
		fila.dequeue();
		fila.filaCompleta();
		
	}
}

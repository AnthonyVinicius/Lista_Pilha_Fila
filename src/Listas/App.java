package Listas;

public class App extends Lista{
	public static void main(String[] args) {
		Lista lista = new Lista();

		lista.add(0, "Gabriel");
		lista.add(1, "João");
		lista.add(2, "Julio");
		lista.add(7, "Julio");
		lista.remove(2);
		lista.listaGet(2);
		lista.showLista();

	}
}

package ListasEncadeada;

public class App {
	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		listaEncadeada.add("João");
		listaEncadeada.add("Thiago");
		listaEncadeada.add("Marcos");
		System.out.println(listaEncadeada.toString());
	}
}

package Pilha;

public class App {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.push("Marcos");
		pilha.push("Joao");
		pilha.push("Carlos");
		pilha.pop();
		pilha.pop();
//		pilha.size();
//		pilha.isEmpty();
//		pilha.top();
		System.out.println("_____________________");
		pilha.PilhaCompleta();
		
	}
}

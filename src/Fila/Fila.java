package Fila;

public class Fila {
	private String[] fila = new String[5];
	private int tamanho;
	private int r = 0;
	private int f = 0;

	public void enqueue(String elemento) {
		this.fila[tamanho++] = elemento;
		r++;
		if(r == fila.length) {
			r = 0;
		}
		// Insere o elemento no fim da fila
	}

	public void dequeue() {
		fila[f] = null;
		f++;
		if(f == fila.length) {
			f = 0;
		}
		// Remove o primeiro elemento da fila e retorna
	}

	public void front() {
		System.out.println(fila[f]);		
		//				Retorna o proximo elemento mas não deleta
	}

	public void size() {
		System.out.println(tamanho);
	}

	public void isEmpty() {
		if (fila[0] == null) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	public void filaCompleta() {
		for (int i = 0; i < fila.length; i++) {
			System.out.println(fila[i]);
		}
	}
}

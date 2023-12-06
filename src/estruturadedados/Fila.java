package estruturadedados;

public class Fila {
	private String[] fila = new String[2];
	private int tamanho;
	private int r = 0;
	private int f = 0;

	public void enqueue(String elemento) {
		if(tamanho ==  fila.length) {
			System.out.println("Fila cheia");
		}

		fila[r] = elemento;
		r++;
		if(r == fila.length) {
			r = 0;
		}
	}

	public String dequeue() {
		if(tamanho <= 0) {
			System.out.println("Fila Vazia");
		}

		String temp = fila[f];
		fila[f] = null;
		f++;

		if(f == fila.length) {
			f = 0;
		}
		if (tamanho <= 0) {
			tamanho = 0;
		}else {

			tamanho--;
		}
		return temp;
	}

	public String front() {
		return fila[f];		
	}

	public int size() {
		return tamanho;
	}

	public boolean isEmpty() {
		if (fila[0] == null) {
			return true;
		}
		else {
			return false;
		}
	}

	public void showFila() {
		for (int i = 0; i < fila.length; i++) {
			if (fila[i]!= null) {
				System.out.println(fila[i]);				
			}
		}
	}
}

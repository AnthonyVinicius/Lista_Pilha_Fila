package estruturadedados;

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
	}

	public String dequeue() {
		String temp = fila[f];
		fila[f] = null;
		f++;
		if(f == fila.length) {
			f = 0;
		}
		return temp;
	}

	public void front() {
		System.out.println(fila[f]);		
	}

	public void size() {
		System.out.println(tamanho);
	}

	public boolean isEmpty() {
		if (fila[0] == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void filaCompleta() {
		for (int i = 0; i < fila.length; i++) {
			System.out.println(fila[i]);
		}
	}
}

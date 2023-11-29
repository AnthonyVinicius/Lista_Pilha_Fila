package ListasEncadeada;

public class ListaEncadeada {
	int tamanho = 0;
	No inicio;
	No ultimo;

	public void add(String elemento) {
		No novoNo = new No(elemento);

		if(tamanho ==  0) {
			inicio = novoNo;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("ListaEncadeada [tamanho=" + tamanho + ", elementos=");

		No temp = inicio;
		int elementosExibidos = 0;

		while (temp != null && elementosExibidos < 10) {
			result.append(temp.getDados()).append(", ");
			temp = temp.getProximoNo();
			elementosExibidos++;
		}

		// Remover a última vírgula e espaço extra
		if (elementosExibidos > 0) {
			result.delete(result.length() - 2, result.length());
		}

		result.append("]");
		return result.toString();
	}


}




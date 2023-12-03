package EstruturaDeDados;

public class ListaEncadeada {
	int tamanho = 0;
	NoEncadeado temp;
	NoEncadeado primeiroNo;
	NoEncadeado ultimoNo;

	public void add(String dado, int index) {
		index--;
		if (index < 0 ) {
			System.out.println("Índice inválido");
		}

		NoEncadeado novoNo = new NoEncadeado(dado);

		if (index == 0) {
//			novoNo.setProximoNo(primeiroNo);
//			primeiroNo.setAnteriorNo(novoNo);
			primeiroNo = novoNo;
			ultimoNo = novoNo;

		} else if (index == tamanho || index > tamanho) {
			ultimoNo.setProximoNo(novoNo);
			novoNo.setAnteriorNo(ultimoNo);
			ultimoNo = novoNo;

		} else {
			temp = primeiroNo;
			for (int i = 0; i < index; i++) {
				temp = temp.getProximoNo();
			}
			temp.getAnteriorNo().setProximoNo(novoNo);
			novoNo.setProximoNo(temp);
			novoNo.setAnteriorNo(temp.getAnteriorNo());
			temp.setAnteriorNo(novoNo);
		}

		tamanho++;
	}
	
	public void remove(int index) {
		index--;
		if (primeiroNo == null || tamanho <= 0) {
			throw new NullPointerException("A lista está vazia");
		}

		for (int i = 0; i < index; i++) {
			temp = temp.getProximoNo();
		}

		if (index == 0) {
			primeiroNo = temp.getProximoNo();
			if (primeiroNo == null) {
				ultimoNo = null;

			} else {
				primeiroNo.setAnteriorNo(null);

			}

		} else if (index == tamanho - 1) {
			ultimoNo = temp.getAnteriorNo();
			ultimoNo.setProximoNo(null);

		} else {
			temp.getAnteriorNo().setProximoNo(temp.getProximoNo());
			temp.getProximoNo().setAnteriorNo(temp.getAnteriorNo());
		}

		tamanho--;
	}
	
	public int size() {
		return tamanho;
	}
	
	public void showList() {
		temp = primeiroNo;
		while (temp != null) {
			System.out.print(temp.getDados() + "; ");
			temp = temp.getProximoNo();
		}

		System.out.println();
	}

}




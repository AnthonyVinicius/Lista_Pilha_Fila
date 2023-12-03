package EstruturaDeDados;

public class ListaEncadeada {
	int tamanho = 0;
	NoEncadeado temp;
	NoEncadeado primeiroNo;
	NoEncadeado ultimoNo;

	private NoEncadeado getNoAnterior(int index) {
		if (index < 0 || index >= tamanho) {

		}
		else {
			temp = primeiroNo;
			for (int i = 0; i < index; i++) {
				temp = temp.getProximoNo();
			}
		}

		return temp;
	}

	public void add(String dado, int index) {
		index--;
		if (index < 0 || index > tamanho) {
			System.out.println("Índice inválido(add)");
			return;
		}

		NoEncadeado novoNo = new NoEncadeado(dado);

		if (index == 0) {

			primeiroNo = novoNo;
			ultimoNo = novoNo;

		} else if (index == tamanho) {
			ultimoNo.setProximoNo(novoNo);
			novoNo.setAnteriorNo(ultimoNo);
			ultimoNo = novoNo;

		} else {
			temp = getNoAnterior(index);

			temp.getAnteriorNo().setProximoNo(novoNo);
			novoNo.setProximoNo(temp);
			novoNo.setAnteriorNo(temp.getAnteriorNo());
			temp.setAnteriorNo(novoNo);
		}

		tamanho++;
	}


	public void remove(int index) {
		index--;
		if (index < 0 || index >= tamanho) {
			System.out.println("Índice inválido (Remove)");
		} else {
			temp = getNoAnterior(index);

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
	}
	public String getElemento(int index) {
		index --;
		if (index < 0 || index >= tamanho) {
			System.out.println("Índice inválido getElemento");
		}

		temp = getNoAnterior(index);

		return temp.getDados();
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




package estruturadedados;

public class ListaDuplamenteEncadeada {
	int tamanho = 0;
	NoEncadeado temp;
	NoEncadeado primeiroNo;
	NoEncadeado ultimoNo;

	private NoEncadeado getAtual(int index) {
		if (index < 0 || index >= tamanho) {

		}
		else {
			temp = primeiroNo;
			for (int i = 0; i < index; i++) {
				temp = temp.getProx();
			}
		}

		return temp;
	}

	public void add(int index, String dado) {
		index--;
		if (index < 0 || index > tamanho) {
			System.out.println("Índice inválido(add)");
			return;
		}

		NoEncadeado novoNo = new NoEncadeado(dado);

		if (index == 0) {
			if(tamanho == 0){
				primeiroNo = novoNo;	
				ultimoNo = primeiroNo;
			}
			else {
				novoNo.setProx(primeiroNo);
				primeiroNo.setAnte(novoNo);
				primeiroNo = novoNo;
			}

		} else if (index == tamanho) { 
			ultimoNo.setProx(novoNo);
			novoNo.setAnte(ultimoNo);
			ultimoNo = novoNo;

		} else {
			temp = getAtual(index);

			temp.getAnte().setProx(novoNo);
			novoNo.setProx(temp);
			novoNo.setAnte(temp.getAnte());
			temp.setAnte(novoNo);
		}

		tamanho++;
	}


	public void remove(int index) {
		index--;
		if (index < 0 || index >= tamanho) {
			System.out.println("Índice inválido (Remove)");
		} else {
			temp = getAtual(index);

			if (index == 0) {
				primeiroNo = temp.getProx();
				if (primeiroNo == null) {
					ultimoNo = null;
				} else {
					primeiroNo.setAnte(null);
				}
			} else if (index == tamanho - 1) {
				ultimoNo = temp.getAnte();
				ultimoNo.setProx(null);
			} else {
				temp.getAnte().setProx(temp.getProx());
				temp.getProx().setAnte(temp.getAnte());
			}

			tamanho--;
		}
	}


	public String getElemento(int index) {
		index --;
		if (index < 0 || index >= tamanho) {
			System.out.println("Índice inválido getElemento");
		}

		temp = getAtual(index);

		return temp.getDados();

	}

	public void set(int index, String entrada) {
		index--;
		if (index < 0 || index >= tamanho) {
			System.out.println("Indice invalido");
		}

		getAtual(index).setDados(entrada);
	}

	public int size() {
		return tamanho;
	}

	public void showLista() {
		temp = primeiroNo;
		for (int i = 0; i < tamanho;i++) {
			System.out.println(temp.getDados());
			temp = temp.getProx();
		}

	}

}




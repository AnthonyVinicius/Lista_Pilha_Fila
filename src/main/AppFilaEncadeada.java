package main;

import java.util.Scanner;

import estruturadedados.FilaEncadeada;

public class AppFilaEncadeada {
	public static void main(String[] args) {
		boolean continuar = true;
		boolean operando = true;
		FilaEncadeada filaEncadeada = new FilaEncadeada(); 
		Scanner scanner = new Scanner(System.in);

		while (operando) {
			System.out.println("___________________________"
					+ "\n[1] - enqueue(Valor); "
					+ "\n[2] - dequeue(); "
					+ "\n[3] - front(); "
					+ "\n[4] - size(); "
					+ "\n[5] - isEmpty(); "
					+ "\n[6] - showFila()"
					+ "\n[7] - Encerrar Programa"
					+ "\n___________________________");
			try {

				String entrada = scanner.nextLine();

				switch(entrada){

				case ("1"):{
					continuar = true;
					while(continuar) {
						System.out.print("Digite o Elemento desejado: ");
						String elemento  = scanner.nextLine();
						filaEncadeada.enqueue(elemento);
						System.out.println("Deseja adicionar mais um elemento?[S] or [N]");
						String resposta = scanner.nextLine();
						if(resposta.equalsIgnoreCase("n")) {
							continuar = false;
						}
					}
					break;

				}
				case ("2"):{
					continuar = true;
					while(continuar) {
						System.out.println(filaEncadeada.dequeue()+" Foi removido da Fila");
						System.out.println("Deseja Remover mais um elemento?[S] or [N]");
						String resposta = scanner.nextLine();
						if(resposta.equalsIgnoreCase("n")) {
							continuar = false;
						} 
					}
					break;
				}

				case("3"):{
					System.out.print(filaEncadeada.front());
					break;

				}case("4"):{
					System.out.println("Tamanho da fila: " + filaEncadeada.size());
					break;


				} case("5"):{
					System.out.println(filaEncadeada.isEmpty());
					break;

				}case("6"):{
					filaEncadeada.showFila();
					break;
				}

				case("7"):{
					System.out.println("Encerrando Programa");
					operando = false;
					break;
				}
				default:{
					System.out.println("Valor digitado não é aceito ");
					break;
				}
				}

			}catch(RuntimeException e) {
				System.out.println("Erro, ação invalida " + e.getMessage());
			}
		}
		scanner.close();
	}
}

package main;

import java.util.Scanner;

import estruturadedados.ListaDuplamenteEncadeada;

public class AppListaDuplamenteEncadeada {
	public static void main(String[] args) {
		boolean continuar = true;
		boolean operando = true;
		ListaDuplamenteEncadeada listaDuplamenteEncadeada = new ListaDuplamenteEncadeada();
		Scanner scanner = new Scanner(System.in);

		while (operando) {
			System.out.println("___________________________"
					+ "\n[1] - add(Posição, Valor); "
					+ "\n[2] - remove(Posição); "
					+ "\n[3] - set(Posição, Valor); "
					+ "\n[4] - size(); "
					+ "\n[5] - get(Posição); "
					+ "\n[6] - ShowLista()"
					+ "\n[7] - Encerrar Programa"
					+ "\n___________________________");

			String entrada = scanner.nextLine();

			switch(entrada){

			case ("1"):{
				continuar = true;
				while(continuar) {
					System.out.print("Digite a Posição desejada: ");
					int index = Integer.parseInt(scanner.nextLine());

					System.out.print("Digite o Elemento desejado: ");
					String elemento  = scanner.nextLine();
					listaDuplamenteEncadeada.add(index, elemento);
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
					System.out.print("Digite a Posição que você deseja remover: ");
					int posicao =Integer.parseInt(scanner.nextLine());
					listaDuplamenteEncadeada.remove(posicao);
					System.out.println("Deseja Remover mais um elemento?[S] or [N]");
					String resposta = scanner.nextLine();
					if(resposta.equalsIgnoreCase("n")) {
						continuar = false;
					} 
				}
				break;
			}

			case("3"):{

				System.out.print("Digite a Posição desejada: ");
				int index = Integer.parseInt(scanner.nextLine());

				System.out.print("Digite o Elemento desejado: ");
				String elemento  = scanner.nextLine();
				listaDuplamenteEncadeada.set(index, elemento);
				break;

			}case("4"):{
				System.out.println("Tamanho da lista: " + listaDuplamenteEncadeada.size());
				break;


			} case("5"):{

				System.out.print("Digite a Posição que deseja pegar o valor: ");
				int posicao = Integer.parseInt(scanner.nextLine());
				System.out.println(listaDuplamenteEncadeada.getElemento(posicao));
				break;

			}case("6"):{
				listaDuplamenteEncadeada.showLista();
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
		}
	}
}

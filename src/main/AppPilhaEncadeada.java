package main;

import java.util.Scanner;

import estruturadedados.PilhaEncadeada;

public class AppPilhaEncadeada {
	public static void main(String[] args) {
		boolean continuar = true;
		boolean operando = true;
		PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
		Scanner scanner = new Scanner(System.in);

		while (operando) {
			System.out.println("___________________________"
					+ "\n[1] - push(Valor); "
					+ "\n[2] - pop(); "
					+ "\n[3] - top(); "
					+ "\n[4] - size(); "
					+ "\n[5] - isEmpty(); "
					+ "\n[6] - showPilha()"
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
						pilhaEncadeada.push(elemento);
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
						System.out.println(pilhaEncadeada.pop());
						System.out.println("Deseja Remover mais um elemento?[S] or [N]");
						String resposta = scanner.nextLine();
						if(resposta.equalsIgnoreCase("n")) {
							continuar = false;
						} 
					}
					break;
				}

				case("3"):{
					System.out.println(pilhaEncadeada.top());
					break;

				}case("4"):{
					System.out.println("Tamanho da pilha: " + pilhaEncadeada.size());
					break;


				} case("5"):{
					System.out.println(pilhaEncadeada.isEmpty());
					break;

				}case("6"):{
					pilhaEncadeada.showPilha();
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

package main;

import java.util.Scanner;

import estruturadedados.Fila;

public class AppFila {
	public static void main(String[] args) {
		boolean continuar = true;
		boolean operando = true;
		Fila fila = new Fila(); 
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

			String entrada = scanner.nextLine();

			switch(entrada){

			case ("1"):{
				continuar = true;
				while(continuar) {
					System.out.print("Digite o Elemento desejado: ");
					String elemento  = scanner.nextLine();
					fila.enqueue(elemento);
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
					fila.dequeue();
					System.out.println("Deseja Remover mais um elemento?[S] or [N]");
					String resposta = scanner.nextLine();
					if(resposta.equalsIgnoreCase("n")) {
						continuar = false;
					} 
				}
				break;
			}

			case("3"):{
				System.out.print(fila.front());
				break;

			}case("4"):{
				System.out.println("Tamanho da fila: " + fila.size());
				break;


			} case("5"):{
				System.out.println(fila.isEmpty());
				break;

			}case("6"):{
				fila.showFila();
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

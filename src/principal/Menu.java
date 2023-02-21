package principal;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("|****************************************************|");
			System.out.println("|                                                    |");
			System.out.println("|                 TRIAGEM ACOLHIMENTO                |");
			System.out.println("|                                                    |");
			System.out.println("|****************************************************|");
			System.out.println("|            1 - IDOSA                               |");
			System.out.println("|            2 - GESTANTE OU COM CRIANÇA DE COLO     |");
			System.out.println("|            3 - DEFICIENTE                          |");
			System.out.println("|            4 - OUTROS                              |");
			System.out.println("******************************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("IDOSA\n");
				break;
			case 2:
				System.out.println("GESTANTE OU COM CRIANÇA DE COLO\n");
				break;
			case 3:
				System.out.println(" DEFICIENTE\n");
				break;
			case 4:
				System.out.println("OUTROS\n");
				break;
			default:
				System.err.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
}

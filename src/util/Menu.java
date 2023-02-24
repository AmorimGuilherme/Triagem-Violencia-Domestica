package util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import model.Pessoa;

public class Menu {

	private int opcao;
	Scanner scan = new Scanner(System.in);

	public void menuCadastro() {

		Queue<Pessoa> filaMulheres = new LinkedList<>();
		Pessoa pessoa = new Pessoa();

		String nomeMulher;
		int opcao;

		do {
			System.out.println("--------------------CADASTRO MULHER--------------------");
			System.out.println("(1) Adicionar mulher...................................");
			System.out.println("(2) listar todas as mulheres...........................");
			System.out.println("(3) retirar mulher do atendimento......................");
			System.out.println("(0) Sair...............................................");
			System.out.println("-------------------------------------------------------");
			System.out.println("\nPor favor, digite sua opção: ");
			opcao = scan.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("\nMenu Cadastro Finalizado!");
				break;
			case 1:
				System.out.print("\nInforme o nome: ");
				nomeMulher = scan.next();
				pessoa.setNome(nomeMulher);
				System.out.print("\nInforme a idade: ");
				int idadeMulher = scan.nextInt();
				pessoa.setIdade(idadeMulher);
				System.out.print("\nInforme o endereço: ");
				String enderecoMulher = scan.next();
				pessoa.setEndereco(enderecoMulher);
				filaMulheres.add(pessoa);
				break;
			case 2:
				if (!filaMulheres.isEmpty()) {
					System.out.println(filaMulheres);
				} else {
					System.err.println("Fila vazia!");
				}
				break;
			case 3:
				if (!filaMulheres.isEmpty()) {
					System.out.print("Informe a mulher a ser retirada: ");
					String mulherASerRetirada = scan.next();

				}

			}

		} while (opcao != 0);

	}
}
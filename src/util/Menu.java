package util;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.PessoaController;
import model.Pessoa;

public class Menu {

	private int opcao;
	PessoaController pessoaController = new PessoaController();
	Scanner scan = new Scanner(System.in);

	public void menuCadastro() {

		do {
			System.out.println("--------------------CADASTRO MULHER--------------------");
			System.out.println("(1) Adicionar mulher...................................");
			System.out.println("(2) listar todas as mulheres...........................");
			System.out.println("(3) retirar mulher do atendimento......................");
			System.out.println("(9) Sair...............................................");
			System.out.println("-------------------------------------------------------");
			System.out.println("\nPor favor, digite sua opção: ");
			try {
				opcao = scan.nextInt();

			} catch (InputMismatchException ex) {
				System.out.print("Digite valores inteiros: ");
				scan.next();
				opcao = 0;
			}

			switch (opcao) {
			case 9:
				System.out.println("\nMenu Cadastro Finalizado!");
				break;

			case 1:
				
				System.out.print("Informe o nome: ");
				String nome = scan.next();
				System.out.print("Informe o CPF: ");
				String cpf = scan.next();
				System.out.print("Informe a idade: ");
				int idade = scan.nextInt();
				System.out.print("Informe o endereço: ");
				String endereco = scan.next();
				int numeroDaPessoa = pessoaController.gerarNumero();
				Pessoa novaPessoa = new Pessoa(numeroDaPessoa, cpf, nome, idade, endereco);
				pessoaController.cadastrar(novaPessoa);
				break;

			case 2:
				pessoaController.listarTodasMulheres();
				break;

			case 3:
				System.out.print("Informe o ID do cadastro a ser deletado: ");
				int idCadastro = scan.nextInt();
				pessoaController.deletar(idCadastro);
				break;

			}

		} while (opcao != 9);

	}
}
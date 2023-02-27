package util;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.PessoaController;
import model.Pessoa;
import model.ViolenciaDomestica;
import model.ViolenciaFisica;
import model.ViolenciaMoral;
import model.ViolenciaPatrimonial;
import model.ViolenciaPsicologica;
import model.ViolenciaSexual;
import model.ViolenciaTrans;

public class Menu {

	private int opcao;
	PessoaController pessoaController = new PessoaController();
	Scanner scan = new Scanner(System.in);

	public void menuCadastro() {

		int idade = 0;
		String nome, cpf, endereco;

		do {
			System.out.println("\n\n--------------------CADASTRO MULHER--------------------");
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
				nome = scan.next();
				System.out.print("Informe o CPF: ");
				cpf = scan.nextLine();
				scan.nextLine();
				System.out.print("Informe a idade: ");

				try {
					idade = scan.nextInt();
				} catch (InputMismatchException ex) {
					System.err.println("Idade inválida!");
					scan.nextLine();
					System.out.print("Informe a idade novamente: ");
					idade = scan.nextInt();
				}

				System.out.print("Informe o endereço: ");
				endereco = scan.nextLine();
				scan.nextLine();
				int numeroDaPessoa = pessoaController.gerarNumero();
				Pessoa novaPessoa = new Pessoa(numeroDaPessoa, cpf, nome, idade, endereco);
				pessoaController.cadastrar(novaPessoa);
				menuViolencia();
				break;

			case 2:
				pessoaController.listarTodasMulheres();
				break;

			case 3:
				System.out.print("Informe o ID do cadastro a ser deletado: ");
				int idCadastro = scan.nextInt();
				pessoaController.deletar(idCadastro);
				break;
			default:
				System.err.println("Opção Inválida!");
				break;
			}

		} while (opcao != 9);

	}

	public void menuViolencia() {

		ViolenciaDomestica violencia = null;
		ViolenciaDomestica violenciaMulherTrans = null;
		boolean menu = true;

		do {
			System.out.println("\n\n---------TIPO DE VIOLÊNCIA DOMÉSTICA----------");
			System.out.println("(1) VIOLÊNCIA PSICOLÓGICA.........................");
			System.out.println("(2) VIOLÊNCIA FÍSICA..............................");
			System.out.println("(3) VIOLÊNCIA SEXUAL..............................");
			System.out.println("(4) VIOLÊNCIAL PATRIMONIAL........................");
			System.out.println("(5) VIOLÊNCIAL MORAL..............................");
			System.out.println("(9) SAIR..........................................");
			System.out.println("--------------------------------------------------");
			System.out.println("\nPor favor, digite sua opção: ");
			try {
				opcao = scan.nextInt();

			} catch (InputMismatchException ex) {
				System.out.print("Digite valores inteiros: ");
				scan.next();
				opcao = 0;
			}

			switch (opcao) {
			case 1:
				violencia = new ViolenciaPsicologica();
				menu = false;
				break;
			case 2:
				violencia = new ViolenciaFisica();
				menu = false;
				break;
			case 3:
				violencia = new ViolenciaSexual();
				menu = false;
				break;
			case 4:
				violencia = new ViolenciaPatrimonial();
				menu = false;
				break;
			case 5:
				violencia = new ViolenciaMoral();
				menu = false;
				break;
			case 9:
				System.out.println("\nVocê selecionou sair!\nObrigade por acessar nosso sistema!");
				menu = false;
				break;
			default:
				System.err.println("Opção Inválida!");
			}
		} while (menu);
		do {
			System.out.println("\n\n-------- VOCÊ É UMA MULHER TRANS? --------");
			System.out.println("(1) SIM.......................................");
			System.out.println("(2) NÃO.......................................");
			System.out.println("----------------------------------------------");
			System.out.println("\nPor favor, digite sua opção: ");

			try {
				opcao = scan.nextInt();

			} catch (InputMismatchException ex) {
				System.out.print("Digite valores inteiros: ");
				scan.next();
				opcao = 0;
			}

			switch (opcao) {
			case 1:
				System.out.println("Você escolheu SIM!");
				violenciaMulherTrans = new ViolenciaTrans();

				menu = false;
				break;
			case 2:
				System.out.println("Você escolheu \"NÃO" + "!");
				menu = false;
				break;
			default:
				System.err.println("Opção Inválida!");
			}

		} while (menu);
		do {

			System.out.println("\n\n-------- VOCÊ É FINANCEIRAMENTE DEPENDENTE? --------");
			System.out.println("(1) SIM.......................................");
			System.out.println("(2) NÃO.......................................");
			System.out.println("----------------------------------------------");
			System.out.println("\nPor favor, digite sua opção: ");

			try {
				opcao = scan.nextInt();

			} catch (InputMismatchException ex) {
				System.out.print("Digite valores inteiros: ");
				scan.next();
				opcao = 0;
			}

			switch (opcao) {
			case 1:
				System.out.println("Você escolheu SIM!");
				System.out.println("Você tem direito a 30% sobre os rendimentos do denunciade");

				menu = false;
				break;
			case 2:
				System.out.println("Você escolheu NÃO");
				menu = false;
				break;
			default:
				System.err.println("Opção Inválida!");
			}

		} while (menu);

		do {

			System.out.println("\n\n--------ATENDIMENTO FINALIZADO--------");
			System.out.println("(1) VISUALIZAR GUIA.......................");
			System.out.println("(9) SAIR..................................");
			System.out.println("------------------------------------------");

			System.out.println("\nPor favor, digite sua opção: ");
			try {
				opcao = scan.nextInt();

			} catch (InputMismatchException ex) {
				System.out.print("Digite valores inteiros: ");
				scan.next();
				opcao = 0;
			}

			switch (opcao) {
			case 1:
				violencia.emitirGuia();
				if (violenciaMulherTrans != null) {
					violenciaMulherTrans.emitirGuia();
				}
				menu = false;
				break;
			case 2:
				System.out.println("\\nVocê selecionou sair!\nObrigade por acessar nosso sistema!");
				menu = false;
				break;
			default:
				System.err.println("Opção Inválida!");
				menu = false;
			}
		} while (menu);

	}
}
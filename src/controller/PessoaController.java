package controller;

import java.util.ArrayList;

import model.Pessoa;
import repository.PessoaRepository;

public class PessoaController implements PessoaRepository {

	private ArrayList<Pessoa> listaMulheres = new ArrayList<Pessoa>();

	@Override
	public void procurarPorNumero(int numero) {
		var pessoa = buscarNaCollection(numero);

		if (pessoa != null)
			pessoa.visualizar();
		else
			System.out.println("\nA mulher nº " + numero + " não foi encontrada!");
	}

	@Override
	public void listarTodasMulheres() {
		for (var pessoa : listaMulheres) {
			pessoa.visualizar();
		}
	}

	@Override
	public void cadastrar(Pessoa pessoa) {
		listaMulheres.add(pessoa);
		System.out.println("\nA mulher nº " + pessoa.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(Pessoa pessoa) {
		var buscaPessoa = buscarNaCollection(pessoa.getNumero());

		if (buscaPessoa != null) {
			listaMulheres.set(listaMulheres.indexOf(buscaPessoa), pessoa);
			System.out.println("\nA mulher nº " + pessoa.getNumero() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nA mulher nº " + pessoa.getNumero() + " não foi encontrada!");
	}

	@Override
	public void deletar(int numero) {
		var pessoa = buscarNaCollection(numero);

		if (pessoa != null) {
			if (listaMulheres.remove(pessoa) == true)
				System.out.println("\nA mulher nº " + numero + " foi deletada com sucesso!");
		} else
			System.out.println("\nA mulher nº " + numero + " não foi encontrada!");
	}

	public int gerarNumero() {
		return listaMulheres.size() + 1;
	}

	public Pessoa buscarNaCollection(int numero) {
		for (var pessoa : listaMulheres) {
			if (pessoa.getNumero() == numero) {
				return pessoa;
			}
		}

		return null;
	}

}
package repository;

import model.Pessoa;

public interface PessoaRepository {

	public void procurarPorNumero(int numero);

	public void listarTodasMulheres();

	public void cadastrar(Pessoa pessoa);

	public void atualizar(Pessoa pessoa);

	public void deletar(int numero);

}

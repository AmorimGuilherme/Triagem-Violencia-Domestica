package model;

public class Pessoa {

	private int numero;
	private String cpf;
	private String nome;
	private int idade;
	private String endereco;

	public Pessoa() {
	}

	public Pessoa(int numero, String cpf, String nome, int idade, String endereco) {
		this.numero = numero;
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void visualizar() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Mulher:");
		System.out.println("***********************************************************");
		System.out.println("ID: " + getNumero());
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("***********************************************************\n");

	}
}
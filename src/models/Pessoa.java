package models;

import java.util.Objects;

public abstract class Pessoa {
	private String cpf;
	private String nome;

	public Pessoa(String cpf) {
		this.cpf = cpf;
	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pessoa pessoa = (Pessoa) o;
		return Objects.equals(cpf, pessoa.cpf);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
}

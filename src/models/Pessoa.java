package models;
import interfaces.InterfacePessoa;

public abstract class Pessoa implements InterfacePessoa{
	private String nome;
	
	Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}

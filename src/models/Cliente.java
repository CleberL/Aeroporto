package models;

public class Cliente extends Pessoa {
	private int id;

	Cliente(String nome, String cpf, int id) {
		super(nome, cpf);
		this.id = id;
	}	
}

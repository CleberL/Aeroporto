package models;

public class Cliente extends Pessoa {
	private int id;
	private

	Cliente(String nome, String cpf, int id) {
		super(nome, cpf);
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
}

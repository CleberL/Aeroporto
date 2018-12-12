package models;

public class Aviao {
	private int codigo;
	private int assentos;

	public Aviao(int codigo, int assentos) {
		this.codigo = codigo;
		this.assentos = assentos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

}

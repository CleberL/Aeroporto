package models;

public class Passagem{
	private int voo;
	private int codigo;
	private int cliente;
	
	Passagem(int voo, int codigo, int cliente) {
		this.voo = voo;
		this.codigo = codigo;
		this.cliente = cliente;
	}

	public int getVoo() {
		return voo;
	}

	public void setVoo(int voo) {
		this.voo = voo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
}
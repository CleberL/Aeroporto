package models;

public class Passagem{
	private int voo;
	private int codigo;
	private int cliente;
	private int assento;
	
	Passagem(int voo, int codigo, int cliente, int assento) {
		this.voo = voo;
		this.codigo = codigo;
		this.cliente = cliente;
		this.assento = assento;
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

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }
}
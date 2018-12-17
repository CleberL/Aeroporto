package models;

import java.util.Objects;

public class Passagem{
    private int codigo;
	private int voo;
	private int cliente;
	private int assento;

    public Passagem(int codigo) {
        this.codigo = codigo;
    }

    public Passagem(int codigo, int voo, int cliente, int assento) {
        this.codigo = codigo;
		this.voo = voo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passagem passagem = (Passagem) o;
        return codigo == passagem.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
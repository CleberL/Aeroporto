package models;

import java.util.Objects;

public class Aeronave {
	private int codigo;
	private int assentos;

	public Aeronave(int codigo){
		this.codigo = codigo;
	}

	Aeronave(int codigo, int assentos) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Aeronave aeronave = (Aeronave) o;
		return codigo == aeronave.codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
}

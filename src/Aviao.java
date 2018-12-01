
public class Aviao implements InterfaceAviao {
	private String cod;
	private int qtAssentos;
	private Piloto piloto;

	public Aviao(String cod, int assentos, Piloto piloto) {
		this.cod = cod;
		this.qtAssentos = assentos;
		this.piloto = piloto;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public int getQtAssentos() {
		return qtAssentos;
	}

	public void setQtAssentos(int qtAssentos) {
		this.qtAssentos = qtAssentos;
	}

}

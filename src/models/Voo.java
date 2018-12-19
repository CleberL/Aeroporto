package models;

import java.util.Date;
import java.util.Objects;
import java.util.ArrayList;

public class Voo {
	private int codigo;
	private int aeronave;
	private int qtAssentos;
	private String origem;
	private String destino;
	private String piloto;
	private Date horario;
	
	private ArrayList<Integer> ocupados = new ArrayList<Integer>();


    public Voo(int codigo) {
        this.codigo = codigo;
    }

    public Voo(int codigo, int aeronave, int qtAssentos, String origem, String destino, String piloto, Date horario) {
        this.codigo = codigo;
        this.aeronave = aeronave;
        this.setQtAssentos(qtAssentos);
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.horario = horario;
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAeronave() {
		return aeronave;
	}

	public void setAeronave(int aeronave) {
		this.aeronave = aeronave;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voo voo = (Voo) o;
        return codigo == voo.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

	public ArrayList<Integer> getOcupados() {
		return ocupados;
	}

	public void addOcupado(int assento) {
		ocupados.add(assento);
	}

	public int getQtAssentos() {
		return qtAssentos;
	}

	public void setQtAssentos(int qtAssentos) {
		this.qtAssentos = qtAssentos;
	}
	
	public void decrementarQtAssentos() {
		this.qtAssentos--;
	}
}

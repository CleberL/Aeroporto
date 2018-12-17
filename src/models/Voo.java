package models;

import java.util.Date;

public class Voo {
	private int codigo;
	private int aviao;
	private String origem;
	private String destino;
	private String piloto;
	private Date horario;

	public Voo(int codigo, int aviao, String origem, String destino, String piloto, Date horario) {
		this.codigo = codigo;
		this.aviao = aviao;
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

	public int getAviao() {
		return aviao;
	}

	public void setAviao(int aviao) {
		this.aviao = aviao;
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
}

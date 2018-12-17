package models;

import java.util.Date;

public class Voo {
	private int codigo;
	private int aviao;
	private String localOrigem;
	private String localDestino;
	private String piloto;
	private String copiloto;
	private Date horario;

	public Voo(int codigo, int aviao, String localOrigem, String localDestino, String piloto, String copiloto, Date horario) {
		this.codigo = codigo;
		this.aviao = aviao;
		this.localOrigem = localOrigem;
		this.localDestino = localDestino;
		this.piloto = piloto;
		this.copiloto = copiloto;
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

	public String getLocalOrigem() {
		return localOrigem;
	}

	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}

	public String getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getCopiloto() {
		return copiloto;
	}

	public void setCopiloto(String copiloto) {
		this.copiloto = copiloto;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}
}

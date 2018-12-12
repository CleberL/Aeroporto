package models;

import java.util.Date;

import models.interfaces.InterfaceVoo;

public class Voo implements InterfaceVoo{
	
	private int cod;
	private Aviao aviao;
	private Local origem;
	private Local destino;
	private Date data;
	
	public Voo(int cod, Aviao aviao, Local origem, Local destino, Date data) {
		this.cod = cod;
		this.aviao = aviao;
		this.origem = origem;
		this.destino = destino;
		this.data = data;
	}
	
	public Aviao getAviao() {
		return aviao;
	}
	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	public Local getOrigem() {
		return origem;
	}
	public void setOrigem(Local origem) {
		this.origem = origem;
	}
	public Local getDestino() {
		return destino;
	}
	public void setDestino(Local destino) {
		this.destino = destino;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

}

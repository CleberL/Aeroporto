package models;

import java.util.Date;

public class Voo {
	
	private int codigo;
	private Aeronave aviao;
	private Local origem;
	private Local destino;
	private Date data;
	
	public Voo(int codigo, Aeronave aviao, Local origem, Local destino, Date data) {
		this.codigo = codigo;
		this.aviao = aviao;
		this.origem = origem;
		this.destino = destino;
		this.data = data;
	}
	
	public Aeronave getAviao() {
		return aviao;
	}
	public void setAviao(Aeronave aviao) {
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}

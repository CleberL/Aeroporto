package models;

import java.util.Date;

public class Voo {
	
	private int codigo;
	private Aviao aviao;
	private Local origem;
	private Local destino;
	private Date data;
	
	public Voo(int codigo, Aviao aviao, Local origem, Local destino, Date data) {
		this.codigo = codigo;
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}

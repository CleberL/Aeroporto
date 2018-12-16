package models;
//import Interfaces.InterfacePassagem;

public class Passagem{
	
	private Voo voo;
	private int codigo;
	private Cliente cliente;
	
	public Passagem(Voo voo, int codigo, Cliente cliente) {
		this.voo = voo;
		this.codigo = codigo;
		this.cliente = cliente;
					
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return this.codigo;
		
	}
	
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	
	public Voo getVoo(){
		return this.voo;
		
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente(){
		return this.cliente;
		
	}
	
}	
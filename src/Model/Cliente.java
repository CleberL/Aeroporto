package Model;

import java.util.ArrayList;

import Interfaces.InterfaceCliente;

public class Cliente extends Pessoa implements InterfaceCliente{
	
	private ArrayList<Passagem> passagens = new ArrayList<Passagem>();
	
	public Cliente(String nome) {
		super(nome);
	}

	@Override
	public void comprarPassagem(String local) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarVoos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelarPassagem(int indice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarPassagens() {
		// TODO Auto-generated method stub
		
	}
	
}

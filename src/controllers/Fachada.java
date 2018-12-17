package controllers;

import controllers.interfaces.*;
import exception.PassagemException;

public class Fachada implements InterfaceFachada {
	private InterfaceControllerAeronave negAeronave = new ControllerAeronave();
	private InterfaceControllerCliente negCliente = new ControllerCliente();
	private InterfaceControllerAeroporto negLocal = new ControllerAeroporto();
	private InterfaceControllerPassagem negPassagem = new ControllerPassagem();
	
	@Override
	public void venderPassagem() throws PassagemException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void consultarPassagens() throws PassagemException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void cancelarPassagem(int cod) throws PassagemException {
		// TODO Auto-generated method stub
	}
	
}

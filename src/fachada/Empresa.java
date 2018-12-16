package fachada;

import exception.EmpresaException;
import negocios.*;
import negocios.interfaces.*;

public class Empresa implements InterfaceEmpresa{
	private InterfaceNegocioAeronave negAeronave = new NegocioAeronave();
	private	InterfaceNegocioCliente negCliente = new NegocioCliente();
	private InterfaceNegocioLocal negLocal = new NegocioLocal();
	private InterfaceNegocioPassagem negPassagem = new NegocioPassagem();
	
	@Override
	public void venderPassagem() throws EmpresaException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void consultarPassagens() throws EmpresaException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void cancelarPassagem(int cod) throws EmpresaException {
		// TODO Auto-generated method stub
	}
	
}

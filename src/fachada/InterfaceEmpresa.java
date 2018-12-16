package fachada;

import exception.EmpresaException;

public interface InterfaceEmpresa {

	public void venderPassagem() throws EmpresaException;

	public void consultarPassagens()throws EmpresaException;

	public void cancelarPassagem(int cod) throws EmpresaException;

}

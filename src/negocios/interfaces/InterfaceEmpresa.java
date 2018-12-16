package negocios.interfaces;

import exception.EmpresaException;

public interface InterfaceEmpresa {

	public void comprarPassagem() throws EmpresaException;

	public void consultarPassagens()throws EmpresaException;

	public void cancelarPassagem(int cod) throws EmpresaException;

}

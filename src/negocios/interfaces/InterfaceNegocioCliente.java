package negocios.interfaces;

import models.Cliente;

public interface InterfaceNegocioCliente{
	
	public void adicionarCliente(Cliente c);
	public void removerCliente(Cliente c);
	public Cliente procurarCliente(Cliente c);
	
}

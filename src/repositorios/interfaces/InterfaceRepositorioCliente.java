package repositorios.interfaces;

import models.Cliente;

public interface InterfaceRepositorioCliente
{
	
	public void adicionarCliente(Cliente c);
	public void removerCliente(Cliente c);
	public Cliente procurarCliente(Cliente c);	

}

package repositorios.interfaces;

import exception.ClienteException;
import models.Cliente;

public interface InterfaceRepositorioCliente
{
	
	public void adicionarCliente(Cliente c) throws ClienteException;
	public void removerCliente(Cliente c) throws ClienteException;
	public Cliente procurarCliente(int cpf);	

}

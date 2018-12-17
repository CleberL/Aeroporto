package repositorios.interfaces;

import exception.ClienteException;
import models.Cliente;

public interface InterfaceRepositorioCliente {

	void adicionar(Cliente cliente) throws ClienteException, NullPointerException;
	void remover(Cliente cliente) throws ClienteException;
	Cliente procurar(String cpf);

}

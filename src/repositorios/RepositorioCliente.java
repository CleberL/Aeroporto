package repositorios;

import repositorios.interfaces.InterfaceRepositorioCliente;
import exception.ClienteException;
import models.Cliente;
import java.util.ArrayList;

public class RepositorioCliente implements InterfaceRepositorioCliente {
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	@Override
	public void adicionar(Cliente cliente) throws ClienteException, NullPointerException {
		if(cliente == null) {
			throw new NullPointerException("PARAMETRO_INCORRETO");
		} else if(!clientes.contains(cliente)) {
			clientes.add(cliente);
		} else {
			throw new ClienteException("CLIENTE_JA_EXISTE");
		}
	}

	@Override
	public void remover(Cliente cliente) throws ClienteException {
		if(!clientes.remove(cliente)) {
			throw new ClienteException("CLIENTE_NAO_EXISTE");
		}
	}

	@Override
	public Cliente procurar(String cpf) {
		// TODO: verificar erro de cpf == null
		return clientes.get(clientes.indexOf(new Cliente(cpf)));
	}

	// TODO: fazer editar e listar
}

package repositorios;

import repositorios.interfaces.InterfaceRepositorioCliente;
import exception.ClienteException;
import models.Cliente;
import java.util.ArrayList;

public class RepositorioCliente implements InterfaceRepositorioCliente {
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public void adicionarCliente(Cliente cliente) throws NullPointerException, ClienteException {
		if (cliente == null) {
			throw new NullPointerException("CLIENTE_NULO");
		} else {
			if (procurarCliente(cliente.getCpf()) == null) {
				clientes.add(cliente);
			} else {
				throw new ClienteException("CLIENTE_JA_EXISTE");
			}
		}
	}

	public void removerCliente(Cliente cliente) throws NullPointerException, ClienteException {
		if (cliente == null) {
			throw new NullPointerException("CLIENTE_NULO");
		} else {
			if (procurarCliente(cliente.getCpf()) != null) {
				clientes.remove(cliente);
			} else {
				throw new ClienteException("CLIENTE_NAO_EXISTE");
			}
		}
	}

	// duvida
	public Cliente procurarCliente(String cpf) {
		Cliente ret = null;

		for (Cliente c : clientes) {
			if (c.getCpf() == cpf) {
				ret = c;
			}
		}

		return ret;
	}

}

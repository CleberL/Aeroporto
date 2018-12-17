package controllers.interfaces;

import exception.ClienteException;
import models.Cliente;

public interface InterfaceControllerCliente {

    int registrarCliente(String nome, String cpf) throws ClienteException;
    Cliente consultarCliente(int codCliente) throws ClienteException;
    void modificarCliente(Cliente cliente) throws ClienteException;

}

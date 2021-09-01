package controllers;

import controllers.interfaces.InterfaceControllerCliente;
import exception.ClienteException;
import exception.InvalidInputException;
import exception.NotFoundException;
import models.Cliente;
import repositorios.RepositorioCliente;
import repositorios.interfaces.InterfaceRepositorioCliente;

public class ControllerCliente implements InterfaceControllerCliente {

    InterfaceRepositorioCliente repCliente = new RepositorioCliente();

    @Override
    public void adicionar(String nome, String cpf) throws InvalidInputException {
        Cliente cliente = new Cliente(nome, cpf);

        // TODO validar cpf

        try {
            repCliente.adicionar(cliente);
        } catch(ClienteException e) {
            throw new InvalidInputException("CLIENTE_DUPLICADO");
        } catch (NullPointerException e) {
            throw new InvalidInputException("CLIENTE");
        }
    }

    @Override
    public Cliente procurar(String cpf) throws NotFoundException {
        Cliente cliente = repCliente.procurar(cpf);

        if(cliente == null) {
            throw new NotFoundException("CLIENTE");
        }

        return cliente;
    }
}

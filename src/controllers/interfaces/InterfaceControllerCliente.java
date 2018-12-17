package controllers.interfaces;

import exception.InvalidInputException;
import exception.NotFoundException;
import models.Cliente;

public interface InterfaceControllerCliente {

    void adicionar(String nome, String cpf) throws InvalidInputException;
    Cliente procurar(String cpf) throws NotFoundException;

}

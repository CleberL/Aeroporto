package controllers.interfaces;

import exception.InvalidInputException;
import exception.NotFoundException;
import models.Piloto;

public interface InterfaceControllerPiloto {

    void adicionar(String nome, String cpf) throws InvalidInputException;
    Piloto procurar(String cpf) throws NotFoundException;

}

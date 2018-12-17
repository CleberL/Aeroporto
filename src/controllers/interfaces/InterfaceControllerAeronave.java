package controllers.interfaces;

import exception.InvalidInputException;
import exception.NotFoundException;
import models.Aeronave;

public interface InterfaceControllerAeronave {

    int adicionar(int assentos) throws InvalidInputException;
    void remover(int codigo) throws NotFoundException, InvalidInputException;
    Aeronave procurar(int codigo) throws NotFoundException;

}

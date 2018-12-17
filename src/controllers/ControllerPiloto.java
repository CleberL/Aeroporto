package controllers;

import controllers.interfaces.InterfaceControllerPiloto;
import exception.InvalidInputException;
import exception.NotFoundException;
import exception.PilotoException;
import models.Piloto;
import repositorios.RepositorioPiloto;
import repositorios.interfaces.InterfaceRepositorioPiloto;

public class ControllerPiloto implements InterfaceControllerPiloto {

    InterfaceRepositorioPiloto repPiloto = new RepositorioPiloto();

    @Override
    public void adicionar(String nome, String cpf) throws InvalidInputException {
        Piloto piloto = new Piloto(nome, cpf);

        // TODO validar cpf

        try {
            repPiloto.adicionar(piloto);
        } catch(PilotoException e) {
            throw new InvalidInputException("PILOTO_DUPLICADO");
        } catch (NullPointerException e) {
            throw new InvalidInputException("PILOTO");
        }
    }

    @Override
    public Piloto procurar(String cpf) throws NotFoundException {
        Piloto piloto = repPiloto.procurar(cpf);

        if(piloto == null) {
            throw new NotFoundException("PILOTO");
        }

        return piloto;
    }
}

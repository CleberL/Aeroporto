package controllers;

import controllers.interfaces.InterfaceControllerAeronave;
import exception.AeronaveException;
import exception.InvalidInputException;
import exception.NotFoundException;
import models.Aeronave;
import repositorios.RepositorioAeronave;
import repositorios.interfaces.InterfaceRepositorioAeronave;

import java.util.Random;

public class ControllerAeronave implements InterfaceControllerAeronave {

	InterfaceRepositorioAeronave repAeronave = new RepositorioAeronave();

	@Override
	public int adicionar(int assentos) throws InvalidInputException {
        Random random = new Random();
        int codigo = random.nextInt(99999);

        Aeronave aeronave = new Aeronave(codigo, assentos);

        try {
            repAeronave.adicionar(aeronave);
        } catch(AeronaveException e) {
            codigo = adicionar(assentos);
        } catch (NullPointerException e) {
            throw new InvalidInputException("AERONAVE");
        }

        return codigo;
	}

    @Override
	public void remover(int codigo) throws NotFoundException, InvalidInputException {
	    try {
            repAeronave.remover(new Aeronave(codigo));
        } catch (AeronaveException e) {
	        throw new NotFoundException("AERONAVE");
        } catch (NullPointerException e) {
	        throw new InvalidInputException("AERONAVE");
        }
	}

    @Override
    public Aeronave procurar(int codigo) throws NotFoundException {
        Aeronave aeronave = repAeronave.procurar(codigo);

        if(aeronave == null) {
            throw new NotFoundException("AERONAVE");
        }

        return aeronave;
    }

}

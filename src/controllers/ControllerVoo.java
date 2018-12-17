package controllers;

import controllers.interfaces.InterfaceControllerVoo;
import exception.InvalidInputException;
import exception.NotFoundException;
import exception.VooException;
import models.Voo;
import repositorios.RepositorioVoo;
import repositorios.interfaces.InterfaceRepositorioVoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ControllerVoo implements InterfaceControllerVoo {

    InterfaceRepositorioVoo repVoo = new RepositorioVoo();

    @Override
    public int adicionar(int aeronave, String origem, String destino, String piloto, Date horario) throws InvalidInputException {
        Random random = new Random();
        int codigo = random.nextInt(99999);

        Voo voo = new Voo(codigo, aeronave, origem, destino, piloto, horario);

        try {
            repVoo.adicionar(voo);
        } catch(VooException e) {
            codigo = adicionar(aeronave, origem, destino, piloto, horario);
        } catch (NullPointerException e) {
            throw new InvalidInputException("VOO");
        }

        return codigo;
    }

    @Override
    public void remover(int codigo) throws NotFoundException, InvalidInputException {
        try {
            repVoo.remover(new Voo(codigo));
        } catch (VooException e) {
            throw new NotFoundException("VOO");
        } catch (NullPointerException e) {
            throw new InvalidInputException("VOO");
        }
    }

    @Override
    public Voo procurar(int codigo) throws NotFoundException {
        Voo voo = repVoo.procurar(codigo);

        if(voo == null) {
            throw new NotFoundException("VOO");
        }

        return voo;
    }

    @Override
    public ArrayList<Voo> listar() {
        return repVoo.listar();
    }

}

package repositorios.interfaces;

import exception.VooException;
import models.Voo;

import java.util.ArrayList;

public interface InterfaceRepositorioVoo {

    Voo procurar(int codigo);
    void adicionar(Voo voo) throws VooException, NullPointerException;
    void remover(Voo voo) throws VooException;
    ArrayList<Voo> listar();

}

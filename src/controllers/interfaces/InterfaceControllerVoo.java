package controllers.interfaces;

import exception.InvalidInputException;
import exception.NotFoundException;
import models.Voo;

import java.util.ArrayList;
import java.util.Date;

public interface InterfaceControllerVoo {

	public int adicionar(int aeronave, int assentos, String origem, String destino, String piloto, Date horario) throws InvalidInputException;
    void remover(int codigo) throws NotFoundException, InvalidInputException;
    Voo procurar(int codigo) throws NotFoundException;
    ArrayList<Voo> listar();
	public void decrementarQtAssentos(int codVoo);
    boolean verificarAssento(int codVoo, int assento);
    void adicionarOcupado(int codVoo, int assento);
}

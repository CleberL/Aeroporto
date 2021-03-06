package controllers.interfaces;


import exception.InvalidInputException;
import exception.NotFoundException;
import models.Passagem;

public interface InterfaceControllerPassagem {
	
	int adicionar(String cpfCliente, int voo, int assento) throws InvalidInputException;
	void remover(int codigo) throws NotFoundException, InvalidInputException;
	Passagem procurar(int codigo) throws NotFoundException;
}

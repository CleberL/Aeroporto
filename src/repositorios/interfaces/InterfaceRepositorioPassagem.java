package repositorios.interfaces;

import exception.PassagemException;
import models.Passagem;

public interface InterfaceRepositorioPassagem {

	Passagem procurar(int codigo);
	void adicionar(Passagem passagem) throws PassagemException, NullPointerException;
	void remover(Passagem passagem) throws PassagemException;

}
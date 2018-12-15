package repositorios.interfaces;

import exception.PassagemException;
import models.Passagem;

public interface InterfaceRepositorioPassagem {

	Passagem procurarPassagem(int codigo) throws PassagemException;
	void adicionarPassagem(Passagem passagem) throws PassagemException, NullPointerException;
	void removerPassagem(Passagem passagem) throws PassagemException, NullPointerException;

	
}
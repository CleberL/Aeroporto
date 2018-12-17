package controllers;

import exception.PassagemException;
import controllers.interfaces.InterfaceControllerPassagem;
import models.Passagem;
import repositorios.RepositorioPassagem;
import repositorios.interfaces.InterfaceRepositorioPassagem;

public class ControllerPassagem implements InterfaceControllerPassagem {
	InterfaceRepositorioPassagem repPassagem = (InterfaceRepositorioPassagem) new RepositorioPassagem();

	public Passagem procurarPassagem(int codigo) throws PassagemException {
		Passagem retorno = null;

		try {
			retorno = repPassagem.procurarPassagem(codigo);
		} catch (PassagemException e) {
			throw new PassagemException("");
		}

		return retorno;
	}

	public void adicionarPassagem(Passagem passagem) {
		// TODO Auto-generated method stub

	}

	public void removerPassagem(Passagem passagem) {
		// TODO Auto-generated method stub

	}

}

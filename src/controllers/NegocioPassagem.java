package controllers;

import exception.PassagemException;
import controllers.interfaces.InterfaceNegocioPassagem;
import models.Passagem;
import repositorios.RepositorioPassagem;
import repositorios.interfaces.InterfaceRepositorioPassagem;

public class NegocioPassagem implements InterfaceNegocioPassagem {
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

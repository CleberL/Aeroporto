package controllers;

import controllers.interfaces.InterfaceNegocioAeronave;
import exception.AeronaveException;
import models.Aeronave;
import repositorios.RepositorioAeronave;
import repositorios.interfaces.InterfaceRepositorioAeronave;

public class NegocioAeronave implements InterfaceNegocioAeronave {
	InterfaceRepositorioAeronave repAeronave = new RepositorioAeronave();

	public Aeronave procurarAeronave(int codigo) throws AeronaveException {
		Aeronave retorno = null;

		try {
			retorno = repAeronave.procurarAeronave(codigo);
		} catch (AeronaveException e) {
			throw new AeronaveException("");
		}

		return retorno;
	}

	public void adicionarAeronave(Aeronave aeronave) throws AeronaveException, NullPointerException {
		try {
			repAeronave.adicionarAeronave(aeronave);
		} catch (AeronaveException e) {
			throw new AeronaveException("");
		} catch (NullPointerException e) {
			throw new NullPointerException("");
		}
	}

	public void removerAeronave(Aeronave aeronave) throws AeronaveException, NullPointerException {
		try {
			repAeronave.removerAeronave(aeronave);
		} catch (AeronaveException e) {
			throw new AeronaveException("");
		} catch (NullPointerException e) {
			throw new NullPointerException("");
		}

	}

}

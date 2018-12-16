package negocios;

import exception.AeronaveException;
import exception.NegocioAeronaveException;
import models.Aeronave;
import negocios.interfaces.InterfaceNegocioAeronave;
import repositorios.RepositorioAeronave;
import repositorios.interfaces.InterfaceRepositorioAeronave;

public class NegocioAeronave implements InterfaceNegocioAeronave {
	InterfaceRepositorioAeronave repAeronave = new RepositorioAeronave();

	public Aeronave procurarAeronave(int codigo) throws NegocioAeronaveException {
		Aeronave retorno = null;

		try {
			retorno = repAeronave.procurarAeronave(codigo);
		} catch (AeronaveException e) {
			throw new NegocioAeronaveException("");
		}

		return retorno;
	}

	public void adicionarAeronave(Aeronave aeronave) throws NegocioAeronaveException, NullPointerException {
		try {
			repAeronave.adicionarAeronave(aeronave);
		} catch (AeronaveException e) {
			throw new NegocioAeronaveException("");
		} catch (NullPointerException e) {
			throw new NullPointerException("");
		}
	}

	public void removerAeronave(Aeronave aeronave) throws NegocioAeronaveException, NullPointerException {
		try {
			repAeronave.removerAeronave(aeronave);
		} catch (AeronaveException e) {
			throw new NegocioAeronaveException("");
		} catch (NullPointerException e) {
			throw new NullPointerException("");
		}

	}

}

package repositorios;

import java.util.ArrayList;

import exception.AeronaveException;
import models.Aeronave;
import repositorios.interfaces.InterfaceRepositorioAeronave;

public class RepositorioAeronave implements InterfaceRepositorioAeronave {

	ArrayList<Aeronave> aeronaves = new ArrayList<Aeronave>();

	public void adicionarAeronave(Aeronave a) throws AeronaveException, NullPointerException {

		if (a == null) {
			throw new NullPointerException("AERONAVE_NULO");
		} else {
			try {
				if (procurarAeronave(a.getCodigo()) != null)
					aeronaves.add(a);
			} catch (AeronaveException e) {
				throw new AeronaveException("AERONAVE_NAO_ENCONTRADO");
				//acho que ta errado. Pessoalmente explico
			}
		}
	}

	public void removerAeronave(Aeronave a) throws AeronaveException, NullPointerException {

		if (a == null) {
			throw new NullPointerException("AERONAVE_NULO");
		} else {
			try {
				if (procurarAeronave(a.getCodigo()) != null)
					aeronaves.remove(a);
			} catch (AeronaveException e) {
				throw new AeronaveException("AERONAVE_NAO_ENCONTRADO");
			}
		}
	}

	public Aeronave procurarAeronave(int cod) throws AeronaveException {
		Aeronave ret = null;

		for (Aeronave aeronave : aeronaves) {
			if (aeronave.getCodigo() == cod) {
				ret = aeronave;
			}
		}
		if (ret != null) {
			return ret;
		} else {
			throw new AeronaveException("AERONAVE_NAO_ENCONTRADO");
		}
	}

}
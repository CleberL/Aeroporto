package repositorios;

import java.util.ArrayList;

import exception.AeronaveException;
import models.Aeronave;
import repositorios.interfaces.InterfaceRepositorioAeronave;

public class RepositorioAeronave implements InterfaceRepositorioAeronave {

	ArrayList<Aeronave> aeronaves = new ArrayList<Aeronave>();

	public void adicionarAviao(Aeronave a) throws AeronaveException, NullPointerException {

		if (a == null) {
			throw new NullPointerException("AERONAVE_NULO");
		} else {
			try {
				if (procurarAviao(a.getCodigo()) != null)
					aeronaves.add(a);
			} catch (AeronaveException e) {
				throw new AeronaveException("AERONAVE_NAO_ENCONTRADO");
			}
		}
	}

	public void removerAviao(Aeronave a) throws AeronaveException, NullPointerException {

		if (a == null) {
			throw new NullPointerException("AERONAVE_NULO");
		} else {
			try {
				if (procurarAviao(a.getCodigo()) != null)
					aeronaves.remove(a);
			} catch (AeronaveException e) {
				throw new AeronaveException("AERONAVE_NAO_ENCONTRADO");
			}
		}
	}

	public Aeronave procurarAviao(int cod) throws AeronaveException {
		Aeronave ret = null;

		for (Aeronave aviao : aeronaves) {
			if (aviao.getCodigo() == cod) {
				ret = aviao;
			}
		}
		if (ret != null) {
			return ret;
		} else {
			throw new AeronaveException("AERONAVE_NAO_ENCONTRADO");
		}

	}

}
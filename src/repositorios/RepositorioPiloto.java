package repositorios;

import java.util.ArrayList;

import exception.PilotoException;
import models.Piloto;
import repositorios.interfaces.InterfaceRepositorioPiloto;

public class RepositorioPiloto implements InterfaceRepositorioPiloto {
	
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	
	public void adicionarPiloto(Piloto a) throws PilotoException, NullPointerException {

		if (a == null) {
			throw new NullPointerException("PILOTO_NULO");
		} else {
			try {
				if (procurarPiloto(a.getCpf()) != null)
					pilotos.add(a);
			} catch (PilotoException e) {
				throw new PilotoException("PILOTO_NAO_ENCONTRADO");
			}
		}
	}

	public void removerPiloto(Piloto a) throws PilotoException, NullPointerException {

		if (a == null) {
			throw new NullPointerException("PILOTO_NULO");
		} else {
			try {
				if (procurarPiloto(a.getCpf()) != null)
					pilotos.remove(a);
			} catch (PilotoException e) {
				throw new PilotoException("PILOTO_NAO_ENCONTRADO");
			}
		}
	}

	public Piloto procurarPiloto(String cpf) throws PilotoException {
		Piloto ret = null;

		for (Piloto piloto : pilotos) {
			if (piloto.getCpf() == cpf) {
				ret = piloto;
			}
		}
		if (ret != null) {
			return ret;
		} else {
			throw new PilotoException("PILOTO_NAO_ENCONTRADO");
		}
	}

	
}

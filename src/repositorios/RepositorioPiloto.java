package repositorios;

import java.util.ArrayList;

import exception.PilotoException;
import models.Piloto;
import repositorios.interfaces.InterfaceRepositorioPiloto;

public class RepositorioPiloto implements InterfaceRepositorioPiloto {
	
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

	@Override
	public void adicionar(Piloto piloto) throws PilotoException, NullPointerException {
		if(piloto == null) {
			throw new NullPointerException("PARAMETRO_INCORRETO");
		} else if(!pilotos.contains(piloto)) {
			pilotos.add(piloto);
		} else {
			throw new PilotoException("PILOTO_JA_EXISTE");
		}
	}

	@Override
	public void remover(Piloto piloto) throws PilotoException {
		if(!pilotos.remove(piloto)) {
			throw new PilotoException("PILOTO_NAO_EXISTE");
		}
	}

	@Override
	public Piloto procurar(String cpf) {
		return pilotos.get(pilotos.indexOf(new Piloto(cpf)));
	}

	// TODO: fazer editar e listar
}

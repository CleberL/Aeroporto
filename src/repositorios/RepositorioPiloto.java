package repositorios;

import java.util.ArrayList;
import exception.PilotoException;
import models.Piloto;

public class RepositorioPiloto {
	
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	
	void addPiloto(Piloto p) throws PilotoException {
		if (p == null) {
			throw new PilotoException("Piloto nulo");
		} else {
			pilotos.add(p);
		}
	}
	
	void removePiloto(Piloto p) throws PilotoException{
		if (p == null) {
			throw new PilotoException("Piloto nulo");
		} else {
			pilotos.remove(p);
		}
	}
	
}

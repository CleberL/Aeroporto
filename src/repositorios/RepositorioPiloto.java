package repositorios;

import java.util.ArrayList;


import exception.PilotoException;
import models.Piloto;

public class RepositorioPiloto {
	
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	
	public void adicionarPiloto(Piloto p) throws PilotoException, NullPointerException {

		if (p == null) {
			throw new NullPointerException("PILOTO_NULO");
		} else if(procurarPiloto(p.getNome()) != null) {
			throw new PilotoException("PILOTO_JA_CADASTRADO");
		}else{
			pilotos.add(p);
		}
	}

	public void removerAviao(Piloto p) throws PilotoException, NullPointerException {

		if (p == null) {
			throw new NullPointerException("PILOTO_NULO");
		} else if(procurarPiloto(p.getNome())==null) {
			throw new PilotoException("PILOTO_NAO_ENCONTRADO");
		}else{
			pilotos.remove(p);
		}
	}
	
	public Piloto procurarPiloto(String nome) throws PilotoException{
		Piloto ret = null;
		
		for(Piloto piloto : pilotos) {
			if(piloto.getNome() == nome) {
				ret = piloto;
			}
		}
		if(ret!=null) {
			return ret;
		}else {
			throw new PilotoException("PILOTO_NAO_ENCONTRADO");
		}
		
		
	}
	
}

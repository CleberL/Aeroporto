package repositorios;

import java.util.ArrayList;

import exception.AeronaveException;
import models.Aeronave;
import repositorios.interfaces.InterfaceRepositorioAeronave;

public class RepositorioAeronave implements InterfaceRepositorioAeronave {

	ArrayList<Aeronave> aeronaves = new ArrayList<Aeronave>();

    @Override
	public void adicionar(Aeronave aeronave) throws AeronaveException, NullPointerException {
        if(aeronave == null) {
            throw new NullPointerException("PARAMETRO_INCORRETO");
        } else if(!aeronaves.contains(aeronave)) {
            aeronaves.add(aeronave);
        } else {
            throw new AeronaveException("AERONAVE_JA_EXISTE");
        }
	}

    @Override
	public void remover(Aeronave aeronave) throws AeronaveException {
		if(!aeronaves.remove(aeronave)) {
		    throw new AeronaveException("AERONAVE_NAO_EXISTE");
        }
	}

    @Override
	public Aeronave procurar(int codigo) {
    	for(Aeronave aeronave : aeronaves) {
			if(aeronave.equals(new Aeronave(codigo))) {
				return aeronave;
			}
		}
		return null;
		
	}
}
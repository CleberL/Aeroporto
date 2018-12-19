package repositorios;

import java.util.ArrayList;

import exception.VooException;
import models.Voo;
import repositorios.interfaces.InterfaceRepositorioVoo;

public class RepositorioVoo implements InterfaceRepositorioVoo {

	private ArrayList<Voo> voos = new ArrayList<Voo>();


	@Override
	public void adicionar(Voo voo) throws VooException, NullPointerException {
		if(voo == null) {
			throw new NullPointerException("PARAMETRO_INCORRETO");
		} else if(!voos.contains(voo)) {
			voos.add(voo);
		} else {
			throw new VooException("VOO_JA_EXISTE");
		}
	}

	@Override
	public void remover(Voo voo) throws VooException {
		if(!voos.remove(voo)) {
			throw new VooException("VOO_NAO_EXISTE");
		}
	}


	@Override
	public Voo procurar(int codigo) {
		for(Voo voo : voos) {
			if(voo.equals(new Voo(codigo))) {
				return voo;
			}
		}
		return null;
		
	}

	@Override
	public ArrayList<Voo> listar() {
		return voos;
	}

}

package repositorios;

import java.util.ArrayList;

import exception.AviaoException;
import models.interfaces.InterfaceAviao;

public class RepositorioAviao {

	ArrayList<InterfaceAviao> avioes = new ArrayList<InterfaceAviao>();

	public void addAviao(InterfaceAviao a) throws AviaoException {

		if (a == null) {
			throw new AviaoException("Avião nulo");
		} else if(buscar(a.getCod()) != null) {
			throw new AviaoException("Avião já adicionado");
		}else{
			avioes.add(a);
		}
	}

	public void removeAviao(InterfaceAviao a) throws AviaoException {

		if (a == null) {
			throw new AviaoException("Avião nulo");
		} else if(buscar(a.getCod())==null) {
			throw new AviaoException("não existe");
		}else{
			avioes.remove(a);
		}
	}
	
	public InterfaceAviao buscar(String cod){
		InterfaceAviao ret = null;
		
		for(InterfaceAviao aviao : avioes) {
			if(aviao.getCod() == cod) {
				ret = aviao;
			}
		}
		return ret;
	}
}
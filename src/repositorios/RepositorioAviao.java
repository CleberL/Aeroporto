package repositorios;

import java.util.ArrayList;

import exception.AviaoException;
import models.Aviao;
import repositorios.interfaces.InterfaceRepositorioAviao;

public class RepositorioAviao implements InterfaceRepositorioAviao {

	ArrayList<Aviao> avioes = new ArrayList<Aviao>();

	public void adicionarAviao(Aviao a) throws AviaoException {

		if (a == null) {
			throw new NullPointerException("AVIAO_NULO");
		} else if(procurarAviao(a.getCodigo()) != null) {
			throw new AviaoException("AVIAO_JA_CADASTRADO");
		}else{
			avioes.add(a);
		}
	}

	public void removerAviao(Aviao a) throws AviaoException {

		if (a == null) {
			throw new NullPointerException("AVIAO_NULO");
		} else if(procurarAviao(a.getCodigo())==null) {
			throw new AviaoException("AVIAO_NAO_ENCONTRADO");
		}else{
			avioes.remove(a);
		}
	}
	
	public Aviao procurarAviao(int cod) throws AviaoException{
		Aviao ret = null;
		
		for(Aviao aviao : avioes) {
			if(aviao.getCodigo() == cod) {
				ret = aviao;
			}
		}
		if(ret!=null) {
			return ret;
		}else {
			throw new AviaoException("AVIAO_NAO_ENCONTRADO");
		}
		
		
	}

	public void editarAviao(Aviao a) throws AviaoException {
		
		if (a == null) {
			throw new NullPointerException("AVIAO_NULO");
		} else if(procurarAviao(a.getCodigo())==null) {
			throw new AviaoException("AVIAO_NAO_ENCONTRADO");
		}else {
			//TODO edita alguma coisa ae
		}
	}
	
}
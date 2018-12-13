package negocios;

import exception.AviaoException;
import exception.NegocioAviaoException;
import models.Aviao;
import negocios.interfaces.InterfaceNegocioAviao;
import repositorios.RepositorioAviao;
import repositorios.interfaces.InterfaceRepositorioAviao;

public class NegocioAviao implements InterfaceNegocioAviao {
	InterfaceRepositorioAviao repAviao = new RepositorioAviao();
	
	@Override
	public Aviao procurarAviao(int codigo) throws NegocioAviaoException{
		Aviao retorno = null;
		
		try {
			retorno = repAviao.procurarAviao(codigo);
		}catch(AviaoException e) {
			throw new NegocioAviaoException("");
		}
		
		return retorno;
	}

	@Override
	public void adicionarAviao(Aviao aviao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAviao(Aviao aviao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarAviao(Aviao aviao) {
		// TODO Auto-generated method stub
		
	}
	
}

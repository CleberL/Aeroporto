package negocios;

import exception.AviaoException;
import exception.NegocioAviaoException;
import models.Aeronave;
import negocios.interfaces.InterfaceNegocioAeronave;
import repositorios.RepositorioAeronave;
import repositorios.interfaces.InterfaceRepositorioAeronave;

public class NegocioAeronave implements InterfaceNegocioAeronave {
	InterfaceRepositorioAeronave repAeronave = new RepositorioAeronave();
	
	@Override
	public Aeronave procurarAviao(int codigo) throws NegocioAviaoException{
		Aeronave retorno = null;
		
		try {
			retorno = repAeronave.procurarAviao(codigo);
		}catch(AviaoException e) {
			throw new NegocioAviaoException("");
		}
		
		return retorno;
	}

	@Override
	public void adicionarAviao(Aeronave aeronave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAviao(Aeronave aeronave) {
		// TODO Auto-generated method stub
		
	}
	
}

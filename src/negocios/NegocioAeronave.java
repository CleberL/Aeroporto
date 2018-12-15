package negocios;

import exception.AeronaveException;
import exception.NegocioAeronaveException;
import models.Aeronave;
import negocios.interfaces.InterfaceNegocioAeronave;
import repositorios.RepositorioAeronave;
import repositorios.interfaces.InterfaceRepositorioAeronave;

public class NegocioAeronave implements InterfaceNegocioAeronave {
	InterfaceRepositorioAeronave repAeronave = new RepositorioAeronave();
	
	@Override
	public Aeronave procurarAeronave(int codigo) throws NegocioAeronaveException{
		Aeronave retorno = null;
		
		try {
			retorno = repAeronave.procurarAeronave(codigo);
		}catch(AeronaveException e) {
			throw new NegocioAeronaveException("");
		}
		
		return retorno;
	}

	@Override
	public void adicionarAeronave(Aeronave aeronave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAeronave(Aeronave aeronave) {
		// TODO Auto-generated method stub
		
	}
	
}

package negocios;

import exception.PassagemException;
import exception.NegocioPassagemException;
import models.Passagem;
import negocios.interfaces.InterfaceNegocioPassagem;
import repositorios.RepositorioPassagem;
import repositorios.interfaces.InterfaceRepositorioPassagem;

public class NegocioPassagem implements InterfaceNegocioPassagem {
	InterfaceRepositorioPassagem repPassagem = (InterfaceRepositorioPassagem) new RepositorioPassagem();
	
	public Passagem procurarPassagem(int codigo) throws NegocioPassagemException{
		Passagem retorno = null;
		
		try {
			retorno = repPassagem.procurarPassagem(codigo);
		}catch(PassagemException e) {
			throw new NegocioPassagemException("");
		}
		
		return retorno;
	}

	public void adicionarPassagem(Passagem passagem) {
		// TODO Auto-generated method stub
		
	}

	public void removerPassagem(Passagem passagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Passagem procurarAeronave(int codigo) throws NegocioPassagemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarAeronave(Passagem passagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAeronave(Passagem passagem) {
		// TODO Auto-generated method stub
		
	}
	
}


package repositorios;

import java.util.ArrayList;


import exception.PassagemException;
import models.Passagem;
import repositorios.interfaces.InterfaceRepositorioPassagem;

public class RepositorioPassagem implements InterfaceRepositorioPassagem {
	
	private ArrayList<Passagem> passagens = new ArrayList<Passagem>();


	@Override
	public void adicionar(Passagem passagem) throws PassagemException, NullPointerException {
		if(passagem == null) {
			throw new NullPointerException("PARAMETRO_INCORRETO");
		} else if(!passagens.contains(passagem)) {
			passagens.add(passagem);
		} else {
			throw new PassagemException("PASSAGEM_JA_EXISTE");
		}
	}

	@Override
	public void remover(Passagem passagem) throws PassagemException {
		if(!passagens.remove(passagem)) {
			throw new PassagemException("PASSAGEM_NAO_EXISTE");
		}
	}

	@Override
	public Passagem procurar(int codigo) {
		for(Passagem passagem : passagens) {
			if(passagem.equals(new Passagem(codigo))) {
				return passagem;
			}
		}
		return null;
		
	}

	// TODO: fazer listar
}

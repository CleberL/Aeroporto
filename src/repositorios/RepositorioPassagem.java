package repositorios;

import java.util.ArrayList;


import exception.PassagemException;
import models.Passagem;

public class RepositorioPassagem {
	
	private ArrayList<Passagem> passagens = new ArrayList<Passagem>();
	
	public void adicionarPassagem(Passagem nova) throws PassagemException, NullPointerException {

		if (nova == null) {
			throw new NullPointerException("PASSAGEM_NULA");
		} else {
			try {
				if (procurarPassagem(nova.getCodigo()) != null)
					passagens.add(nova);
			} catch (PassagemException e) {
				throw new PassagemException("PASSAGEM_NAO_ENCONTRADA");
			}
		}
	}

	public Passagem procurarPassagem(int codigo) throws PassagemException {
		Passagem ret = null;

		for (Passagem passagem : passagens) {
			if(passagem.getCodigo() == codigo) {
				ret = passagem;
			}
		}
		if (ret != null) {
			return ret;
		} else {
			throw new PassagemException("PASSAGEM_NAO_ENCONTRADA");
		}
	}

	
	public void removerPassagem(Passagem p) throws PassagemException, NullPointerException {

		if (p == null) {
			throw new NullPointerException("PASSAGEM_NULA");
		} else {
			try {
				if (procurarPassagem(p.getCodigo()) != null)
					passagens.remove(p);
			} catch (PassagemException e) {
				throw new PassagemException("PASSAGEM_NAO_ENCONTRADA");
			}
		}
	}

}

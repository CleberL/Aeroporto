package controllers.interfaces;


import exception.PassagemException;
import models.Passagem;

public interface InterfaceNegocioPassagem {
	
	public Passagem procurarPassagem(int codigo) throws PassagemException;
	public void adicionarPassagem(Passagem passagem);
	public void removerPassagem(Passagem passagem);
	
}

package negocios.interfaces;


import exception.NegocioPassagemException;
import models.Passagem;

public interface InterfaceNegocioPassagem {
	
	public Passagem procurarPassagem(int codigo) throws NegocioPassagemException;
	public void adicionarPassagem(Passagem passagem);
	public void removerPassagem(Passagem passagem);
	
}

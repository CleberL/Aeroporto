package negocios.interfaces;


import exception.NegocioPassagemException;
import models.Passagem;

public interface InterfaceNegocioPassagem {
	
	Passagem procurarAeronave(int codigo) throws NegocioPassagemException;
	void adicionarAeronave(Passagem passagem);
	void removerAeronave(Passagem passagem);
	
}

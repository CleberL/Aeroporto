package repositorios.interfaces;

import exception.PilotoException;
import models.Piloto;

public interface InterfaceRepositorioPiloto {

	Piloto procurar(String cpf);
	void adicionar(Piloto piloto) throws PilotoException, NullPointerException;
	void remover(Piloto piloto) throws PilotoException;
		
}

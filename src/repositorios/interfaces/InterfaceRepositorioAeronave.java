package repositorios.interfaces;

import exception.AeronaveException;
import models.Aeronave;

public interface InterfaceRepositorioAeronave {

	void adicionar(Aeronave aeronave) throws AeronaveException, NullPointerException;
	void remover(Aeronave aeronave) throws AeronaveException;
	Aeronave procurar(int codigo);
	
}

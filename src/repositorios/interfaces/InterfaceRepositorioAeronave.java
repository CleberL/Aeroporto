package repositorios.interfaces;

import exception.AeronaveException;
import models.Aeronave;

public interface InterfaceRepositorioAeronave {

	Aeronave procurarAeronave(int codigo) throws AeronaveException;
	void adicionarAeronave(Aeronave aeronave) throws AeronaveException, NullPointerException;
	void removerAeronave(Aeronave aeronave) throws AeronaveException, NullPointerException;

	
}

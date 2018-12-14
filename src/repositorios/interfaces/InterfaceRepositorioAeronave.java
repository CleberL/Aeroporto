package repositorios.interfaces;

import exception.AeronaveException;
import models.Aeronave;

public interface InterfaceRepositorioAeronave {

	Aeronave procurarAviao(int codigo) throws AeronaveException;
	void adicionarAviao(Aeronave aeronave) throws AeronaveException, NullPointerException;
	void removerAviao(Aeronave aeronave) throws AeronaveException, NullPointerException;

	
}

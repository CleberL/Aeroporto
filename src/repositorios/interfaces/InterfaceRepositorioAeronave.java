package repositorios.interfaces;

import exception.AeronaveException;
import models.Aeronave;

public interface InterfaceRepositorioAeronave {

	Aeronave procurarAviao(int codigo) throws AeronaveException;
	void adicionarAviao(Aeronave aviao) throws AeronaveException;
	void removerAviao(Aeronave aviao) throws AeronaveException;

	
}

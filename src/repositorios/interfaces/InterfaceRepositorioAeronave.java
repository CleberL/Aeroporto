package repositorios.interfaces;

import exception.AviaoException;
import models.Aeronave;

public interface InterfaceRepositorioAeronave {

	Aeronave procurarAviao(int codigo) throws AviaoException;
	void adicionarAviao(Aeronave aviao) throws AviaoException;
	void removerAviao(Aeronave aviao) throws AviaoException;

	
}

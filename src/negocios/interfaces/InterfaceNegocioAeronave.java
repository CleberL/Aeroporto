package negocios.interfaces;

import exception.NegocioAviaoException;
import models.Aeronave;

public interface InterfaceNegocioAeronave {
	
	Aeronave procurarAviao(int codigo) throws NegocioAviaoException;
	void adicionarAviao(Aeronave aeronave);
	void removerAviao(Aeronave aeronave);
	
}

package negocios.interfaces;

import exception.NegocioAviaoException;
import models.Aeronave;

public interface InterfaceNegocioAeronave {
	
	Aeronave procurarAeronave(int codigo) throws NegocioAviaoException;
	void adicionarAeronave(Aeronave aeronave);
	void removerAeronave(Aeronave aeronave);
	
}

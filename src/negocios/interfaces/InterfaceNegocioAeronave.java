package negocios.interfaces;

import exception.NegocioAeronaveException;
import models.Aeronave;

public interface InterfaceNegocioAeronave {
	
	Aeronave procurarAeronave(int codigo) throws NegocioAeronaveException;
	void adicionarAeronave(Aeronave aeronave);
	void removerAeronave(Aeronave aeronave);
	
}

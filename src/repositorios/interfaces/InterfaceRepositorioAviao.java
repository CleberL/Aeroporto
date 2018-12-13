package repositorios.interfaces;

import exception.AviaoException;
import models.Aviao;

public interface InterfaceRepositorioAviao {

	Aviao procurarAviao(int codigo);
	void adicionarAviao(Aviao aviao) throws AviaoException;
	void removerAviao(Aviao aviao) throws AviaoException;
	void editarAviao(Aviao aviao) throws AviaoException;
	
}

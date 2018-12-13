package negocios.interfaces;

import exception.NegocioAviaoException;
import models.Aviao;

public interface InterfaceNegocioAviao {
	
	Aviao procurarAviao(int codigo) throws NegocioAviaoException;
	void adicionarAviao(Aviao aviao);
	void removerAviao(Aviao aviao);
	void editarAviao(Aviao aviao);
	
}

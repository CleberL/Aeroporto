package negocios.interfaces;

import models.Aviao;

public interface InterfaceNegocioAviao {
	
	Aviao procurarAviao(int codigo);
	void adicionarAviao(Aviao aviao);
	void removerAviao(Aviao aviao);
	void editarAviao(Aviao aviao);
	
}
